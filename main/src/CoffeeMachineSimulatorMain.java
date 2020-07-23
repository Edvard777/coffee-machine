import java.util.Scanner;

public class CoffeeMachineSimulatorMain {



    //printing auctions, call checkMethod
    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String getCurrentLine = inputAction();
        CoffeeMachineSimulator coffeeMachineSimulator = new CoffeeMachineSimulator();
        coffeeMachineSimulator.checkMethod(getCurrentLine);


    }

    // method inputAction read input from console
    public static String inputAction() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        return inputString;

    }
}