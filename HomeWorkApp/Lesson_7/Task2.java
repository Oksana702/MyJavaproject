package HomeWorkApp.Lesson_7;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isPositiveOrNegative(21));
    }

    public static void isPositiveOrNegative(int x) {
        if (x>=0){
            System.out.println("Число" + x + "положительное");
        } else {
            System.out.println("Число" + x + "отрицательное");
        }

    }
}
