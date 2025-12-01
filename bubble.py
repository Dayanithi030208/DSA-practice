nums=[47, 12, 5, 89, 33, 7, 58, 21, 3, 72]
n=len(nums)
for i in range(n):
    for j in range(n-1):
        if(nums[j]>nums[j+1]):
            nums[j],nums[j+1]=nums[j+1],nums[j]
print(nums)