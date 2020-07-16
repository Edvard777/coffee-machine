import java.util.Scanner;

public class EnoughCoffeeForEveryone {
    public static void main(String[] args) {

        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;


        System.out.println("Write how many ml of water the coffee machine has:");
        Scanner scan = new Scanner(System.in);
        int inputWater = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        Scanner scan2 = new Scanner(System.in);
        int inputMilk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        Scanner scan3 = new Scanner(System.in);
        int inputCoffeeBeans = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scan4 = new Scanner(System.in);
        int inputCups = scan.nextInt();
        int a = inputWater/water;
        int b = inputMilk/milk;
        int c = inputCoffeeBeans/coffeeBeans;
        int minCup;
        if (a <= b && a <= c) //getting min value cups which can make coffee machine.
        {
            minCup = a;
        } else if (b <= c && b <= a) {
            minCup = b;
        } else {
            minCup = c;
        }


        if(minCup>inputCups)
        {
            System.out.println("Yes, I can make that amount of coffee (and even" +" "+ (minCup-inputCups)+" " + "more than that)");
        }
        else if(minCup==inputCups)
        {
            System.out.println("Yes, I can make that amount of coffee");
        }
        else
        {
            System.out.println("No, I can make only " + (minCup) +  " cup(s) of coffee");
        }


    }

}