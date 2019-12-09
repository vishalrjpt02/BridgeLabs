package com.blbz.deckofcard;

import com.blbz.deckofcard.Util.MyQueue;

public class Player {
	
	MyQueue<Card> cardsQue;
	int[][] playerCards;
	
	public Player() {
		cardsQue = new MyQueue<Card>();
		playerCards = new int[4][13];
	}
	
	public void addCard(int suit, int rank) {
		playerCards[suit][rank] = 1;
	}
	
	public Card getCard() {
		return cardsQue.dequeue();
	}
	
	/** Enqueues cards in ascending order **/
	public void enqueueCards() {
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				if(playerCards[suit][rank] == 1) {
					cardsQue.enqueue(new Card(suit, rank));
				}								
			}			
		}
	}
}

}
