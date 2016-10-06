package clueGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Board {
	private static Board theInstance = new Board();
	private static int numRows, numColumns;
	private static BoardCell[][] board;
	private static Map<Character, String> rooms;
	private static Map<BoardCell, Set<BoardCell>> adjMatrix;
	private static Set<BoardCell> targets = new HashSet<BoardCell>();;
	private static String boardConfigFile;
	private static String roomConfig;
	
	public static int MAX_BOARD_SIZE = 0;

	private Board() {}
	
	public static Board getInstance() { return theInstance; }
	
	public void setConfigFiles(String map, String legend) {
		this.boardConfigFile = map;
		this.roomConfig = legend;
	}
	
	public void initialize() {
		try {
			File fileinLayout = new File(boardConfigFile);
			File fileinLegend = new File(roomConfig);
			Scanner scLayout = new Scanner(fileinLayout);
			Scanner scLegend = new Scanner(fileinLegend);
			
			while (scLegend.hasNextLine()) {
				// Gets room initial from legend file
				Character a = scLegend.next().charAt(0);
				// Gets room name from legend file
				String str = scLegend.next();
				str = str.substring(0, str.length() - 2);
				this.rooms.put(a, str);
				// Gets room type from legend file
				str = scLegend.next();
				str = str.substring(0, str.length() - 2);
			}
			
			while (scLayout.hasNextLine()) {
				
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Map<Character, String> getLegend() {
		return null;
	}
	
	public int getNumRows() {
		return 0;
	}
	
	public int getNumColumns() {
		return 0;
	}
	
	public BoardCell getCellAt(int row, int column) {
		return null;
	}
	
	public void calcAdjacencies() {
		adjMatrix = new HashMap<BoardCell, Set<BoardCell>>();
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				BoardCell cell = board[i][j];
				adjMatrix.put(cell, new HashSet<BoardCell>());
				if(cell.getRow()>0){
					adjMatrix.get(cell).add(board[cell.getRow()-1][cell.getColumn()]);
				}
				if(cell.getRow()<board.length-1){
					adjMatrix.get(cell).add(board[cell.getRow()+1][cell.getColumn()]);
				}
				if(cell.getColumn()>0){
					adjMatrix.get(cell).add(board[cell.getRow()][cell.getColumn()-1]);
				}
				if(cell.getColumn()<board[0].length-1){
					adjMatrix.get(cell).add(board[cell.getRow()][cell.getColumn()+1]);
				}
			}
		}
	}
	
	public void calcTargets(BoardCell cell, int pathLength) {
		
	}
	
	public Set<BoardCell> getTargets() {
		return targets;
	}
	
	public Set<BoardCell> getAdjList(BoardCell cell) {
		return adjMatrix.get(cell);
	}
	
	public BoardCell getCell(int row, int column) {
		return board[row][column];
	}
}
