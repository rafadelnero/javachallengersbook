package basictypes.variablescoping;

public class IfBlockVariable {

    public static void main(String[] hangover) {
        if (true) {
            int allanHangoverAge = 40; // This variable is only visible in the ‘if’ block
        }

        // System.out.println(allanHangoverAge); We can’t access allanHangoverAge variable here
    }

}
