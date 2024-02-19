package Tests;

import groovy.lang.GString;

import java.util.HashMap;

public class NomuraTest {

    public static void main(String[] args) {

        String s = "abcdabce"; // find the first non repeating character



//        for(int i=0; i <= s.length()-1; i++)
//        {
//            boolean flag = false;
//            int counter = 0;
//            String x = String.valueOf(s.charAt(i));
//            //System.out.println("Checking for character :"+x);
//            for(int j=i+1; j <=s.length()-1;j++ )
//            {
//                String y = String.valueOf(s.charAt(j));
//                 if(x.equals(y))
//                     {
//                        flag = true;
//                     }
//            }
//            if(!flag )
//            {
//                System.out.println("First Non Repeating character :"+x);
//                break;
//            }
//            else {
//                //System.out.println(x+" is a repeating character");
//            }
//
//        }

        HashMap<String, Integer> hm = new HashMap<String ,Integer>();
        int counter =0;
        for(int i=0; i <= s.length()-1; i++)
        {
            if(s.charAt(i)==hm.get(i));
            hm.put(String.valueOf(s.charAt(i)),counter=counter+1);
        }
        for(int j=0; j <= hm.size(); j++) {
            System.out.println(hm.get(j));
        }
        }


}
