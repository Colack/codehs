def create_circle(radius):
    setposition(0, -200)
    for i in range(3):
        color("gray")
        begin_fill()
        circle(radius)
        end_fill()
        left(90)
        forward(radius*2)
        right(90)
        radius /= 2

    
penup()
create_circle(int(input("Enter circle radius: ")))