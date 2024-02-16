move()

j = 0

while (balls_present()):
    take_ball()
    j+=1
    
j*=2

for i in range(j):
    put_ball()
    
turn_right()
turn_right()
move()
turn_right()
turn_right()