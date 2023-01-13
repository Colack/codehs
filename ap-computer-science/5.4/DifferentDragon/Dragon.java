public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String names, int levels) {
        name = names;
        level = levels;
        if (level > 69) {
            canBreatheFire = true;
        }
    }
    
    
    // Put getters here
    public String getName() {
        return name;
    }
    
    public int getLevel() {
        return level;
    }
    
    public boolean isFireBreather() {
        return canBreatheFire;
    }
    
    // Put other methods here
    public void gainExperience() {
        level += 10;
        if (level > 69) {
            canBreatheFire = true;
        }
    }
    
    public void attack() {
        if (canBreatheFire) {
            System.out.println(">>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>>>>>\n>>>>>>>>>>");
        } else {
            System.out.println("~ ~ ~");
        }
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}
