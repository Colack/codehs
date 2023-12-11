function start(){
	jumpHurdle();
}

function jumpHurdle() {
    for (let i = 0; i < 5; i++) {
        move();
        move();
        turnLeft();
        move();
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
    }
}
