package HomeWorkApp.Lesson_7;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("\nTask8.");
        fillDiagonal();
    }

    public static void fillDiagonal() {
       int [][] arr = new int [4][4];
       for (int i=0; i<4; i++){
           arr [i][i] =1;
           arr [i][4-i-1]=1;
       }
       for (int=0; j<4; j++){
            System.out.println(arr [i][j] + " ");
            System.out.println();
    }
}
