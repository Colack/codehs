"""
This program asks the user for three ingredients,
three amounts, and a number of servings, and
determines how much of each ingredient is needed
to serve the specified number of servings.
"""

# Write program here...

ingredient1 = input("Enter the first ingredient: ")
ounces1 = input("Enter the amount of the first ingredient in ounces: ")

ingredient2 = input("Enter the second ingredient: ")
ounces2 = input("Enter the amount of the second ingredient in ounces: ")

ingredient3 = input("Enter the third ingredient: ")
ounces3 = input("Enter the amount of the third ingredient in ounces: ")

servings = input("Enter the number of servings: ")

print("Total ounces of " + ingredient1 + ": " + str(float(ounces1) * float(servings)))
print("Total ounces of " + ingredient2 + ": " + str(float(ounces2) * float(servings)))
print("Total ounces of " + ingredient3 + ": " + str(float(ounces3) * float(servings)))
