# This program will have Karel run around the racetrack
# 8 times.

for i in range(32):
    while front_is_clear():
        move()
    
    if front_is_blocked():
        put_ball()
        turn_left()