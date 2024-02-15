square_length = int(input("Enter square length: "))

def create_square():
    pendown()
    for i in range(4):
        forward(square_length)
        left(90)
    penup()

penup()
setposition(-200, -200)
create_square()
setposition(200-square_length, 200-square_length)
create_square()
setposition(-200, 200-square_length)
create_square()
setposition(200-square_length, -200)
create_square()