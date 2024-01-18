# This has karel build two towers, with three balls in each tower.
# Should be the same program with turn_right and turn_around removed.

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