package clueGame;
/**
 * 
 * @author Michael Balmes and Bixler Baker
 *
 */
import java.awt.Color;
import java.util.Set;

public class ComputerPlayer extends Player {
	private Set<Card> seenCards;

	public ComputerPlayer(String name, int row, int column, Color color) {
		super(name, row, column, color);
	}
	
	public BoardCell pickLocation(Set<BoardCell> targets) {
		// TODO: this
	}
	
	public void makeAccusation() {
		// TODO: this
	}
	
	public void createSuggestion(/*TBD*/) {
		// TODO: this
	}
	
	@Override
	public void setCards(Set<Card> cards) {
		
	}
}
