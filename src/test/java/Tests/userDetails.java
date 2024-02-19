package Tests;

import java.util.*;

public class userDetails {

    public int id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int returnSecondHighestNum(ArrayList<Integer> arr)
    {
        int[] a = new int[arr.size()];

        for(int i =0 ; i < arr.size(); i++)
        {
            a[i] = arr.get(i);
        }


        int tempVar;

        for(int i =0; i < a.length/2;i++)
        {
            for(int j = i+1; j < a.length/2;j++)
            {
                if(a[i] > a[j]){
                    tempVar = a[i];
                    a[i]= a[j];
                    a[j]= tempVar;
                }
            }
        }

        return a[arr.size()-2];

    }

    public void main(String[] args) {

        userDetails obj1 = new userDetails();
        userDetails obj2 = new userDetails();


        HashSet<userDetails> hUser1= new HashSet<userDetails>();
        hUser1.add(obj1);
        hUser1.add(obj2);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(100);
        arr1.add(50);
        arr1.add(23);
        arr1.add(45);

       int secondHighNum =  returnSecondHighestNum(arr1);
        System.out.println("Fetched Number :"+secondHighNum);

    }


}
