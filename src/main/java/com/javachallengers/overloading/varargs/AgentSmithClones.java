package com.javachallengers.overloading.varargs;

public class AgentSmithClones {

    public static void main(String... varargs) {
       createClones("smith1", "smith2", "smith3", "smith4");
    }

    static void createClones(String ...agentSmiths) {
        for (String agentSmith: agentSmiths) {
            System.out.printf(agentSmith);
        }
    }

}
