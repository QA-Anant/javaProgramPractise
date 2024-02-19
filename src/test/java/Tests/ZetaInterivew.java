package Tests;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZetaInterivew {
    // {1, 2, 1, 2, 3, 4, 5}

    public static void finddups(int[] arr)
    {

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        int tmp = arr[0];

        for(int i=0;i<=arr.length;i++)
        {
            int count =1;
            for(int j=i+1; j<=arr.length;j++){
                if(arr[i]==arr[j])                //- 1 (2,1,2,3,4,5)
                {
                    count = count +1;
                }
                resultMap.put(arr[i],count);
            }
            //resultMap.put(arr[i],count);
        }

        System.out.println(resultMap);

    }

    public static void main(String[] args) {

        int[] input = {1, 2, 1, 2, 3, 4, 5};
        finddups(input);
    }
}
