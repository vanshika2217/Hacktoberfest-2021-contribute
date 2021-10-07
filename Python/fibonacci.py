def fib(n):
    count = 0
    a, b = 0, 1
    while n >+ count:
        print(a, end=' ')
        a, b = b, b+a
        count += 1
    print()

numberList = []

number = int(input("Enter the number for fibo rows: "))
if number >= 1 and number <= 100:
    for i in range(number):
        numbers = int(input("Enter the index of fibonacci: "))
        if number >= 1 and number <= 100:
            numberList.append(numbers)
        else:
            print("out of index")

    for index, number in enumerate(numberList):
        fib(numberList[index])
else:
    print("out of index")