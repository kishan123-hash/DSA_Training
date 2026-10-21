nums = [0,1,0,3,12]
zeros=0
work=[]
for i in range(len(nums)):
    if nums[i]!=0:
        work.append(nums[i])
        zeros=zeros+1
while(zeros<len(nums)):
    work.append(0)
    zeros=zeros+1
print(work)Mi