import java.util.Scanner;

public class IngredientsForCoffee {
    public static void main (String[]args)
    {
        int water = 200;
        int milk = 50;
        int coffe_beans = 15;
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("For " + number +" cups of coffee you will need ");
        System.out.println(water * number+" ml of water");
        System.out.println(milk * number+" ml of milk");
        System.out.println(coffe_beans * number+" g of coffe beans" );

    }
}

