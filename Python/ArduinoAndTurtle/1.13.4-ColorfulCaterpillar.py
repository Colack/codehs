def create_circle(color_choice):
    color(color_choice)
    begin_fill()
    circle(20)
    end_fill()
    
penup()
setposition(-200, 0)
for i in range(8):
    forward(40)
    create_circle(input("Enter a color: "))