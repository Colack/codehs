public class Dragon 
{
    private String attack;
    private int level;
    
    // Write the constructor here!
    public Dragon(int levels, String attacks) {
        attack = attacks;
        level = levels;
    }
    
    // Put getters here
    public int getLevel() {
        return level;
    }
    
    public String getAttack() {
        return attack;
    }
    
    // Put other methods here
    public String fight() {
        String attacker = "";
        for (int i = 0; i < level; i++) {
            attacker += attack;
        }
        return attacker;
    }
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
