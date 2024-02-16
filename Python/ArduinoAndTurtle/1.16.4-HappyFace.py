penup()
speed(0)
diameter = 50
happy = input("Enter yes if you are happy. ")
setposition(0, -diameter)

def create_smiley():
    color("yellow")
    begin_fill()
    circle(diameter)
    end_fill()
    
    color("black")
    setposition(-diameter / 2, 0)
    right(90)
    begin_fill()
    circle(diameter / 2, 180)
    end_fill()
    
    setposition((diameter / 2) + (diameter / 10), diameter / 2)
    begin_fill()
    circle(diameter / 10)
    end_fill()
    
    setposition((-diameter / 2) + (diameter / 10), diameter / 2)
    begin_fill()
    circle(diameter / 10)
    end_fill()
    
    setposition(0, 0)

if happy=="yes":
    create_smiley()