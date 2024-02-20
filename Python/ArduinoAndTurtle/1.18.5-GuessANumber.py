user_number = 0
secret_number = 7
guessed_number = True

def create_checkmark():
    color("green")
    penup()
    left(45)
    forward(50)
    left(180)
    pendown()
    forward(75)
    
    penup()
    left(270)
    pendown()
    forward(25)

while (guessed_number):
    user_number = int(input("Guess a number between 1-10: "))
    if user_number == secret_number:
        
        guessed_number = False
    else:
        print("Try again!")