def paint_row():
    for i in range(3):
        paint(color["black"])
        move()
        paint(color["red"])
        move()
# Karel will move up the board appropriate to him facing east.
def move_up_facing_east():
    if front_is_blocked():
        turn_left()
        move()
        turn_left()
# Karel will move up the board appropriate to him facing west.
def move_up_facing_west():
    if front_is_blocked():
        turn_right()
        move()
        turn_right()
# Karel returns from the top of the board back to the starting point of the
# board.
def return_to_start():
    if front_is_blocked():
        turn_left()
        for i in range(7):
            move()
            if front_is_blocked():
                turn_left()

for i in range(3):
    paint_row()
    paint(color["black"])
    move()
    paint(color["red"])
    move_up_facing_east()
    paint_row()
    paint(color["black"])
    move()
    paint(color["red"])
    move_up_facing_west()

paint_row()
paint(color["black"])
move()
paint(color["red"])
move_up_facing_east()
paint_row()
paint(color["black"])
move()
paint(color["red"])

return_to_start()