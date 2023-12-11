// Start the program and check for a ball and move 4 times
function start(){
	checkBall();
	move();
	checkBall();
	move();
	checkBall();
	move();
	checkBall();
}

// Check to see if a ball is in front of karel, and if its not put one there.
function checkBall(){
	if(noBallsPresent()){
		putBall();
	}
}
