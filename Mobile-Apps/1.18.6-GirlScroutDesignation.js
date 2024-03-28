function start(){
	var boxesSold = readInt("How many boxes did you sell? ");
	var badgesHave = readInt("How many badges do you have? ");
	var volunteerHours = readInt("How many hours have you volunteered? ");
	
	var hasBadge = false;
	
	if (boxesSold >= 100) {
	    hasBadge = true;
	}
	
	if (boxesSold >= 50 && badgesHave >= 10 && volunteerHours >= 25) {
	    hasBadge = true;
	}
	
	println("Is gold status? " + hasBadge);
}