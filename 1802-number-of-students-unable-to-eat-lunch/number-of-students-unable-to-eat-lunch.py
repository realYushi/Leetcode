class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        remainStudent=len(students)
        studentDict=defaultdict(int)
        for student in students:
            studentDict[student]+=1
        for sandwiche in sandwiches:
            if studentDict[sandwiche]>0:
                studentDict[sandwiche]-=1
                remainStudent-=1
            else:
                return remainStudent
        return remainStudent
        