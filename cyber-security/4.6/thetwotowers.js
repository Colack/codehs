// Start the program and call functions + move.
function start(){
    move();
    buildTower();
    comeDown();
    move();
    move();
    buildTower();
    move();
    turnRight();
}

// Turn right
function turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
}

// Turn around
function turnAround(){
    turnLeft();
    turnLeft();
}

// Move Karel back to the bottom.
function comeDown(){
    turnAround();
    move();
    move();
    turnLeft();
}

// Move Karel to the top while building a tower.
function buildTower(){
    turnLeft();
    putBall();
    move();
    putBall();
    move();
    putBall();
}
