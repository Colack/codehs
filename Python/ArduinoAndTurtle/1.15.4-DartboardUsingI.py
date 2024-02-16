def createCircle(radius):
    circle(radius)
    right(90)
    penup()
    forward(25)
    pendown()
    left(90)    

for i in range(25, 125, 25):
    createCircle(i)