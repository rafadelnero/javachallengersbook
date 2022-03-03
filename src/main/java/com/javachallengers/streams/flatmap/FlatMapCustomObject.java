package com.javachallengers.streams.flatmap;

import java.util.List;

public class FlatMapCustomObject {

    public static void main(String[] args) {
        List<Player> psgPlayers = List.of(new Player("Lionel Messi", 34, 679),
                new Player("Neymar", 30, 401));
        List<Player> manchesterUnited = List.of(new Player("Cristiano Ronaldo", 37, 801),
                new Player("Jadon Sancho", 21, 50));

        List<FootballClub> footballClubs = List.of(new FootballClub("Paris Saint-Germain", psgPlayers),
                                                    new FootballClub("Manchester United", manchesterUnited));

        footballClubs.stream()
//                .map(f -> f.getPlayers())
                .map(FootballClub::getPlayers)
                .flatMap(List::stream)
                .filter(p -> p.getGoalsCount() > 500)
                .forEach(System.out::println);
    }

}

class FootballClub {
    String name;
    List<Player> players;

    FootballClub(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

class Player {
    String name;
    int age;
    int goalsCount;

    Player(String name, int age, int goalsCount) {
        this.name = name;
        this.age = age;
        this.goalsCount = goalsCount;
    }

    public int getGoalsCount() {
        return goalsCount;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", goalsCount=" + goalsCount +
                '}';
    }
}

