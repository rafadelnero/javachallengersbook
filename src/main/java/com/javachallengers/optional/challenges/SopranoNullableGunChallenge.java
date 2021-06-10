package com.javachallengers.optional.challenges;

import java.util.Optional;

public class SopranoNullableGunChallenge {
	public static void main(String... args) {
		Soprano soprano = new Soprano();

		Optional.of(soprano)
				.map(Soprano::getName)
				.map(String::toUpperCase)
				.filter(n -> n.contains("Tony"))
				.ifPresentOrElse(System.out::println,
				() -> System.out.println("No value!"));

		String sopranoGun = Optional.of(soprano)
				.flatMap(Soprano::getGun)
				.map(String::toLowerCase)
				.filter(g -> g.equals("Beretta"))
				.or(Optional::empty)
		.orElse("Colt");

		System.out.println(sopranoGun);
	}

	static class Soprano {
		String name = "Tony";
		String gun = "Beretta";
		public String getName() { return name; }
		public Optional<String> getGun() { return Optional.of(gun); }
	}

}