package HomeWorkApp.Lesson_9;

public class Plate {
    public int food;
    public Plate (int food){
        this.food=food;
    }
    public void decreaseFood(int x){
        food-=x;
    }
    public void increaseFood (int y){
        food +=y;
    }
    public void info(){
        System.out.println("There are " + food );
    }
}
