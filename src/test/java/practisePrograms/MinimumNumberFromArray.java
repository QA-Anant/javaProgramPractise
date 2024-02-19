package practisePrograms;

public class MinimumNumberFromArray {

    //WAP to find minimum number from an array given below
    //int[] arr = {7,90,23,24,54};
    //Output : 7

    public static void main(String[] args) {

        int[] arr = {90,23,24,54,1000,12};
        int min = arr[0];


        for (int i =0; i < arr.length; i++)
        {
            if(arr[i] < arr[0])
            {
                arr[0] = arr[i]; //
            }
            min = arr[0];
        }
        System.out.println(min);

    }

}
