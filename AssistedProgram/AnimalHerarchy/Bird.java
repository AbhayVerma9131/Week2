package AssistedProgram.AnimalHerarchy;


//Creating subclass Bird which extends the Animal class
class Bird extends Animal{
    Bird(String name,int age) {
        super(name, age);
    }
    public void makeSound(){
        System.out.println("Bird chirp");
    }
}