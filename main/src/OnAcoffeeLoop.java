import java.util.Scanner;

public class OnAcoffeeLoop {

//declaring our class variables
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
    static String exit = "exit";
    static String remaining = "remaining";
    static String back = "back";


    public static void action ()  // method action asks to user what he can do (buy, fill, take, see remaining,or exit)
    {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner scan = new Scanner(System.in);
        String actionType = scan.nextLine();

        if (buy.equals(actionType)) {
            buy();
        } else if (fill.equals(actionType)) {
            fill();
        } else if (take.equals(actionType)) {
            take();
        } else if (remaining.equals(actionType)) {
            remaining();
        }
        else if(exit.equals(actionType))
        {
            exit();
        }
    }

    public static void buy ()   //method buy asks to input which coffee wants to make,or if change the mind type back
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
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
        else if (back.equals(coffeeType))
        {
            action();
        }

    }

    public static void espresso ()          //method espresso which checks if available ingredients, makes a coffee,
                                            //if not asks user what part of ingredient is missing:
    {
        if(water>=250 && coffeeBeans>=16 && disCups!=0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -=250;
            coffeeBeans -=16;
            money +=4;
            disCups-=1;
            action();
        }
        else if(water<250)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(coffeeBeans<16)
        {
            System.out.println("Sorry, not enough Coffee Beans!");
        }
        else if(disCups==0)
        {
            System.out.println("Sorry, not enough disposable cups");

        }
        action();

    }

    public static void cappuccino ()       //method cappuccino which checks if available ingredients, makes a coffee,
                                           //if not asks user what part of ingredient is missing:
    {
        if(water>=200 && milk>=100 && coffeeBeans>=12 && disCups!=0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            money += 6;
            disCups -= 1;
            action();
        }
        else if(water<200)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk<100)
        {
            System.out.println("Sorry, not enough milk!");
        }
        else if(coffeeBeans<12)
        {
            System.out.println("Sorry, not enough coffee beans!");
        }
        else if(disCups==0)
        {
            System.out.println("Sorry, not enough disposable cups");
        }
        action();
    }
    public static void latte ()     //method latte which checks if available ingredients, makes a coffee,
                                    //if not asks user what part of ingredient is missing:
    {
        if(water>=350 && milk>=75 && coffeeBeans>=20 && disCups!=0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            money += 7;
            disCups -= 1;
            action();
        }
        else if(water<350)
        {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk<75)
        {
            System.out.println("Sorry, not enough milk");
        }
        else if(coffeeBeans<20)
        {
            System.out.println("Sorry, not enough coffee beans");
        }
        else if(disCups==0)
        {
            System.out.println("Sorry, not enough disposable cups");
        }
        action();
    }

    public static void fill ()  //method fill asks to user how much ingredients wants to add to coffee machine
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
        action();
    }


    public static void take ()   // method take gives money from coffee machine to owner
    {
        System.out.println("I gave you " + money +"$");
        money = 0;
        action();
    }

    public static void remaining()   //method remaining gives user how much ingredients and money is available
    {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk+ " of milk\n" +
                coffeeBeans+ " of coffee beans\n" +
                disCups +" of disposable cups\n" +
                money+ " of money\n");
        action();

    }

    public static void exit()  // method exit terminate the program

    {
        Scanner scaner = new Scanner(System.in);
        String exitAction = scaner.nextLine();
        if(exitAction.equals(exit))
        {
            System.exit(0);
        }
    }




    public static void main(String[] args) {

        remaining();
        action();

    }
}

