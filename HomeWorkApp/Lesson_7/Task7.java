package HomeWorkApp.Lesson_7;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("\nTask7.");
        changeArray();
    }

    public static void changeArray() {
        int [] arr={1,5,3,2,11,4,5,2,4,8,9,1};
                for (int i=0; i< arr.length; i++){
                    if (arr [i]<6){
                        arr [i]=arr [i]*2;
                    }
                    System.out.println(arr[i] + "");
                }
        System.out.println();
    }
    }



