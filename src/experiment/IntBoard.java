package experiment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntBoard {
	BoardCell[][] board = new BoardCell[4][4];
	HashSet<BoardCell> adjCells;
	HashSet<BoardCell> targetCells;
	
	public IntBoard() {
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				board[i][j]=new BoardCell(i,j);
			}
		}
	}
	
	public void calcAdjacencies() {
		return;
	}
	
	public void calcTargets(BoardCell cell, int pathLength) {
		return;
	}
	
	public Set<BoardCell> getTargets() {
		return null;
	}
	
	
	public Set<BoardCell> getAdjList(BoardCell cell) {
		adjCells = new HashSet<BoardCell>();
		if(cell.getRow()>0){
			adjCells.add(board[cell.getRow()-1][cell.getColumn()]);
		}
		if(cell.getRow()<board.length-1){
			adjCells.add(board[cell.getRow()+1][cell.getColumn()]);
		}
		if(cell.getColumn()>0){
			adjCells.add(board[cell.getRow()][cell.getColumn()-1]);
		}
		if(cell.getColumn()<board[0].length-1){
			adjCells.add(board[cell.getRow()][cell.getColumn()+1]);
		}
		return adjCells;
	}

	public BoardCell getCell(int i, int j) {
		return board[i][j];
	}
}
