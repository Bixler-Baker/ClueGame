package experiment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import clueGame.BoardCell;

public class IntBoard {
	BoardCell[][] board = new BoardCell[4][4];
	HashMap<BoardCell, HashSet<BoardCell>> adjacencies;
	HashSet<BoardCell> targetCells;
	
	public IntBoard() {
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j]=new BoardCell(i,j);
			}
		}
		calcAdjacencies();
		targetCells = new HashSet<BoardCell>();
	}
	
	public void calcAdjacencies() {
		adjacencies = new HashMap<BoardCell, HashSet<BoardCell>>();
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				BoardCell cell = board[i][j];
				adjacencies.put(cell, new HashSet<BoardCell>());
				if(cell.getRow()>0){
					adjacencies.get(cell).add(board[cell.getRow()-1][cell.getColumn()]);
				}
				if(cell.getRow()<board.length-1){
					adjacencies.get(cell).add(board[cell.getRow()+1][cell.getColumn()]);
				}
				if(cell.getColumn()>0){
					adjacencies.get(cell).add(board[cell.getRow()][cell.getColumn()-1]);
				}
				if(cell.getColumn()<board[0].length-1){
					adjacencies.get(cell).add(board[cell.getRow()][cell.getColumn()+1]);
				}
			}
		}
	}
	
	public void calcTargets(BoardCell cell, int pathLength){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(Math.abs(cell.getRow()-board[i][j].getRow())+Math.abs(cell.getColumn()-board[i][j].getColumn())==pathLength){
					targetCells.add(board[i][j]);
				}
			}
		}
	}
	
	public Set<BoardCell> getTargets() {
		return targetCells;
	}
	
	
	public Set<BoardCell> getAdjList(BoardCell cell) {
		return adjacencies.get(cell);
	}

	public BoardCell getCell(int i, int j) {
		return board[i][j];
	}
}
