def create_shapes(radius):
    setposition(0 - radius, 0 - radius)
    
    color("red")
    begin_fill()
    for i in range(4):
        forward(radius * 2)
        left(90)
    end_fill()
    
    forward(radius)
    
    color("blue")
    begin_fill()
    circle(radius)
    end_fill()
   
speed(0) 
penup()
create_shapes(int(input("Enter circle radius: ")))