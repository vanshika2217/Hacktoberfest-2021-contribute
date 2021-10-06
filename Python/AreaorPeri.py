# taking length as input
print("Enter the value for length : ")
L = int(input())

# taking breadth as input
print("Enter the value for breadth : ")
B = int(input())

area = L*B
peri = 2*(L+B)

# checking all 3 conditions
if area>peri:
    print("Area\n"+str(int(area)))
elif peri>area:
    print("peri\n"+str(int(peri)))
else:
    print("Eq\n"+str(int(area)))