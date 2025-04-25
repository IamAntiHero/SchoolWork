public class PetStatusMonitor implements Runnable {
//yeh class threading kaye liye hai
    private PetEnvironment environment;
    private volatile boolean running = true;
    
    public PetStatusMonitor(PetEnvironment environment) {
        this.environment = environment;
    }
    
    @Override
    public void run() {
        System.out.println("Pet status monitor started...");
        
        while (running) {
            try {
                Thread.sleep(5000);
                
                for (Pet pet : environment.getPets()) {
                    pet.decreaseStats();
                    
                    if (pet.getHunger() >= 90) {
                        System.out.println("WARNING: " + pet.getName() + " is very hungry!");
                    }
                    if (pet.getEnergy() <= 10) {
                        System.out.println("WARNING: " + pet.getName() + " is very tired!");
                    }
                    if (pet.getHappiness() <= 10) {
                        System.out.println("WARNING: " + pet.getName() + " is very sad!");
                    }
                }
                
            } catch (InterruptedException e) {
                System.out.println("Pet status monitor interrupted");
                running = false;
            }
        }
    }
    
    public void stop() {
        running = false;
    }
}
