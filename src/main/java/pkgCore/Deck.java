package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}


	public Card Draw() throws DeckException {
		if (this.cardsInDeck.size() == 0) {
			throw new DeckException(this);
		}
			return cardsInDeck.remove(0);
	}
	

	public Card DrawSuit(eSuit s){
		for(Card card: this.cardsInDeck){
			if (card.geteSuit()==s){
				cardsInDeck.remove(card);
				return card;
			}
		}
		return null;
	}

	public Card DrawRank(eRank r){
		for(Card card: this.cardsInDeck){
			if (card.geteRank()==r){
				return card;
			}
		}
		return null;
	}

	public int DeckSuitCount(eSuit s){
		int count=0;
		for(Card card: this.cardsInDeck){
			if (card.geteSuit()==s){
			 count++;
			}
		}
		return count;
	}

	public int DeckRankCount(eRank r){
		int count=0;
		for(Card card: this.cardsInDeck){
			if (card.geteRank()==r){
			 count++;
			}
		}
		return count;
	}

	public int ifLeft(Card card){
		for(Card c: this.cardsInDeck){
			if(c==card){
				return 1;
			}
			else{
				return 0;
			}
		}
		return 0;
	}
}