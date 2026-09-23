a = input("Enter the number: ")
count = 0
c = []
for i in range(len(a)):
    digit = int(a[i])
    if digit != 0:
        count += 1
        place = 10 ** (len(a) - i - 1)
        round_number = digit * place
        c.append(round_number)
print(count)
print(" ".join(map(str,c)))
