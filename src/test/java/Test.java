import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) {


        String[] str = new String[]{"anant", "sdet", "contest", "test", "sdetcontest", "sdet", "contest"};


        HashMap<String , Integer> hm= new HashMap<String,Integer>();

        int counter = 0;
        for(int a= 0; a < str.length; a++)
        {

            for (int b = a+1; b < str.length; b++){
                if(str[a].equals(str[b]))
                {
                    counter++;
                }
            }
            hm.put(str[a],counter);
            counter = 0;

        }

        System.out.println("Occurences :"+  hm.toString());
//        for (int b =0; b < hm.size();b++)
//        {
//
//        }






//
//        List<String> arr1 = new ArrayList<>();
//
//         for(int i=0; i < str.length;i++)
//         {
//             arr1.add(str[i]);
//
//
//
//
//         }
//
////        Collections.sort(arr1);
////
////        System.out.println(arr1);
////
//
//        String temp = "" ;
//        for (int i=0; i < arr1.size();i++)
//        {
////            for(int j=i+1; j < arr1.size();j++)
////            {
//
//                char c1 = arr1.get(i).charAt(0);
//                char c2 = arr1.get(i+1).charAt(0);
//
////                System.out.println("char 1 :"+c1);
////                System.out.println("char 2 :"+c2);
//
//                if(c1 > c2)
//                {
//                    //temp = str[i];
//                    //str[i] = str[j];
//                    //str[j] = temp;
//
//                    temp = arr1.get(i);
//                    arr1.add(i,arr1.get(i+1));
//                    arr1.add(i+1,temp);
//
//                }
//            //}
//        }
//
//        System.out.println("Sorted String array : "+arr1);
//
//
//
//




    }
}
