nums=[47, 12, 5, 89, 33, 7, 58, 21, 3, 72]
n=len(nums)
for i in range(1,n):
    if(nums[i]>nums[i-1]):
        continue
    for j in range(i,0,-1):
        if(nums[j]>nums[j-1]):
            break
        temp=nums[j]
        nums[j]=nums[j-1]
        nums[j-1]=temp
print(nums)