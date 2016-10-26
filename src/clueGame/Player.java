package clueGame;
/**
 * 
 * @author Michael Balmes and Bixler Baker
 *
 */
import java.awt.Color;
import java.util.Set;

public abstract class Player {
	private String playerName;
	private int row, column;
	private Color color;
	
	public Player(String name, int row, int column, Color color) {
		this.playerName = name;
		this.row = row;
		this.column = column;
		this.color = color;
	}
	
	public Card disproveSuggestion(Solution suggestion) {
		// TODO: this
	}
	
	public abstract void setCards(Set<Card> cards);
	
	public String getName() { return playerName; }
	
	public void setRow(int row) { this.row = row; }
	
	public int getRow() { return this.row; }
	
	public void setCol(int column) { this.column = column; }
	
	public Color getColor() { return this.color; }
}
