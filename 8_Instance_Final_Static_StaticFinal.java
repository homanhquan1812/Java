public class TestCode {
    // Instance: Được gọi là biến thể hiện (không gồm static hay final)
    public static void instanceExample() {
        // Biến instance
        int instanceVar = 10;
    
        System.out.println("instanceVar is: " + instanceVar);
    }


    // Final: Dùng để chỉ định 1 biến/1 phương thức/1 lớp không thể thay đổi sau khi khởi tạo
    public static void finalExample_variables() {
        // Biến final
        final double PI = 3.141592654;
        System.out.println("Pi is approximately: " + PI);
    }
    public static class finalExample_methods {
        // Phương thức Final
        // Phương thức này không thể bị ghi đè bởi các lớp con như là finalExample_methods_derivedClass bên dưới.
        public final void Math() {
            System.out.println("1 plus 1 is not equal to 11.");
        }
    }
    /*
    public static class finalExample_methods_derivedClass extends finalExampleInClass {
        @Override
        public void Math() {
            System.out.println("This is an overridden method in Child class.");
        }
    }
     */
    public final class finalExample_class {
        // Class Final
        // Giúp ngăn chặn các class con kế thừa dữ liệu từ class này.
        public static void Challenge() {
            System.out.println("Try to do inheritances on me.");
        }
    }
    /*
    public class finalExample_class_derivedClass extends finalExample_class {
        public static void AcceptChallenge() {
            System.out.println("Fuck you!.");
        }
    }
     */

    // Static: Được sử dụng để chỉ ra rằng một biến/phương thức/lớp thuộc về lớp chứ không phải đối tượng cụ thể.
    // Biến Static
    public static int staticVar = 0;
    // Phương thức Static
    public static int staticExample_methods(int a, int b) {
        return a + b;
    }

    // Khối tĩnh (Static block): là một khối mã được thực thi một lần khi lớp được nạp vào bộ nhớ,
    // trước khi bất kỳ thành phần nào khác của lớp được sử dụng.
    static int staticVar1;
    static int staticVar2;
    // Khối tĩnh
    static {
        System.out.println("Static block is executed.");
        staticVar1 = 100;
        staticVar2 = 200;
    }
    public static void display() {
        System.out.println("staticVar1 + staticVar2 = " + (staticVar1 + staticVar2));
    }
    
    
    // Static final là một biến tĩnh, nghĩa là nó thuộc về lớp chứ không phải là mỗi đối tượng của lớp.
    public static final int MAX_VALUE = 100000;
    
    public static void main(String[] args) {
        // Instance
        instanceExample();
        // Final
        finalExample_variables();
        finalExample_methods example1 = new finalExample_methods();
        example1.Math();
        // Static
        System.out.println("2 plus 3 is " + staticExample_methods(2, 3));
        display();
        // Static final
        System.out.println(MAX_VALUE);
    }
}