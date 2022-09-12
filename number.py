#n = int(input())
#result = n
print(sum(15))

def sum(num):
    result = num%10
    while result > 10:
        num = num%10
        result = num%10
    return result