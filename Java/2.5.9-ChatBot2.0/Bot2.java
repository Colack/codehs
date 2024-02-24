public class Bot2 {

    private String name;

    public Bot2 (String yourName){
        name = yourName;
    }

    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is UNIVAC!");
        System.out.println("Are you having fun programming today?");
    }

    public void help(){
        System.out.println("You can ask me about the first computer bug, or");
        System.out.println("which countries use the imperial measurement system.");
        System.out.println("I can even convert miles to kilometers!");
    }

    public void firstBug(){
        System.out.println("It's said that the first computer bug was found ");
        System.out.println("on September 9, 1945 by Harvard technicians who ");
        System.out.println("found a moth in their computer!");
    }

    public void imperialCountries() {
        System.out.print("There are 3 countries that use the imperial ");
        System.out.println("measurement system.");
        System.out.print("They are the United States of America, ");
        System.out.println("Liberia, and Myanmar");
    }

    public void goodbye(){
        System.out.println("It's always nice to chat!");
        System.out.println("Have a great day!");
    }

    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 3.");
        System.out.print("That is ");
        System.out.print(yourNumber - 3);
        System.out.println(" away from your number");
    }

    public void favoriteAnimal(String yourAnimal){
        System.out.print("Neat. I think ");
        System.out.print(yourAnimal);
        System.out.println("s are pretty cool, too.");
        System.out.println("My favorite animal is a turtle. Have you met Tracy?");
    }

    public void destination(String place){
        System.out.print("I've heard ");
        System.out.print(place);
        System.out.println(" is a nice place to visit!");
        System.out.println("If I could go anywhere, I'd visit the mooon!");
    }

    public double milesToKilometers(double miles){
        double kilometers = miles / 0.6214;
        return kilometers;
    }


}