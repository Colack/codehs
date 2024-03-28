function start(){
	var hasEnoughCredits = readBoolean("Do you have enough credits?");
	var hasMetRequirements = readBoolean("Have you met the requirements?");
	
	println(hasEnoughCredits && hasMetRequirements);
}