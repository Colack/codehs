speed(0)
for i in range(10, 51, 10):
    pendown()
    for j in range(2):
        forward(10)
        left(90)
        forward(i)
        left(90)
    penup()
    forward(25)