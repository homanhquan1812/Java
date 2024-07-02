import java.util.Scanner;

public class 6_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] stringInArray =  {"Ho", "Manh", "Quan"};
        int[] intInArray = {1, 2, 3, 4, 5};

        System.out.print("stringInArray has " + stringInArray.length + " members and intInArray has " + intInArray.length + " members.");

        System.out.println();

        // Dùng cấp phát động
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Bài tập tính Sum phần tử từ Array 2 chiều
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        int[][] array_2 = new int[m][n];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter array_2[" + i + "][" + j + "]: ");
                array_2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                sum += array_2[i][j];
            }
        }

        System.out.print("Sum is: " + sum);
    }
}