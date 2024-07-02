public class 7_Functions {
    public static void PrintSomething() {
        System.out.println("I'm from PrintSomething().");
    }

    public static int SumOfThreeNumbers_1(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int SumOfThreeNumbers_2(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
    
    public static void main(String[] args) {
        PrintSomething();

        int[] arr1 = {2, 3, 4};
        int[] arr2 = {3, 4, 5};

        System.out.println(SumOfThreeNumbers_1(1, 2, 3));

        System.out.println(SumOfThreeNumbers_2(arr1));
        System.out.println(SumOfThreeNumbers_2(arr2));
    }
}