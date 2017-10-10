package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test (expected = DeckException.class)
	public void TestEmptyDeck() throws DeckException{
		Deck d0 = new Deck();
		for (int i = 0;i < 54; i++) {
			d0.Draw();
		}
	}
	
	@Test
	public void TestDrawSuit() throws DeckException {		
		Deck d1= new Deck();
		Card c1= d1.DrawSuit(eSuit.HEARTS);
		assertEquals(c1.geteSuit(),eSuit.HEARTS);
		}

	
	@Test
	public void TestDrawRank() throws DeckException {
		Deck d2= new Deck();
		Card c2= d2.DrawRank(eRank.ACE);
		assertTrue(c2.geteRank() == eRank.ACE);
	}
	
	@Test
	public void TestDeckRankCount() {
		Deck d3= new Deck();
		assertEquals(d3.DeckRankCount(eRank.QUEEN),4);
	}
	
	@Test
	public void TestDeckSuitCount() {
		Deck d4= new Deck();
		assertEquals(d4.DeckSuitCount(eSuit.DIAMONDS),13);
	}

}

