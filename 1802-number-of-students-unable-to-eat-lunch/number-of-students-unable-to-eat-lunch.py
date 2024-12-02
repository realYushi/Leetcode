class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        res=len(students)
        sm=defaultdict(int)

        for i in students:
            sm[i]=sm.get(i,0)+1
        for sw in sandwiches:
            if sm[sw]>0:
                res-=1
                sm[sw]-=1
            else:
                return res
        return res
                
        
        