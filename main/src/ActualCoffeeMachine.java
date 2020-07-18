import java.util.Scanner;

public class ActualCoffeeMachine {    //declaring our variables
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disCups = 9;
    static int money = 550;
    static String buy = "buy";
    static String fill = "fill";
    static String take = "take";
    static String espresso = "1";
    static String latte = "2";
    static String cappuccino = "3";


    public static void espresso ()          //method espresso with actions when buying espresso coffee
    {
        water -=250;
        coffeeBeans -=16;
        money +=4;
        disCups-=1;
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                coffeeBeans+ " of coffee beans\n" +
                disCups +" of disposable cups\n" +
                money+ " of money\n");
    }

    public static void cappuccino ()       ////method cappuccino with actions when buying cappuccino coffee
    {
        water -=200;
        milk-=100;
        coffeeBeans -=12;
        money +=6;
        disCups-=1;
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                coffeeBeans+ " of coffee beans\n" +
                disCups +" of disposable cups\n" +
                money+ " of money\n");
    }
    public static void latte ()     ////method latte with actions when buying latte coffee
    {
        water -=350;
        milk -=75;
        coffeeBeans -=20;
        money +=7;
        disCups-=1;
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                coffeeBeans+ " of coffee beans\n" +
                disCups +" of disposable cups\n" +
                money+ " of money\n");
    }


    public static void buy ()   //method buy if input action is right(1 or 2 or 3) it will sell coffee
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner scaner = new Scanner(System.in);
        String coffeeType = scaner.nextLine();
        if(espresso.equals(coffeeType))
        {
            espresso();
        }
        else if (cappuccino.equals(coffeeType))
        {
            cappuccino();
        }
        else if (latte.equals(coffeeType))
        {
            latte();
        }
    }


    public static void fill ()  //method fill(if right).asks how much ingredients want to add to coffee machine
    {
        System.out.println("Write how many ml of water do you want to add:");
        Scanner scanner = new Scanner(System.in);
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        Scanner scanner2 = new Scanner(System.in);
        milk += scanner2.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        Scanner scanner3 = new Scanner(System.in);
        coffeeBeans += scanner3.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        Scanner scanner4 = new Scanner(System.in);
        disCups += scanner4.nextInt();
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                coffeeBeans+ " of coffee beans\n" +
                disCups +" of disposable cups\n" +
                money+ " of money\n");
    }


    public static void take ()   // method take gives money from coffee machine to owner
    {
        System.out.println("I gave you " + money +"$");
        money = 0;
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                coffeeBeans+ " of coffee beans\n" +
                disCups +" of disposable cups\n" +
                money+ " of money\n");
    }

    public static void main(String[] args) {



        System.out.println("The coffee machine has:\n" +
                "400 of water\n" +
                "540 of milk\n" +
                "120 of coffee beans\n" +
                "9 of disposable cups\n" +
                "550 of money\n" +
                "Write action (buy, fill, take):\n");
        Scanner scan = new Scanner(System.in);
        String actionType = scan.nextLine();
        if(buy.equals(actionType))
        {
            buy ();
        }
        else if (fill.equals(actionType))
        {
            fill();
        }
        else if (take.equals(actionType))
        {
            take();
        }

    }
}
