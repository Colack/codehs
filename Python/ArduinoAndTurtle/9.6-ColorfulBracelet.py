def tinyCircle():
    begin_fill()
    pendown()
    circle(10)
    end_fill()
    
    penup()
    left(10)
    forward(20)

penup()
right(90)
forward(100)
left(90)

for i in range(12):
    color("blue")
    tinyCircle()
    color("red")
    tinyCircle()
    color("purple")
    tinyCircle()