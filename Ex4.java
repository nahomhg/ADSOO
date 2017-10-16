import java.util.*;
public class Ex4 {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int[] userArray = makingArray();
        System.out.println("Enter your chosen target value");
        int userTargetInput = scn.nextInt();
        int indexValue = nearestValue(userArray, userTargetInput);
        System.out.println("The closest number to "+userTargetInput+" was "+userArray[indexValue]+" in place "+(indexValue));

    }
    public static int nearestValue(int[] userArray, int n)
    {
        int myNumber = 0;
        for(int i = 1; i<userArray.length;i++)
        {
            if((Math.abs(n - userArray[myNumber]) > (Math.abs(n - userArray[i])) ))
            {
                myNumber = i;
            }
        }
        return myNumber;

    }
    public static int[] makingArray()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter some numbers, please space out between two different numbers");
        String usersInput = scn.nextLine();
        String[] userInputNumbers = usersInput.split(" ");
        int[] arrayNumbers = new int[userInputNumbers.length];
        for(int i = 0; i<arrayNumbers.length; i++)
        {
            arrayNumbers[i] = Integer.parseInt(userInputNumbers[i]);
        }
        return arrayNumbers;
    }

}
