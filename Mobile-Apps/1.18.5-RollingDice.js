function start(){
	var die1 = readInt("Die 1:");
	var die2 = readInt("Die 2:");
	
	var rolledDoubles = false;
	
	if (die1 == die2) {
	    rolledDoubles = true;
	}
	
	println(rolledDoubles);
}