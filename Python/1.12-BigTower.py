# This program draws a big tower from Karel's starting spot

while not_facing_north():
    turn_left()
    
while front_is_clear():
    put_ball()
    move()
    
put_ball()