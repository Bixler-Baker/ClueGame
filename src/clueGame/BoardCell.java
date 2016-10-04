package experiment;
/**
 * 
 * @author Michael Balmes and Bixler Baker
 *
 */
public class BoardCell{
	private int row, column;
	
	public BoardCell(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int Row() { return row; }
	
	public int Column() { return column; }
	
	public void setRow(int row) { this.row = row; }
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) { this.row = column; }
	@Override
	public boolean equals(Object o) {
		return ((BoardCell) o).getRow()==this.getRow()&&((BoardCell) o).getColumn()==this.getColumn();
	}
	public String toString(){
		return "["+this.getRow()+","+this.getColumn()+"]";
	}
	@Override
	public int hashCode(){
		return (this.getRow()+1)*7+(this.getColumn()+1)*14;
	}
}
