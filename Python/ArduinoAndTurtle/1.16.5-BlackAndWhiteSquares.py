speed(0)
penup()
setposition(-120, 0)

def create_square(num):
    if num % 2 == 0:
        # Create black square
        color("black")
        begin_fill()
        for i in range(4):
            forward(20)
            left(90)
        end_fill()
    else:
        # Create white square
        color("black")
        pendown()
        for i in range(4):
            forward(20)
            left(90)
        penup()
        
for i in range(6):
    create_square(i)
    forward(40)