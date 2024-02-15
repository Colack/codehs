blocksize = 10

def create_square():
    pendown()
    for i in range(4):
        forward(blocksize)
        left(90)
    penup()

penup()
setposition(-150, 0)

for i in range(5):
    create_square()
    forward(blocksize * 2)
    blocksize += 10