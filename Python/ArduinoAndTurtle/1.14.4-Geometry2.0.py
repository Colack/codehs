penup()
setposition(0, -150)
pensize(2)
radius = 20

pendown()

for i in range(7):
    circle(radius, 360, i)
    radius+=20