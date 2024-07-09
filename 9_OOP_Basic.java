public class 9_OOP_Basic {
    // Class
    public static class Student {
        private String name;
        private int age;
        // Constructor
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Java không cần Getter/Setter cho dù biến ở trên là private.
        // Nhưng ta vẫn có thể dùng:
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
    public static void main(String[] args) {
        Student student1 = new Student("Ho Manh Quan", 23); // Object
        student1.Information();

        String name = "Nguyễn Văn An";
        int age = 24;

        Student student2 = new Student(name, age); // Object
        student2.Information();
        student2.setName("Nguyễn Văn A");
        student2.setAge(26);
        System.out.println("After new update, your information includes name and age: " + student2.getName() + " and " + student2.getAge() + " respectively.");
    }
}