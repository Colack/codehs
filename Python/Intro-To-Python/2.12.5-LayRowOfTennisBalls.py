# Write a program to lay a row of tennis balls
# across first street. Make sure to test your
# program on multiple worlds.

while front_is_clear():
    if no_balls_present():
        put_ball()
        
    move()
    
put_ball()