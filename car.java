import java.util.Scanner;
public class car
{
    public static void main(String[] args)
    {
        System.out.println("Do you wanna buy a new car..?");
        Scanner scan = new Scanner(System.in);
        String test = scan.next();

        if (test.equals("yes") || test.equals("Yes")) {
            System.out.println("Which color you love the most..?(between red-blue-green-purple)");
            String test2 = scan.next();

            if (test2.equals("red"))
            {
                System.out.println("Yes we can provide it..");
            }
            else if (test2.equals("blue"))
            {
                System.out.println("Well..it's out of Stock..");
            }
            else if (test2.equals("green"))
            {
                System.out.println("can we provide it tomorrow...?");
                String test3 = scan.next();
            if (test3.equals("yes"))
            {
                System.out.println("Okay.. we'll provide you it tomorrow.");
            }
            else {
                System.out.println("No Worries..!");
            }
            }
            else if (test2.equals("purple"))
            {
                System.out.println("Well Good choice..We can order it.");
                }
            else {
                System.out.println("We don't have that color in Stock..");
            }
        }
        else {
            System.out.println("No Worries..!");
        }

    }
}
