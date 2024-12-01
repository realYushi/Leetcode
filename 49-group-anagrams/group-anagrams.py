class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        arr=defaultdict(list)
        for w in strs:
            keys=[0]*26
            for c in w:
                keys[ord(c)-ord('a')]+=1
            arr[tuple(keys)].append(w)
        return list(arr.values())
        
        