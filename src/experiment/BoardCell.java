package experiment;
/**
 * 
 * @author Michael Balmes and Bixler Baker
 *
 */
public class BoardCell {
	private int row, column;
	
	public BoardCell(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int Row() { return row; }
	
	public int Column() { return column; }
	
	public void setRow(int row) { this.row = row; }
	
	public void setColumn(int column) { this.row = column; }
}
