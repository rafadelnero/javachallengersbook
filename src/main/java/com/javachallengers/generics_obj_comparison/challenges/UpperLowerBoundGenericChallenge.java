package com.javachallengers.generics_obj_comparison.challenges;

public class UpperLowerBoundGenericChallenge {
	
		interface Zeus {}
		interface Kratos extends Zeus { }
		interface Atreus extends Kratos { }
		static class Warrior<T> {}

		public static void main(String ... doYourBest) {
			Warrior<Kratos> kratos = new Warrior<>();
			Warrior<Zeus> zeus = new Warrior<>();
			Warrior<Atreus> atreus = new Warrior<>();

			fight(kratos, zeus);
			fight(atreus, new Warrior<>());
//			fight(kratos, atreus);
      fight(zeus, kratos);

			System.out.println("Everything went fine!");
		}

	static void fight(Warrior<? extends Zeus> warrior1, Warrior<? super Kratos> warrior2) {}

}
