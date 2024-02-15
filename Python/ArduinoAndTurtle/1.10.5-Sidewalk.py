def make_squares():
    pendown()
    for j in range(4):
        for i in range(8):
            for e in range(4):
                forward(50)
                left(90)
            forward(50)
        left(90)
    penup()
    
speed(10)
penup()
setposition(-200, -200)
make_squares()