import java.util.Scanner;

public class ActualCoffeeMachine {
    public static void main(String[] args) {

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disCups = 9;
        int money = 550;
        String buy = "buy";
        String fill = "fill";
        String take = "take";
        String espresso = "1";
        String latte = "2";
        String cappuccino = "3";

        System.out.println("The coffee machine has:\n" +
                "400 of water\n" +
                "540 of milk\n" +
                "120 of coffee beans\n" +
                "9 of disposable cups\n" +
                "550 of money\n" +
                "Write action (buy, fill, take):\n");

        Scanner scan = new Scanner(System.in);
        String actionType = scan.nextLine();
        if (buy.equals(actionType))
        {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            Scanner scaner = new Scanner(System.in);
            String coffeeType = scan.nextLine();
            if(espresso.equals(coffeeType))
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
            else if(cappuccino.equals(coffeeType))
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
            else if(latte.equals(coffeeType))
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
        }
        else if(fill.equals(actionType))
        {
            System.out.println("Write how many ml of water do you want to add:");
            Scanner scanner = new Scanner(System.in);
            int inputWater = scan.nextInt();
            water +=inputWater;
            System.out.println("Write how many ml of milk do you want to add:");
            Scanner scanner2 = new Scanner(System.in);
            int inputMilk = scan.nextInt();
            milk +=inputMilk;
            System.out.println("Write how many grams of coffee beans do you want to add:");
            Scanner scanner3 = new Scanner(System.in);
            int inputCoffeeBeans = scan.nextInt();
            coffeeBeans +=inputCoffeeBeans;
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            Scanner scanner4 = new Scanner(System.in);
            int inputDisCups = scan.nextInt();
            disCups +=inputDisCups;
            System.out.println("The coffee machine has:\n" +
                    water + " of water\n" +
                    milk+ " of milk\n" +
                    coffeeBeans+ " of coffee beans\n" +
                    disCups +" of disposable cups\n" +
                    money+ " of money\n");

        }
        else if(take.equals(actionType))
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



    }
}
