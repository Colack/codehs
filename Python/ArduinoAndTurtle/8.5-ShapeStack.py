def smallSquare():
    pendown()
    for i in range(4):
        forward(50)
        left(90)
        
    penup()
    left(90)
    forward(50)
    right(90)

def smallCircle():
    forward(25)
    pendown()
    circle(25)
    penup()
    left(90)
    forward(50)
    left(90)
    forward(25)
    right(180)
     
speed(0)   
penup()
right(90)
forward(200)
left(90)
for i in range(4):
    smallSquare()
    smallCircle()