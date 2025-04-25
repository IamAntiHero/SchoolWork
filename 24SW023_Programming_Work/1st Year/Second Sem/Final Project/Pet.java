import java.util.ArrayList;
import java.util.List;

public abstract class Pet { //yeh parent class hogi
    protected String name;
    protected int age;
    protected double energy;
    protected double hunger;
    protected double happiness;
    protected List<FoodItem> foodInventory; // Aggregation: Pet has FoodItems
    
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.energy = 100.0;
        this.hunger = 0.0;
        this.happiness = 100.0;
        this.foodInventory = new ArrayList<>();
    }
    
    // Abstract methods that subclasses must implement
    public abstract void makeSound();
    public abstract String getType();
    
    public void feed(FoodItem food) {
        if (foodInventory.contains(food)) {
            System.out.println(name + " is eating " + food.getName());
            hunger -= food.getNutritionValue();
            if (hunger < 0) hunger = 0;
            foodInventory.remove(food);
        } else {
            System.out.println("You don't have " + food.getName() + " in your inventory!");
        }
    }
    
    public void play() {
        System.out.println(name + " is playing!");
        happiness += 10;
        energy -= 15;
        hunger += 5;
        
        // Keep values in valid range
        if (happiness > 100) happiness = 100;
        if (energy < 0) energy = 0;
        if (hunger > 100) hunger = 100;
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping...");
        energy += 30;
        hunger += 5;
        
        if (energy > 100) energy = 100;
        if (hunger > 100) hunger = 100;
    }
    
    public void addFood(FoodItem food) {
        foodInventory.add(food);
        System.out.println(food.getName() + " added to " + name + "'s inventory");
    }
    
    // Method used by thread to gradually decrease stats
    public void decreaseStats() {
        energy -= 1;
        happiness -= 1;
        hunger += 1;
        
        if (energy < 0) energy = 0;
        if (happiness < 0) happiness = 0;
        if (hunger > 100) hunger = 100;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getEnergy() {
        return energy;
    }
    
    public double getHunger() {
        return hunger;
    }
    
    public double getHappiness() {
        return happiness;
    }
    
    public List<FoodItem> getFoodInventory() {
        return foodInventory;
    }
    
    public String getStatus() {
        return "Name: " + name + " (" + getType() + ")\n" +
               "Energy: " + energy + "\n" +
               "Hunger: " + hunger + "\n" +
               "Happiness: " + happiness + "\n";
    }
}
