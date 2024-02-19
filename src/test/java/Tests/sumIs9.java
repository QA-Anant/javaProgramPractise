package Tests;

public class sumIs9 {
    public static void main(String[] args) {

        int arr[] = new int[]{12,2,4,8,5,7};
        int target = 9;

        for(int i=0; i < arr.length-1;i++  ) {
            if (!(arr[i] >= 9))
            {
                if((arr[i])+arr[i+1] == 9)
                {
                    System.out.println("Numbers are :"+arr[i]+" and "+arr[i+1]);
                }
            }
        }
    }
}
