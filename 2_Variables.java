public class 2_Variables {
    public static void main(String[] args) {
        System.out.println("2 + 4 = " + (2 + 4));
        System.out.println("2 - 4 = " + (2 - 4));
        System.out.println("2 * 4 = " + (2 * 4));
        System.out.println("2 / 4 = " + (2 / 4));

        // Integer
        int a = 100;
        int b = 200, c = 300;
        int age = 24;

        System.out.println("a + b + c = " + (a + b + c));

        System.out.println(); // Viết dòng này để cách dòng

        // String (Phải viết hoa chữ S trong String)
        String name = "Ho Manh Quan";

        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");

        System.out.println();

        // Char
        char letterH = 'H';
        char letterAfterH = 'H' + 1;

        System.out.println("This letter is " + letterH);

        System.out.println("Letter after H is " + letterAfterH);

        System.out.println();

        // Float, Double
        float floatNum = 10.5F;
        double doubleNum = 7.3; // Hoặc 7.3D

        System.out.println("floatNum / doubleNum = " + (doubleNum / floatNum));

        System.out.println();

        // Long
        int num1 = 123456789;
        int num2 = 987654321;

        System.out.println("num1 * num2 = " + ((long) num1 * num2));

        System.out.println();

        // Boolean
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue + " and " + isFalse);

        System.out.println(num1 > num2); // false
    }
}