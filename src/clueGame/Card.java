package clueGame;
/**
 * 
 * @author Michael Balmes and Bixler Baker
 *
 */
public class Card {
	private String cardName;
	private CardType cardType;
	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean equals() {
		// TODO: this
	}
	
	public void setName(String name) { this.cardName = name; }
	
	public String getName() { return this.cardName; }
	
	public void setType(CardType type) { this.cardType = type; }
	
	public CardType getType() { return this.cardType; }
}
