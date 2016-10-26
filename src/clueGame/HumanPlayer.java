package clueGame;
/**
 * 
 * @author Michael Balmes and Bixler Baker
 *
 */
import java.awt.Color;
import java.util.Set;

public class HumanPlayer extends Player {
	private Set<Card> myCards;
	
	public HumanPlayer(String name, int row, int column, Color color) {
		super(name, row, column, color);
	}

	@Override
	public void setCards(Set<Card> cards) {
		
	}
}
