public class Chef
{
    private String name;
    private String restaurant;
    private Meal meal;
    
    public Chef(String names, String rests, Meal meals) {
        name = names;
        restaurant = rests;
        meal = meals;
    }
    
    public String getName() {
        return name;
    }
    
    public String getRestaurant() {
        return restaurant;
    }
    
    public String getMealName() {
        return meal.getName();
    }
    
    public int getMealServings() {
        return meal.getNumberOfServings();
    }
    
    public String getMealCourse() {
        return meal.getCourse();
    }
    
    public String toString() {
        return name + " works at " + restaurant + " and is best known for " + meal.toString();
    }
}
