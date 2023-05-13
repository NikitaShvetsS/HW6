public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("1)Cat run: ");
        cat.run(100);
        cat.run(300);
        System.out.println("2)Cat swim: ");
        cat.swim(10);
        cat.swim(20);
        System.out.println("3)Dog run: ");
        dog.run(400);
        dog.run(700);
        System.out.println("4)Dog swim: ");
        dog.swim(5);
        dog.swim(20);
    }
}