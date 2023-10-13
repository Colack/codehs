moveTwice();
doBackflip();
moveTwice();
doBackflip();

function doBackflip() {
    for (let i = 0; i < 4; i++) {
        turnLeft();
    }
}

function moveTwice() {
    for (let i = 0; i < 2; i++) {
        move();
    }
}
