function start(){
    var age = readInt("What is your age? ");
    
    if (age >= 13 && age < 20) {
        println("Yes, you are a teenager");
    } else {
        println("No, you are not a teenager");
    }
}