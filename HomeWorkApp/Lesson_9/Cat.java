package HomeWorkApp.Lesson_9;

public class Cat extends Pet{
    String name;
    static int countCat=0;

    Cat (String name){
        super();
        countCat++;
        this.name=name;
    }
    @Override
    void run (int range){
        if (range>200){
            System.out.println(name + "can not run more than 200 m");
        }else{
            System.out.println(name + "have run" + range + "m");
        }
    }
    @Override
    void swim (int range){
        System.out.println("Cat can not swim");
    }
    static int getCountCat(){
        return countCat;
    }
}
