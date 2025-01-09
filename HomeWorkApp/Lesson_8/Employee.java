package HomeWorkApp.Lesson_8;

public class Employee {
    private String fullNAme;
    private String position;
    private String email;
    private String phone;
    private String salary;
    private String age;

    public Employee(String fullNAme, String position, String email, String phone, String salary, String age) {
        this.fullNAme = fullNAme;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("fullNAme" + fullNAme);
        System.out.println("position" + position);
        System.out.println("email" + email);
        System.out.println("phone" + phone);
        System.out.println("salary" + salary);
        System.out.println("age" + age);
        System.out.println();
    }
}


