import java.util.*;

public class Question7 {
    public static void main(String[]args)
    {
        boolean ascending;
        int[] array = createArray();
        ascending = orderTest(array);
        if(ascending)
        {
            System.out.println("The array is ascending order");
            /*for(int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }*/
        }
        else
            System.out.println("The array is not in ascending order.");
    }
    public static int[] createArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers, separate different numbers by using spaces.");
        String userInput = scanner.nextLine();
        String[] strNmbrArray = userInput.split(" ");
        int[] nmberArray = new int[strNmbrArray.length];

        for(int n = 0; n < nmberArray.length; n++)
        {
            nmberArray[n] = Integer.parseInt(strNmbrArray[n]);
        }
        return nmberArray;
    }
    public static boolean orderTest(int[] orderArray)
    {
        for(int i = 1; i < orderArray.length; i++)
        {
            if(orderArray[i] < orderArray[i-1])
            {
                return false;
            }
        }
    return true;
    }


}
