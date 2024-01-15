import java.util.HashMap;

public class TestClass {

    static HashMap<Integer, String> hm = new HashMap<Integer, String>();


    public static void main(String[] args) {
        hm.put(1, "Anant");
        hm.put(2, "Jain");
        hm.put(3, "xyz");

        System.out.println(isValid(5));


    }

    // inout - int
    // boolean - out

    public static boolean isValid(int key) {

//        if (hm.containsKey(key)) {
//            //return true;
//        }
//        return false;

        return hm.containsKey(key);
    }
}
