package HomeWorkApp.Lesson_7;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("\nTask8.");
        fillDiagonal();
    }

    public static void fillDiagonal(int i, int j) {
       int [][] arr = new int [i][j];
       for (int i=0; i<4; i++){
           arr [i][i] =1;
           arr [i][4-i-1]=1;{
       for (int j=0; j<4; j++){
            System.out.println(arr[i][j] + " ");
       }
               System.out.println();
    }
}

