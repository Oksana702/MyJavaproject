package HomeWorkApp.Lesson_9;

public class Pet {
    static int countPet = 0;
    Pet (){
        countPet++;
    }
    void run (int range){
        System.out.println("Pet have run" + range + "m");
    }
    void swim (int range){
        System.out.println("Pet have swam" + range + "m");
    }
    public static int getCountPet(){
        return countPet;
    }
}
