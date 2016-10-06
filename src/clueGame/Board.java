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
		this.rooms = new HashMap<Character, String>();
	}
	
	public void initialize() {
		try {
			File fileinLayout = new File(boardConfigFile);
			File fileinLegend = new File(roomConfig);
			Scanner scLayout = new Scanner(fileinLayout);
			Scanner scLegend = new Scanner(fileinLegend);
			
			while (scLegend.hasNextLine()) {
				String str = scLegend.nextLine();
				String[] lineArray = str.split(", ");
				this.rooms.put(lineArray[0].charAt(0), lineArray[1]);
			}
			scLegend.close();
			
			int lineCount = 0;
			while (scLayout.hasNextLine()) {
				String str = scLayout.nextLine();
				for (int i = 0; i < str.length(); i++) {
				}
				lineCount++;
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Map<Character, String> getLegend() {
		return this.rooms;
	}
	
	public int getNumRows() {
		return this.numRows;
	}
	
	public int getNumColumns() {
		return this.numColumns;
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
