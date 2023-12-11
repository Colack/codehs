originalPassword = "test"
numTries = 0

print("Password Authentication Program")

while True:
    password = input("Enter your password:")
    
    if password != originalPassword:
        if numTries == 3:
            print("Incorrect password. Maximum number of attempts reached. access denied.")
        else:
            print("Incorrect password. Please try again.")
            print("")
    else:
        print("Correct Password! Access granted.")
        break