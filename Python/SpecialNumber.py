import math

# A number N is said to be a Special Number 
# when the sum of the factorial of digits of
# N is equal to the number itself.
def isSpecialNumber(n) -> bool:

    # Returning not expected cases as not special
    if n > 1000 or n < 0:
        return False
    elif n == 1000:
        return False

    # The parenthesis don't matter but make reading easier
    hundreds = n//100
    tens = (n%100)//10
    units = n%10

    # Calculate the sum of digits
    sum = 0
    for i in [hundreds, tens, units]:
        sum += math.factorial(i)

    if n == sum:
        return True
    else:
        return False


# Number of test Cases
t = int(input())

# Solving challenge using created function
for _ in range(t):
    n = int(input())
    if isSpecialNumber(n):
        print("Special Number")
    else:
        print("Not a Special Number")



