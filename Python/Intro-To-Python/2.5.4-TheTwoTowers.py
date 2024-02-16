def turn_right():
    turn_left()
    turn_left()
    turn_left()

def build_tower():
    turn_left()
    put_ball()
    move()
    put_ball()
    move()
    put_ball()
    move()
    turn_right()
    
def go_down():
    turn_right()
    move()
    move()
    move()
    turn_left()
    
    
move()
build_tower()
go_down()
move()
move()
build_tower()