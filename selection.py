nums=[47, 12, 5, 89, 33, 7, 58, 21, 3, 72]
n=len(nums)
for i in range(n):
    mini=i
    for j in range(i+1,n):
        if(nums[j]<=nums[mini]):
             mini=j
    nums[i],nums[mini]=nums[mini],nums[i]
print(nums)

    