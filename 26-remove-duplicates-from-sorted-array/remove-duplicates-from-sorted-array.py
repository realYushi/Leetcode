class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        for k in range(1,len(nums)):
            if nums[k]!=nums[k-1]:
                nums[i]=nums[k]
                i+=1
        return i
        