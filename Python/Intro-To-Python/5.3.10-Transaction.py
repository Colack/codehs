initial_balance = 1000
bank = input("Deposit or withdrawal: ")

money_amount = int(input("Enter amount: "))

if (bank == "deposit"):
    print("Final balance " + str(initial_balance + money_amount))
if (bank == "withdrawal"):
    if((initial_balance - money_amount) < 0):
        print("You cannot have a negative balance!")
    else:
        print("Final balance " + str(initial_balance - money_amount))
else:
    print("Invalid transaction")