function start(){
    //Write your code here
    // Remember to ask if it is a weekday before a holiday
    
    var weekday = readBoolean("Is today a weekday? ");
    var holiday = readBoolean("Is today a holiday? ");
    
    var noSchoolToday = !weekday || holiday;
    
    println("There is no school today: " + noSchoolToday);
}