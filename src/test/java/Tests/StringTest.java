package Tests;

/*
* Given two input String A and B. Return True if B is a Substring of A. provided A is a circular String
Eg.1: A="qwerty" and B="erty" output = true
Eg.2: A= "qwerty" and B="rtyq" output = true  == 1
Eg.3: A= "qwerty" and B="rtyw" output = false
*
* A      B
* Q
* W
* E   == E == 2
* R   == R == 3
* T  == T
* Y  ==
*
* */
public class StringTest {

    public static void main(String[] args) {

        String strA = "qwerty";
        String strB = "rtyq";

        boolean result = isPartof(strA,strB);
        System.out.println("Result of StrB is part of Str A is : "+result);

    }

    private static boolean isPartof(String strA, String strB) {

        char[] chrArr = strA.toCharArray();
        char[] chrArrB = strB.toCharArray();
        char ch;

            int beginIndex = strA.length()-strB.length(); //2
            int endIndex = strB.length(); //4
            int indexOfSubstr =0;


            String substr = strA.substring(beginIndex,beginIndex+endIndex);
            System.out.println( "substring extraction :"+substr);
            if( substr.equalsIgnoreCase(substr))
            {
            for(int i=0; i<strA.length(); i++)
            {
                for(int j=0; j<strB.length();j++)
                {
                   if(chrArr[i]==chrArrB[j])
                   {
                        indexOfSubstr = i;
                       break;
                   }
                }
            }

            int counter = strB.length(); //4
            int remainder = 0;
            for(int k=indexOfSubstr; k<strA.length()-1;k++)
            {
                if(chrArr[k]==chrArrB[k])
                {
                    counter--;
                }else {
                    remainder = counter;
                    if(chrArr[remainder]==chrArrB[k])
                    {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            return true;
        }else
            return false;
    }

}
