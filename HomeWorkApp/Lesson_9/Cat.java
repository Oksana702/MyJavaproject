public class Cat extends Pet{
    String name;
    public int appetite;
    public boolean fullness;
    static int countCat=0;

    Cat (String name, int appetite, boolean fullness){
        super();
        countCat++;
        this.name=name;
        this.appetite=appetite;
        this.fullness=fullness;
    }

    public void eat (Plate p){
      p.decreaseFood(appetite);
    }
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
    void swim(int range){
        System.out.println("Cat can not swim");
    }
    static int getCountCat(){
        return countCat;
    }
}
