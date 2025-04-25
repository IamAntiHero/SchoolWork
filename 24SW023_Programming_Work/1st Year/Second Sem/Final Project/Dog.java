public class Dog extends Pet {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    @Override
    public String getType() {
        return "Dog";
    }
    
    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
        happiness += 15;
        energy -= 10;
        hunger += 3;
        
        if (happiness > 100) happiness = 100;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
    }
    
    public String getBreed() {
        return breed;
    }
}
