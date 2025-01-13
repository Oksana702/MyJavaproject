package HomeWorkApp.Lesson_7;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("\nTask9.");
        Task9();
    }

    public static void Task9(int len, int initialValue) {
        int [] arr=new int[len];
        for (int i=0; i<len; i++){
            arr[i]=initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
        }

    }
}
