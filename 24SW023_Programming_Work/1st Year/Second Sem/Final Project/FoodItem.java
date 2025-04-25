public class FoodItem { //aggregation kaye liye
    private String name;
    private double nutritionValue;
    private String petType; 
    
    public FoodItem(String name, double nutritionValue, String petType) {
        this.name = name;
        this.nutritionValue = nutritionValue;
        this.petType = petType;
    }
    
    public String getName() {
        return name;
    }
    
    public double getNutritionValue() {
        return nutritionValue;
    }
    
    public String getPetType() {
        return petType;
    }
    
    @Override
    public String toString() {
        return name + " (Nutrition: " + nutritionValue + ", For: " + petType + ")";
    }
}
