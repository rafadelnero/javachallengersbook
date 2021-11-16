package com.javachallengers.collections.challenges;

import java.util.HashMap;
import java.util.Map;

public class LannisterMapChallenge {
	static int hashCodeCount = 0;
	static int equalsCount = 0;

    public static void main(String[] doYourBest) {
			Map<Lannister, String> m = new HashMap<>();
			m.put(new Lannister("Tyrion"), "I understand the way this game is played");
			m.put(new Lannister("Jaime"), "The things I do for love...");
			m.put(new Lannister("Cersei"), "When you play the game of thrones, you win "
				+ "or you die. There is no middle ground.");
			m.put(new Lannister("Tywin"), "Any man who must say, 'I am the king' is no true king.");

			System.out.printf("Size: %s equalsCount: %s hashCodeCount: %s", m.size(), equalsCount, hashCodeCount);
    }

    static class Lannister {
			String name;
			public Lannister(String name) {this.name = name;}
			public boolean equals(Object obj) {
				equalsCount++;
				return (name.equals(name));
			}
			public int hashCode() {
				hashCodeCount++;
				return 1 + 8 * 453453 / 77 + 40340403 - 3000000;
			}
    }
}