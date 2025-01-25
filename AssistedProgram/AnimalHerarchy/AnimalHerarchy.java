package AssistedProgram.AnimalHerarchy;


//Main class to demonstarte the objects
public class AnimalHerarchy{
    public static void main(String[] args) {
        Dog dog = new Dog("Puff",2);
        Cat cat = new Cat("Ekta",20);
        Bird bird = new Bird("Eagle",8);

        dog.makeSound();
        System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge());
        cat.makeSound();
        System.out.println("Name: " + cat.getName() + ", Age: " + cat.getAge());
        bird.makeSound();
        System.out.println("Name: " + bird.getName() + ", Age: " + bird.getAge());
    }
}