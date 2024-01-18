while True:
    if color_is(color['red']):
        paint(color['blue'])
    elif color_is(color['blue']):
        paint(color['red'])
        
    if front_is_clear():
        move()
    else:
        break