package experiment;

import java.util.Set;

public class IntBoard {
	// TODO: create data structures for board storage (adjacency list, visited, targets, grid)
	
	public IntBoard() {
		
	}
	
	public void calcAdjacencies() {
		return;
	}
	
	public void calcTargets(int startCell, int pathLength) {
		return;
	}
	
	public Set<BoardCell> getTargets() {
		return null;
	}
	
	public Set<BoardCell> getAdjList(BoardCell cell) {
		return null;
	}
	
	public BoardCell getCell(int row, int column) {
		BoardCell cell = new BoardCell(row, column);
		return cell;
	}
}
