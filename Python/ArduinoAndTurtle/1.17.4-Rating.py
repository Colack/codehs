rating = int(input("Enter a rating between 1-10: "))
pensize(5)
speed(8)

def create_shape(num):
    if num <= 4:
        color("red")
        left(45)
        penup()
        forward(50)
        pendown()
        left(180)
        forward(100)
        
        penup()
        left(180)
        forward(50)
        left(90)
        forward(50)
        left(180)
        pendown()
        forward(100)
    elif num <= 7:
        color("yellow")
        penup()
        forward(50)
        left(180)
        pendown()
        forward(100)
    else:
        color("green")
        penup()
        left(45)
        forward(50)
        left(180)
        pendown()
        forward(75)
        
        penup()
        left(270)
        pendown()
        forward(25)
        
create_shape(rating)