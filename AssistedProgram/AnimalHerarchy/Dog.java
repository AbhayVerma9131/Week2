package AssistedProgram.AnimalHerarchy;


 //Creating subclass Dog which extends the Animal class  and overrides the makeSound method  of the Animal class.
 class Dog extends Animal{
    Dog(String name,int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Dog barks");
    }
}