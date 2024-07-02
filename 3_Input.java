import java.util.Scanner;

public class 3_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); // Dùng để đọc 1 câu

        System.out.print("Enter your university school (1 word): ");
        String university = sc.next(); // Dùng để đọc 1 từ

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.println("Hello " + fullName + ". You're " + age + " years old and you're studying at " + university + ". Your GPA is: " + gpa);

        sc.close(); // Đóng Scanner
    }
}