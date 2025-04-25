import java.util.ArrayList;
import java.util.List;

public class PetEnvironment {
    private String name;
    private List<Pet> pets; //Environment contains Pets
    private List<FoodItem> foodStore;
    private PetStatusMonitor monitor;
    
    public PetEnvironment(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
        this.foodStore = new ArrayList<>();
        this.monitor = new PetStatusMonitor(this);
        
        // Start the pet status monitor thread
        Thread monitorThread = new Thread(monitor);
        monitorThread.setDaemon(true); // This will allow the thread to close when the program closes
        monitorThread.start();
        
        // Initialize with some food
        initializeFood();
    }
    
    private void initializeFood() {
        foodStore.add(new FoodItem("Dog Kibble", 20, "Dog"));
        foodStore.add(new FoodItem("Cat Treats", 15, "Cat"));
        foodStore.add(new FoodItem("Bird Seeds", 10, "Bird"));
        foodStore.add(new FoodItem("Pet Biscuit", 10, "Any"));
    }
    
    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " has been added to " + name);
    }
    
    public void removePet(Pet pet) {
        pets.remove(pet);
        System.out.println(pet.getName() + " has been removed from " + name);
    }
    
    public void feedPet(Pet pet, FoodItem food) {
        if (foodStore.contains(food)) {
            if (food.getPetType().equals("Any") || food.getPetType().equals(pet.getType())) {
                pet.addFood(food);
                foodStore.remove(food);
            } else {
                System.out.println(food.getName() + " is not suitable for " + pet.getType());
            }
        } else {
            System.out.println(food.getName() + " is not available in the store!");
        }
    }
    
    public void buyFood(FoodItem food) {
        foodStore.add(food);
        System.out.println(food.getName() + " has been added to the store");
    }
    
    public void showAllPets() {
        System.out.println("\n=== Pets in " + name + " ===");
        for (Pet pet : pets) {
            System.out.println(pet.getStatus());
        }
    }
    
    public void showFoodStore() {
        System.out.println("\n=== Food Store ===");
        for (FoodItem food : foodStore) {
            System.out.println(food);
        }
    }
    
    public List<Pet> getPets() {
        return pets;
    }
    
    public List<FoodItem> getFoodStore() {
        return foodStore;
    }
    
    public String getName() {
        return name;
    }
}
