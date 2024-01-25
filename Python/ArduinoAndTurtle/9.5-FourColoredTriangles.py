pensize(5)
    
def make_triangle():
    pendown()
    
    color("green")
    left(60)
    forward(50)
    
    color("blue")
    right(120)
    forward(50)
    right(120)
    
    color("red")
    forward(50)
    
    penup()
    backward(50)
    left(180)
   
speed(0)
penup() 
setposition(-100, 0)
for i in range(4):
    make_triangle()