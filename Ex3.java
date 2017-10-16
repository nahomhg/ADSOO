import java.util.*;

public class Ex3 {
    public static void main(String[]args)
    {
        //Scanner scanner = new Scanner(System.in);
        //Scanner scn = new Scanner(System.in);
        int[] originalNumbers = arrayMaker();
        int[] newArray;

        /*System.out.println("Enter some numbers, please space out between two different numbers");
        String numbers = scanner.nextLine();
        String[] usersNumbers = numbers.split(" ");
        int[] numArray = new int[usersNumbers.length];
        for(int i = 0; i<numArray.length; i++)
        {
            numArray[i] = Integer.parseInt(usersNumbers[i]);
        }*/
        System.out.println("Enter a number to be the lower number.");
        int lowestNumber = userInput();
        System.out.println("Enter a number to multiply by.");
        int multipleNumber = userInput();
        System.out.println("Original array of numbers: ");
        displayArray(originalNumbers);
        newArray = constructiveChange(lowestNumber,multipleNumber,originalNumbers);
        System.out.println("The new constructed array");
        displayArray(newArray);

    }
    public static void displayArray(int[] userNumbers)
    {
        for(int i = 0; i<userNumbers.length; i++)
        {
            System.out.println(userNumbers[i]+ " ");
        }
    }
    public static int[] constructiveChange(int lowNum, int multiply, int[] array)
    {
        int[] construcArray = new int[array.length];
        int i = 0;
        do{
            if(array[i] < lowNum)
            {
                construcArray[i] = array[i]*multiply;
            }
            else{
                construcArray[i] = array[i];
            }
            i++;
        }while(i<array.length);
        return construcArray;
    }
    public static int[] destructiveChange(int lowNum, int multiply, int[] array)
    {
        int i = 0;
        do{
            if(array[i] < lowNum) {
                array[i] *= multiply;
            }
        }while(i<array.length);
        return array;
    }
    public static int userInput()
    {
        Scanner input = new Scanner(System.in);
        int usersInput =  input.nextInt();
        return usersInput;

    }
    public static int[] arrayMaker()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some numbers, please space out between two different numbers");
        String userInput = scanner.nextLine();
        String[] usersNumbers = userInput.split(" ");
        int[] numbers = new int[usersNumbers.length];
        for(int i = 0; i<numbers.length; i++)
        {
            numbers[i] = Integer.parseInt(usersNumbers[i]);
        }
        return numbers;
    }


}

