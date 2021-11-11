package hu.petrik.Excersise;

import hu.petrik.Verem.LimitedStack;
import hu.petrik.Verem.Stack;

public class TukorSzoEllenorzo {

    private static String szo;
    private static Stack<String> verem;

    public static void Run(String szo) {
        TukorSzoEllenorzo.szo = szo;
        TukorSzoEllenorzo.verem = new Stack<>();
        for (int i = 0; i < szo.length()-1; i++) {
            for (int j = szo.length()-1; j > -1; j--) {
                String temp = szo.substring(i, j);
                if (j > i && j - i > 1 && TukorSzoEllenorzo.isPallindrom(temp)) {
                    System.out.println(temp+i);
                }
            }
        }
    }

    private static boolean isTukorSzo(String s) {
        boolean joE = false;
        if(s.length()>0){
            Stack<Character> elsofel = new LimitedStack<>(s.length()/2);
            for (int i = 0; i < s.length() / 2; i++) {
                elsofel.push(s.charAt(i));
            }
            int i = s.length() / 2;
            while (i < s.length() && !elsofel.isEmpty() &&elsofel.pop().equals(s.charAt(i))) {
                i++;
            }
            joE = i ==s.length();
        }
        return joE;
    }

    public static boolean isPallindrom(String s) {
        String[] irasjelek = {" ", "!", "\\?", "\\.", "'", "\"", ",", ";", "-", ":", "\n", "\t"};
        String temp = s.toUpperCase();
        for (String betu : irasjelek) {
            temp = temp.replaceAll("" + betu, "");
        }
        return TukorSzoEllenorzo.isTukorSzo(temp);
    }
}
