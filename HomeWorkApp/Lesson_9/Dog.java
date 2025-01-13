package HomeWorkApp.Lesson_9;

public class Dog extends Pet{
String name;
static int countDog=0;

Dog (String name){
    super();
    countDog++;
    this.name=name;
}

@Override
    void run(int range){
    if (range >500){
        System.out.println(name + "can not run more than" + range + "m");
    }else{
        System.out.println((name + "have run" + range +"m"));
    }
}
@Override
void swim(int range){
    if (range>10){
        System.out.println(name + "can not swim more than" + range + "m");
    }else {
        System.out.println("Dog have swam" + range + "m");
    }
}
static int getCountDog(){
    return countDog;
}
}
