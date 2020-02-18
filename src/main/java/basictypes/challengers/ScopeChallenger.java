package basictypes.challengers;

public class ScopeChallenger {

    public static void main(String... doYourBest) {
        boolean isHomerFat = true;

        {
            String homerFavoriteBeer = "Duff";
        }

        if (isHomerFat) {
            String homerFavoriteFood = "Doughnuts";
            for (int beersQuantity = 0; beersQuantity <= 10; beersQuantity++)
                if (isHomerFat)
                    System.out.println("Replace Code here...");
        }
    }

}
