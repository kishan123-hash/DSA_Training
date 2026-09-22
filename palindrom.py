a=input("Enter the values: ")
for i in range(len(a)):
    if a[i]==a[::-1]:
        print("Palindrom")
    else:
        print("Not palindrom")