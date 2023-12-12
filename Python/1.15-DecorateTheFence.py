def move_to_wall():
    while front_is_clear():
        move()
        
def move_up():
    move_to_wall()
    turn_left()
    
    while front_is_clear():
        if right_is_blocked():
            put_ball()
        move()
        
    if front_is_blocked() and no_balls_present():
        put_ball()

move_up()