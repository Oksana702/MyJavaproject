package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
printThreeWords ();
checkSumSign ();
    }

    public static void printThreeWords (){
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void checkSumSign () {
        int A=5;
        int B=7;

        if(A+B>=0){
            System.out.println("Сумма положительная");
        }
        if (A+B<0){
            System.out.println("Сумма отрицательная");
        }



    }
}