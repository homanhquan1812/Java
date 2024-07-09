public class 10_OOP_Advanced {
    // Inheritance
    public static class Animal1 {
        private final String name;

        public Animal1 (String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println(name + " is eating");
        }
    }

    public static class Dog extends Animal1 {
        public Dog (String name) {
            super(name);
        }

        public void bark() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal1 {
        public Cat (String name) {
            super(name);
        }

        public void meow() {
            System.out.println("Meow");
        }
    }

    // Encapsulation
    public static class Student {
        private String name;
        private int age;
        // Constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void Information() {
            System.out.println("My name is " + name + " and I'm " + age + " years old.");
        }
    }

    // Polymorphism (Java only supports method overriding)
    public static class Animal2 {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    // a. Method overriding
    public static class Dog2 extends Animal2 {
        @Override
        public void makeSound() {
            System.out.println("Dog makes a sound");
        }
    }
    public static class Adder {
        public static int add(int a, int b) {
            return a + b;
        }

        public static double add(double a, double b, double c) {
            return a + b + c;
        }
    }

    // Abstraction
    // a. Abstract Class
    public abstract static class Animal {
        public abstract void makeSound();

        public void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    public static class Dog3 extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // b. Interface
    public interface Animal4 {
        void makeSound();
    }

    public static class Dog4 implements Animal4 {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        // Inheritance
        Dog myDog = new Dog("Dog");
        Cat myCat = new Cat("Cat");

        myDog.bark();
        myDog.eat();
        myCat.meow();
        myCat.eat();

        // Encapsulation
        Student student2 = new Student("Ho Manh Quan", 24); // Object
        student2.Information();
        student2.setName("Hồ Mạnh Quân");
        student2.setAge(26);
        System.out.println("After new update, your information includes name and age: " + student2.getName() + " and " + student2.getAge() + " respectively.");

        // Polymorphism
        // a. Method overriding
        Animal2 myDog2 = new Animal2();
        myDog2.makeSound();
        System.out.println("1 + 2 = " + Adder.add(1, 2));
        System.out.println("1.1 + 2.2 + 3.3 = " + Adder.add(1.1, 2.2, 3.3));

        // Abstraction
        // a. Abstract class
        Dog3 myDog3 = new Dog3();
        myDog3.makeSound();
        myDog3.sleep();
        // b. Interface
        Dog4 myDog4 = new Dog4();
        myDog4.makeSound();
    }
}