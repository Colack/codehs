function start(){
	var dietary = readLine("Any dietary restrictions? ");
	
	if (dietary == "lactose intolerant") {
	    println("No cheese");
	} else if (dietary == "vegetarian") {
	    println("Veggie Burger");
	} else if (dietary == "none") {
	    println("No Alterations");
	}
}