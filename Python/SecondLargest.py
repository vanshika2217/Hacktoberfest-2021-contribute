def sec_lar(a, b, c):
    if a==b and b==c:
        return -1
    elif (a==b and b>c) or (a>c and b==c) or (a>c and c>b) or (b>c and c>a):
        return c
    elif (b==c and c>a) or (b>a and a==c) or (b>a and a>c) or (c>a and a>b):
        return a
    elif (a==c and a>b) or (c>b and a==b) or (c>b and b>a):
        return b
    else:
        return -1

# Taking how many test cases to proceed
print("No of test cases: ", end="")
t = int(input())

for i in range(t):
    # taking three numbers as input in one line
    x, y, z = [int(n) for n in input("Enter three value (seperated by space): ").split()]
    ans = sec_lar(x, y, z)
    if ans != -1:
        print("Second largest =", ans)
    else:
        print("There is no second largest number.")
