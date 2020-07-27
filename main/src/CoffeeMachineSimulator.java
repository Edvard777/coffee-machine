import java.util.Scanner;

class CoffeeMachineSimulator {

    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int disCups = 9;
    private int money = 550;
    private Scanner enter = new Scanner(System.in);

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getDisCups() {
        return disCups;
    }

    public void setDisCups(int disCups) {
        this.disCups = disCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Scanner getEnter() {
        return enter;
    }

    public void setEnter(Scanner enter) {
        this.enter = enter;
    }

    /**
     * action method make loop, and asks user to choose action:
     * @param input
     */

     void action(String input) {
        while (!input.equals("exit")) {
            switch (input) {
                case "buy":
                    buy(enter);
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    input = enter.nextLine();
                    break;
                case "fill":
                    fill();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    input = enter.nextLine();
                    break;
                case "take":
                    take();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    input = enter.nextLine();
                    break;
                case "remaining":
                    remaining();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    input = enter.nextLine();
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }

    }


    /**
     * method buy asks to choose which coffee wants to make
     */
    private void buy(Scanner buy) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = enter.nextLine();
        switch (coffeeType) {
            case "1":
                espresso();
                break;
            case "3":
                cappuccino();
                break;
            case "2":
                latte();
                break;
            case "back":
                break;

        }


    }

    /**
     * method espresso at first checks availability of ingredients and then make coffee
     * if one of ingredients missing machine say about that:
     */
    private void espresso() {
        if (this.water>= 250 && coffeeBeans >= 16 && disCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            coffeeBeans -= 16;
            money += 4;
            disCups -= 1;

        } else if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough Coffee Beans!");
        } else if (disCups == 0) {
            System.out.println("Sorry, not enough disposable cups");

        }


    }

    /**
     * method cappuccino at first checks availability of ingredients and then make coffee
     * if one of ingredients missing machine say about that:
     */
    private void cappuccino() {
        if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && disCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            money += 6;
            disCups -= 1;
        } else if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disCups == 0) {
            System.out.println("Sorry, not enough disposable cups");
        }
    }

    /**
     * method latte at first checks availability of ingredients and then make coffee
     * if one of ingredients missing machine say about that:
     */
    private void latte() {
        if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && disCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            money += 7;
            disCups -= 1;
        } else if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk");
        } else if (coffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans");
        } else if (disCups == 0) {
            System.out.println("Sorry, not enough disposable cups");
        }
    }

    /**
     * method fill asks user how much of ingredient wants to fill:
     */
    private void fill() {
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
    }

    /**
     * method take gives money from coffee machine:
     */
    private void take() {
        System.out.println("I gave you " + money + "$");
        money = 0;
    }

    /**
     * method remaining prints quantity of all ingredients:
     */
    private void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                disCups + " of disposable cups\n" +
                money + " of money\n");

    }



}