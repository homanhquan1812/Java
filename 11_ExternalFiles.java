import src2.Animal;

public class 11_ExternalFiles {

    public static class Adder {
        public static int add(int a, int b) {
            return a + b;
        }

        public static double add(double a, double b, double c) {
            return a + b + c;
        }
    }
    public static void main(String[] args) {

        Animal myDog = new Animal();
        myDog.makeSound();
        Animal myCat = new Animal();
        myCat.makeSound();
        System.out.println("1 + 2 = " + Adder.add(1, 2));
        System.out.println("1.1 + 2.2 + 3.3 = " + Adder.add(1.1, 2.2, 3.3));
    }
}