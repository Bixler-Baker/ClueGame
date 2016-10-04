package clueGame;

import java.util.Map;

public class Board {
	private static Board theInstance = new Board();
	
	private Board() {}
	
	public static Board getInstance() { return theInstance; }
	
	public void setConfigFiles(String map, String legend) {
		
	}
	
	public void initialize() {
		
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
}
