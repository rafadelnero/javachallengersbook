package com.javachallengers.basicoo.challengers;

public class LinkAdventure {
    public static void main(String... doYourBest) {
        int[] linkOcarinaOfTimeLevels = new int[5];
        linkOcarinaOfTimeLevels[0] = 0;
        linkOcarinaOfTimeLevels[1] = 2;
        linkOcarinaOfTimeLevels[2] = 4;
        linkOcarinaOfTimeLevels[3] = 6;
        linkOcarinaOfTimeLevels[4] = 8;

        int[] linkMajorasMaskLevels = linkOcarinaOfTimeLevels;

        LinkAdventure linkAdventure = new LinkAdventure();
        linkAdventure.slayMonsters(linkOcarinaOfTimeLevels);
        linkAdventure.slayMonsters(linkMajorasMaskLevels);

        for (int eachLinkLevel : linkOcarinaOfTimeLevels) {
            System.out.print(eachLinkLevel + " ");
        }
    }
    private void slayMonsters(int[] linkLevels) {
        for (int i = 0; i < linkLevels.length; i++) {
            linkLevels[i] = linkLevels[i] + 2;
        }
    }
}
