package HomeWorkApp.Lesson_7;

public class Task4_1 {
    public static void main(String[] args) {
        System.out.println("\nTask4.1");
        specialYear();
    }

    public static void specialYear(int year) {
        if (!(year % 4 == 0) || ((year %100==0) && !(year %400 ==0)));
        System.out.println(year + " - не високосный год");


    }
}
