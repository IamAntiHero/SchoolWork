public class Cat extends Pet {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
    
    @Override
    public String getType() {
        return "Cat";
    }
    
    // Cat-specific method
    public void chaseString() {
        System.out.println(name + " is chasing a piece of string!");
        happiness += 10;
        energy -= 8;
        hunger += 2;
        
        if (happiness > 100) happiness = 100;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
    }
    
    public boolean isIndoor() {
        return isIndoor;
    }
}
