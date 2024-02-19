package practisePrograms;

public class ReverseNumber {

    public static void main(String[] args) {

        String reverse = "";
        String s = "Anant";
        for(int i=s.length()-1; i>=0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }
}
