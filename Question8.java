import java.util.*;
public class Question8 {
    public static void main(String[] args)
    {
        int[] firstArray = Question7.createArray();
        int[] secondArray = Question7.createArray();
        boolean isSame = sameNumbers(firstArray, secondArray) ;
        if(isSame)
        {
            System.out.println("The numbers are in both arrays");
        }
        else{
            System.out.println("The numbers are not in both arrays");
        }
    }
    public static boolean sameNumbers(int[] arrayOne, int[] arrayTwo)
    {
        boolean inboth = true;
        out:
        for(int i = 0; i < arrayTwo.length; i++)
        {
            for(int a = 0; a < arrayOne.length; a++)
            {
                if(arrayTwo[i] == arrayOne[a])
                {
                    break;
                }
                else if(a == arrayOne.length-1)
                {
                    inboth = false;
                    break out;
                }
            }
        }
        return inboth;
    }

}
