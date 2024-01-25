public class Dog
{
    private String name;
    private String breed;
    private boolean hasShots;

    public Dog(String name1, String breed1, boolean shots) {
        name = name1;
        breed = breed1;
        hasShots = shots;
    }
    
    public Dog(String name1, String breed1) {
        name = name1;
        breed = breed1;
        hasShots = false;
    }

    public String toString(){
        String output = "Name: " + name;
        output += "\nBreed: " + breed;
        
        if(hasShots)
        {
            output += "\nUp to date on shots!";
        }
        else
        {
            output += "\nMissing shots";
        }
        
        return output;
    }
}
