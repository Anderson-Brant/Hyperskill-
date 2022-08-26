
import java.util.*;


public class CoffeeMachine {
        static int dollars = 550;
        static int water = 400;
        static int milk = 540;
        static int coffeeBeans = 120;
        static int disposableCups = 9;
        static int coffeeChoice;
        static Scanner input = new Scanner(System.in);
        static String coffee = "";

        public static void main(String[] args) {
                System.out.println("buy, fill, take, remaining, or exit - shutdown: ");
                userInput();
        }
        public static void userInput() {
                while (!(coffee.equals("exit"))) {

                        coffee = input.nextLine();
                        if (coffee.equals("buy")) {
                                Buy();
                                System.out.println("buy, fill, take, remaining, or exit - shutdown: ");
                        }
                        if (coffee.equals("fill")) {
                                Fill();
                                System.out.println("buy, fill, take, remaining, or exit - shutdown: ");
                        }
                        if (coffee.equals("take")) {
                                System.out.println("I gave you $" + dollars);
                                dollars -= dollars;
                                System.out.println("buy, fill, take, remaining, or exit - shutdown: ");
                        }
                        if (coffee.equals("remaining")) {
                                MachineStatus();
                                System.out.println("buy, fill, take, remaining, or exit - shutdown: ");
                        }

                }
                System.out.println("Goodbye");
        }
        public static void Espresso() {
                if (coffeeBeans < 12 || milk < 1){
                        System.out.println("Not enough resources, please add more coffee beans and milk");
                }else {
                        System.out.println("I have enough resources, to make you a coffee!");
                        dollars += 4;
                        water -= 250;
                        coffeeBeans -= 16;
                        disposableCups -= 1;
                }

        }
        public static void Latte() {
                if (coffeeBeans < 12 || milk < 1) {
                        System.out.println("Not enough resources, please add more coffee beans and milk");
                } else {
                        System.out.println("I have enough resources, to make you a coffee!");
                        dollars += 7;
                        water -= 350;
                        milk -= 75;
                        coffeeBeans -= 20;
                        disposableCups -= 1;
                }
        }
        public static void Cappuccino() {
                if (coffeeBeans < 12 || milk < 1){
                        System.out.println("Not enough resources, please add more coffee beans and milk");
                }else {
                        System.out.println("I have enough resources, to make you a coffee!");
                        dollars += 6;
                        water -= 200;
                        milk -= 100;
                        coffeeBeans -= 12;
                        disposableCups -= 1;
                }
        }
        public static void Fill() {
                System.out.println("How much water do you want to add: ");
                water += input.nextInt();
                System.out.println("How much milk do you want to add: ");
                milk += input.nextInt();
                System.out.println("How much coffee do you want to add: ");
                coffeeBeans += input.nextInt();
                System.out.println("How much disposable cups do you want to add: ");
                disposableCups += input.nextInt();
                //MachineStatus();
        }
        public static void MachineStatus() {
                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(coffeeBeans + " g of coffee beans");
                System.out.println(disposableCups + " disposable cups");
                System.out.println("$" + dollars + " of money\n");
        }
        public static void Buy() {
                System.out.println("1 - Espresso || 2 - Latte || 3 - Cappuccino || 4 - back - main menu");
                coffeeChoice = input.nextInt();

                        if (coffeeChoice == 1) {
                                Espresso();
                        }
                        if (coffeeChoice == 2) {
                                Latte();
                        }
                        if (coffeeChoice == 3) {
                                Cappuccino();
                        }
                        if (coffeeChoice == 4) {
                                System.out.println();
                        }
                }
        }

