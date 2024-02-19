package practisePrograms;

import java.util.Arrays;

public class revArray {

    public static void revArray(int[] arr){
        int[] inputarry = arr;
        int[] updatearry = new int[arr.length];
        int index = 0;
        for(int i=inputarry.length-1;i>=0;i--)
        {

            updatearry[index] = inputarry[i];
            index = index+1;
        }
        for (int j=0;j <updatearry.length;j++)
        {
            System.out.println(updatearry[j]+",");
        }

    }

    public static void main(String[] args) {
        revArray(new int[]{1, 2, 3, 4, 5});
    }
}
