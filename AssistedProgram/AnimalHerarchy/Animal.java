package AssistedProgram.AnimalHerarchy;

//Crating Super class Animal 
class Animal{
    private String name;
    private int age;
    Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}