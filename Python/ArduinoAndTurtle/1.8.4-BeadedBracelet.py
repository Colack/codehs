def tinyCircle():
    pendown()
    circle(10)
    
    penup()
    left(10)
    forward(20)

penup()
right(90)
forward(100)
left(90)

for i in range(36):
    tinyCircle()