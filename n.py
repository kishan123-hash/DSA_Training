size=int(input("Enter the size of the array: "))
arr=[]
for i in range(size):
    work=int(input())
    arr.append(work)
print(arr)
fre={}
for i in range(size):
    if arr[i] in fre:
        fre[arr[i]]+=1
    else:
        fre[arr[i]]=1
print(fre)