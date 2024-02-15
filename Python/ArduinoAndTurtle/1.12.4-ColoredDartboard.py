radius = 100
color_choice = ""
penup()
setposition(0, -100)
pendown()

def createCircle():
    color(color_choice)
    begin_fill()
    circle(radius)
    end_fill()
    left(90)
    penup()
    forward(25)
    pendown()
    right(90)    

for i in range(4):
    color_choice = input("Enter a color: ")
    createCircle()
    radius = radius - 25