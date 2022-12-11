package PalindromChecker;

public class PalindromChecker {
    public static void main(String[] args) {
        System.out.println(check("Rentner"));
        System.out.println(check("Reliefpfeiler"));
        System.out.println(check("Rotor"));
        System.out.println(check("Erika feuert nur untreue Fakire"));
        System.out.println(check("O Genie der Herr ehre dein Ego"));
        System.out.println(check("Trug Tim eine so helle Hose nie mit Gurt"));

    }

    public static boolean check(String palindrom) {
        palindrom = palindrom.toLowerCase().replaceAll(" ","");
        System.out.println("palindrom = " + palindrom);
        if(palindrom.length()<=1) {
            return true;
        }
        if (palindrom.charAt(0) == palindrom.charAt(palindrom.length()-1)) {
            return check(palindrom.substring(1, palindrom.length() - 1));
        }
        return false;
    }

}
