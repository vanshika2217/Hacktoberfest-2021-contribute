def fib(n):
    count = 0
    a, b = 0, 1
    while n >+ count:
        print(a, end=' ')
        a, b = b, b+a
        count += 1
    print()