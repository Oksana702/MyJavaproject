package HomeWorkApp.Lesson_8;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        public int getAge(){

        }

        employees [0] = new Employee("Petrov Petr", "Director", "petrov@mail.ru", "893721400", "4500","27");
        employees [1] = new Employee("Kudinov Ilya", "Accounter", "kudinov@mail.ru", "93712333", "3200", "35");
        employees [2] = new Employee("Strelcova Darya", "Sales manager", "strelcova@mail.ru", "921255565", "1700", "25");
        employees [3] = new Employee("Ivanova Ivana", "Sales manager", "ivanova@mail.ru", "050695252", "1900", "29");
        employees [4] = new Employee("Repkin Maksim", "Security", "repkin@mail.ru", "070500335", "1200", "31");
        for (int i=0; i<employees.length; i++){
            if (employees[i]=getAge()>40){
            employees.printInfo();
        }
    }
    }
}
