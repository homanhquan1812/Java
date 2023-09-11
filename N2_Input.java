import java.util.Scanner;

public class N2_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int age = sc.nextInt();
        double score = sc.nextDouble();

        char a = (char)(sc.next().charAt(0) + 1);

        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Your first name is: " + firstName);
        System.out.println("Your last name is: " + lastName);
        System.out.println("Your age is: " + age);
        System.out.println("Your IELTS Test Score is: " + score);

        System.out.println(a);

        System.out.println(b > c);

        sc.close();
    }
}