import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println(userInt);

        System.out.println("Enter double: ");
        userDouble = scnr.nextDouble();
        System.out.println(userDouble);

        System.out.println("Enter Character: ");
        String userStrings;
        userStrings = "zoo";
        userChar = userStrings.charAt(0);
        System.out.println(userChar);

        System.out.print("Enter String: ");
        scnr.nextLine();
        userString = scnr.nextLine();
        System.out.println(userString);


        System.out.println("" + userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println("" + userString + " " + userChar + " " + userDouble + " " + userInt);
        userInt = (int)userDouble;
        System.out.println(userDouble + " " + "cast to an integar is " + userInt);
        // TODO (3): Cast the double to an integer, and output that integer

    }
}