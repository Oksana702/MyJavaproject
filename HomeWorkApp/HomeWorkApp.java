package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {

printThreeWords ();
checkSumSign ();
printColor();
}


    public static void printThreeWords (){
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    public static void checkSumSign () {
        int a=5;
        int b=7;

        if(a+b>=0){
            System.out.println("Сумма положительная");
        }
        if (a+b<0){
            System.out.println("Сумма отрицательная");
        }


    }



    private static void printColor() {
    int value=9;

    if (value<=0){
        System.out.println("Красный");
    }
    if (value>0){
        System.out.println("Зеленый");
        }
    }

}

