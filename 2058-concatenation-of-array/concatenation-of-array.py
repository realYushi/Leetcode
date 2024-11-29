class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        arr=[]
        for i in range(2):
            for k in nums:
                arr.append(k)

        return arr

        