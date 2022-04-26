package com.javachallengers.concurrency.challenges;

public class DaemonNonDaemonBarneyBeerChallenge {
		static int barneyBeerCount;

		public static void main(String... doYourBest) throws InterruptedException {
			Thread thread1 = new Thread(() -> barneyBeerCount++);
			thread1.setDaemon(true);
			thread1.start();

			Thread thread2 = new Thread(() -> barneyBeerCount++);
			thread2.setDaemon(true);
			thread2.start();

			thread1.join();
			thread2.join();

			new Thread(() -> {
				for (;;) {
					barneyBeerCount++;
				}
			}).start();

			System.out.println(barneyBeerCount);
		}
}
