public class Bird extends Pet {
    private boolean canFly;
    
    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }
    
    @Override
    public String getType() {
        return "Bird";
    }
    
    // Bird-specific method
    public void fly() {
        if (canFly) {
            System.out.println(name + " is flying around!");
            happiness += 12;
            energy -= 15;
            hunger += 5;
            
            if (happiness > 100) happiness = 100;
            if (energy < 0) energy = 0;
            if (hunger > 100) hunger = 100;
        } else {
            System.out.println(name + " can't fly!");
        }
    }
    
    public boolean canFly() {
        return canFly;
    }
}
