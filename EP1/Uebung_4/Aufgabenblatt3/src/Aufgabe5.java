/*
  Aufgabe 5) Rekursion
*/
public class Aufgabe5 {

    public static String orderCharGroups(String text) {

        String outOfRekursion = text;
	
        if (text.isEmpty()) {
            return "";
        } else {
            outOfRekursion = orderCharGroups(text.substring(1));

            if (outOfRekursion.length() >= 2) {
                if (text.charAt(0) == outOfRekursion.charAt(outOfRekursion.length() - 1)) {
                    outOfRekursion = outOfRekursion + text.charAt(0);
                } else {
                    outOfRekursion = text.charAt(0) + outOfRekursion;
                }
            } else {
                outOfRekursion = text;
            }
        }

        return outOfRekursion;
    }

    public static void main(String[] args) {
        System.out.println(orderCharGroups(""));
        System.out.println(orderCharGroups("1"));
        System.out.println(orderCharGroups("12"));
        System.out.println(orderCharGroups("1212"));
        System.out.println(orderCharGroups("abbaaababbaa"));
        System.out.println(orderCharGroups("ABBA"));
        System.out.println(orderCharGroups("11221122"));
        System.out.println(orderCharGroups("AAAAAA"));
        System.out.println();
    }
}
