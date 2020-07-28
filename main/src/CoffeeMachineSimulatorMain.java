import java.util.Scanner;

class CoffeeMachineSimulatorMain {


        public static void main(String[] args) {
        CoffeeMachineSimulator coffeeMachineSimulator = new CoffeeMachineSimulator();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        coffeeMachineSimulator.action(input);

}


}