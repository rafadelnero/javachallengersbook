package basictypes.challengers;

public class BreakingBadChallenger {

	public static void main(String... doYourBest) {
		int formulaNumber = 10;

		String heisenbergFormula = "";

		switch (formulaNumber) {
		case 1:
			heisenbergFormula += "H";
		case 10:
			heisenbergFormula += "Ne";
		case 30:
			heisenbergFormula += "Zn";
		case 25:
			heisenbergFormula += "Mn";
			break;
		default:
			heisenbergFormula += "He";
		}

		System.out.println(heisenbergFormula);
	}

}
