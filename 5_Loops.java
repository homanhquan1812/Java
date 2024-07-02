import java.util.Scanner;

public class 5_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. For
        System.out.print("Enter a positive number for j: ");
        int j =  sc.nextInt();

        for (int i = 0; i < j; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Enter a negative number for k: ");
        int k =  sc.nextInt();

        for (int i = 10; i >= k; i-=2) {
            System.out.print(i + " ");
        }

        System.out.println();

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.print("Total sum from 1 to 100 is: " + sum);

        System.out.println();

        System.out.print("Enter a symbol: ");
        String symbolInput = sc.next(); // Không được dùng sc.nextLine(), sẽ gặp lỗi
        char symbol =  symbolInput.charAt(0);

        for (int i = 0; i < 10; i++) {
            for (int n = 0; n < 10; n++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        System.out.println();

        
        // 2. While
        int whileNum = 10;

        while (whileNum > 0) {
            System.out.print(whileNum + " ");
            whileNum--;
        }

        System.out.println();


        // 3. Do While
        int dowhileNum = 10;

        do {
            System.out.print(dowhileNum + " ");
            dowhileNum--;
        } while (dowhileNum > 0);

        System.out.println();


        // 4. Break, Continue
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                break; // Đến 10 sẽ ngắt Loop
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; // Skip các số chia hết cho 2
            }
            System.out.print(i + " ");
        }
    }
}