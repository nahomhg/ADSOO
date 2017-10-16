import java.util.*;

public class Ex6 {
    public static void main(String[]args)
    {
        int[] userArray = createArray();
        System.out.println("Enter target value");
        Scanner scn = new Scanner(System.in);
        int targetNumber = scn.nextInt();
        int[] lastArray = numbersAllowed(userArray,targetNumber);
        System.out.println("This is the new array:\n");
        for(int i = 0; i<lastArray.length;i++)
        {
            System.out.println(lastArray[i]+", ");
        }

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

    public static int[] numbersAllowed(int[] firstArray, int n)
    {
        ArrayList<Integer> numbersTaken = new ArrayList<Integer>();

        int i = 0;
        for(int a = 0; a < firstArray.length; a++)
        {
            if(firstArray[a] < n)
            {
                numbersTaken.add(firstArray[a]);
            }

        }

        int[] updatedArray = new int[numbersTaken.size()];

        for (int m = 0; m < updatedArray.length; m++) {
                updatedArray[m] = numbersTaken.get(m);
            }
        return updatedArray;
    }

}
