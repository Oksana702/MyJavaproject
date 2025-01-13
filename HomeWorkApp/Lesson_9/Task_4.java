package HomeWorkApp.Lesson_9;

public class Task_4 {
    public static void task_4(String[] args){
        Pet pet = new Pet();
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        Cat cizhik = new Cat("Cizhik");
        Cat deboshir= new Cat("Deboshir");
        Dog dexter= new Dog("Dexter");
        Dog volter=new Dog("Volter");
        cizhik.run(120);
        dexter.run(350);
        volter.run(70);
        deboshir.run(35);
        dexter.swim(7);
        cizhik.swim(2);
        volter.swim(4);
        deboshir.swim(8);
        System.out.println("Total pets are" + Pet.getCountPet());
        System.out.println("Total cats are" + Cat.getCountCat());
        System.out.println("Total dogs are" + Dog.getCountDog());

    }
}
