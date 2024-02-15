radius = 25

def createCircle():
    circle(radius)
    right(90)
    penup()
    forward(25)
    pendown()
    left(90)    

for i in range(4):
    createCircle()
    radius = radius + 25