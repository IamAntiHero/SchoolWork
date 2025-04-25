import java.util.Scanner;

public class VirtualPetSimulator {
    private static Scanner scanner = new Scanner(System.in);
    private static PetEnvironment environment;    
    public static void main(String[] args) {
        System.out.println("Welcome to Virtual Pet Simulator!");
        System.out.print("Enter a name for your pet environment: ");
        String environmentName = scanner.nextLine();
        
        environment = new PetEnvironment(environmentName);
        
        boolean running = true;
        while (running) {
            System.out.println("\n=== Virtual Pet Simulator Menu ===");
            System.out.println("1. Add a new pet");
            System.out.println("2. View all pets");
            System.out.println("3. Feed a pet");
            System.out.println("4. Play with a pet");
            System.out.println("5. Let a pet sleep");
            System.out.println("6. View food store");
            System.out.println("7. Buy food");
            System.out.println("8. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1:
                    addNewPet();
                    break;
                case 2:
                    environment.showAllPets();
                    break;
                case 3:
                    feedPet();
                    break;
                case 4:
                    playWithPet();
                    break;
                case 5:
                    letPetSleep();
                    break;
                case 6:
                    environment.showFoodStore();
                    break;
                case 7:
                    buyFood();
                    break;
                case 8:
                    System.out.println("Thank you for playing Virtual Pet Simulator!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void addNewPet() {
        System.out.println("\n=== Add a New Pet ===");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        
        System.out.print("Enter pet type: ");
        int type = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        Pet newPet = null;
        
        switch (type) {
            case 1: // Dog
                System.out.print("Enter dog breed: ");
                String breed = scanner.nextLine();
                newPet = new Dog(name, age, breed);
                break;
            case 2: // Cat
                System.out.print("Is this cat indoor (true/false): ");
                boolean isIndoor = scanner.nextBoolean();
                newPet = new Cat(name, age, isIndoor);
                break;
            case 3: // Bird
                System.out.print("Can this bird fly (true/false): ");
                boolean canFly = scanner.nextBoolean();
                newPet = new Bird(name, age, canFly);
                break;
            default:
                System.out.println("Invalid pet type!");
                return;
        }
        
        if (newPet != null) {
            environment.addPet(newPet);
        }
    }
    
    private static void feedPet() {
        if (environment.getPets().isEmpty()) {
            System.out.println("You don't have any pets yet!");
            return;
        }
        
        if (environment.getFoodStore().isEmpty()) {
            System.out.println("You don't have any food in the store!");
            return;
        }
        
        System.out.println("\n=== Feed a Pet ===");
        
        // Show all pets
        for (int i = 0; i < environment.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + environment.getPets().get(i).getName() + 
                               " (" + environment.getPets().get(i).getType() + ")");
        }
        
        System.out.print("Select a pet: ");
        int petIndex = scanner.nextInt() - 1;
        scanner.nextLine();  
        
        if (petIndex < 0 || petIndex >= environment.getPets().size()) {
            System.out.println("Invalid pet selection!");
            return;
        }
        
        Pet selectedPet = environment.getPets().get(petIndex);
        
        // Show all food
        System.out.println("\nAvailable Food:");
        for (int i = 0; i < environment.getFoodStore().size(); i++) {
            System.out.println((i + 1) + ". " + environment.getFoodStore().get(i));
        }
        
        System.out.print("Select food: ");
        int foodIndex = scanner.nextInt() - 1;
        scanner.nextLine();  
        
        if (foodIndex < 0 || foodIndex >= environment.getFoodStore().size()) {
            System.out.println("Invalid food selection!");
            return;
        }
        
        FoodItem selectedFood = environment.getFoodStore().get(foodIndex);
        environment.feedPet(selectedPet, selectedFood);
        selectedPet.feed(selectedFood);
    }
    
    private static void playWithPet() {
        if (environment.getPets().isEmpty()) {
            System.out.println("You don't have any pets yet!");
            return;
        }
        
        System.out.println("\n=== Play with a Pet ===");
        
        // Show all pets
        for (int i = 0; i < environment.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + environment.getPets().get(i).getName() + 
                               " (" + environment.getPets().get(i).getType() + ")");
        }
        
        System.out.print("Select a pet: ");
        int petIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (petIndex < 0 || petIndex >= environment.getPets().size()) {
            System.out.println("Invalid pet selection!");
            return;
        }
        
        Pet selectedPet = environment.getPets().get(petIndex);
        
        // Special activities based on pet type
        if (selectedPet instanceof Dog) {
            System.out.println("\n1. Regular play");
            System.out.println("2. Fetch");
            System.out.print("Choose activity: ");
            int activity = scanner.nextInt();
            scanner.nextLine(); 
            
            if (activity == 1) {
                selectedPet.play();
            } else if (activity == 2) {
                ((Dog) selectedPet).fetch();
            } else {
                System.out.println("Invalid activity!");
            }
        } else if (selectedPet instanceof Cat) {
            System.out.println("\n1. Regular play");
            System.out.println("2. Chase string");
            System.out.print("Choose activity: ");
            int activity = scanner.nextInt();
            scanner.nextLine(); 
            
            if (activity == 1) {
                selectedPet.play();
            } else if (activity == 2) {
                ((Cat) selectedPet).chaseString();
            } else {
                System.out.println("Invalid activity!");
            }
        } else if (selectedPet instanceof Bird) {
            System.out.println("\n1. Regular play");
            System.out.println("2. Fly");
            System.out.print("Choose activity: ");
            int activity = scanner.nextInt();
            scanner.nextLine(); 
            
            if (activity == 1) {
                selectedPet.play();
            } else if (activity == 2) {
                ((Bird) selectedPet).fly();
            } else {
                System.out.println("Invalid activity!");
            }
        } else {
            selectedPet.play();
        }
    }
    
    private static void letPetSleep() {
        if (environment.getPets().isEmpty()) {
            System.out.println("You don't have any pets yet!");
            return;
        }
        
        System.out.println("\n=== Let a Pet Sleep ===");
        
        // Show all pets
        for (int i = 0; i < environment.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + environment.getPets().get(i).getName() + 
                               " (" + environment.getPets().get(i).getType() + ")");
        }
        
        System.out.print("Select a pet: ");
        int petIndex = scanner.nextInt() - 1;
        scanner.nextLine();  
        
        if (petIndex < 0 || petIndex >= environment.getPets().size()) {
            System.out.println("Invalid pet selection!");
            return;
        }
        
        Pet selectedPet = environment.getPets().get(petIndex);
        selectedPet.sleep();
    }
    
    private static void buyFood() {
        System.out.println("\n=== Buy Food ===");
        System.out.println("1. Dog Kibble (for Dogs)");
        System.out.println("2. Cat Treats (for Cats)");
        System.out.println("3. Bird Seeds (for Birds)");
        System.out.println("4. Pet Biscuit (for Any)");
        
        System.out.print("Select food to buy: ");
        int foodChoice = scanner.nextInt();
        scanner.nextLine();  
        
        FoodItem newFood = null;
        
        switch (foodChoice) {
            case 1:
                newFood = new FoodItem("Dog Kibble", 20, "Dog");
                break;
            case 2:
                newFood = new FoodItem("Cat Treats", 15, "Cat");
                break;
            case 3:
                newFood = new FoodItem("Bird Seeds", 10, "Bird");
                break;
            case 4:
                newFood = new FoodItem("Pet Biscuit", 10, "Any");
                break;
            default:
                System.out.println("Invalid food selection!");
                return;
        }
        
        if (newFood != null) {
            environment.buyFood(newFood);
        }
    }
}
