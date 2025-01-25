package AssistedProgram.AnimalHerarchy;


//Creating subclass Cat which extends the Animal class and overrides the makeSound method
class Cat extends Animal{
    Cat(String name,int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Cat meows");
    }
}