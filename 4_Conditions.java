import java.util.Scanner;

public class 4_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int appropriateAge = 18;

        System.out.print("Enter your name: ");
        String yourName = sc.next();

        System.out.print("Enter your age: ");
        int yourAge = sc.nextInt();

        if (yourAge >= appropriateAge) {
            System.out.println("Congratulations! You can buy beer now!");
        }
        else {
            System.out.println("Go home, kid! You're just " + yourAge + " years old.");
        }

        // Ta có thể dùng "equals" để so sánh (Chỉ dùng được cho String và char)
        if (yourName.equals("Quan")) {
            System.out.println("BTW! I know you, Quan!");
        }
        else {
            System.out.println("You're not Quan.");
        }
    }
}