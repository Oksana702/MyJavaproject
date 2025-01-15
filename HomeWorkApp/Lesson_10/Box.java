package HomeWorkApp.Lesson_10;


public class Box<T extends Fruit> {
    private final ArrayList<T> fruits;
    private double weight;

    public Box (){
        this.fruits=new ArrayList<>();
    }

    public void add(T fruit){
        fruits.add(fruit);
        weight +=fruitWeight(fruit);
    }

    private double fruitWeight(T fruit){
        if (fruit instanceof Apple){
            return 1.0;
        }else if(fruit instanceof Orange){
            return 1.5;
        }else {
            return 0.0;
        }

    }
    public double getWeight(){
        return weight;
    }

    private boolean compare(Box<?>box){
        return Double.compare(this.getWeight(), box.getWeight() )==0;
    }

    public void pourTo(Box<T>box){
        for (T fruit : fruits);
        box.add(fruits);
    }
    fruits.clear();
    weight=0;

}
}
