public class Meal
{
    private String name;
    private String meal;
    private int servings;
    
    public Meal(String names, String meals, int serving) {
        name = names;
        meal = meals;
        servings = serving;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCourse() {
        return meal;
    }
    
    public int getNumberOfServings() {
        return servings;
    }
    
    public String toString() {
        return name + "(" + meal + ")";
    }
}
