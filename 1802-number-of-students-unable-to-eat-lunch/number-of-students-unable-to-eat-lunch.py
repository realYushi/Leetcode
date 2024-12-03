class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        remainedStudent=len(students)
        studentsDict=defaultdict(int)
        for student in students:
            studentsDict[student]+=1
        for sandwiche in sandwiches:
            if studentsDict[sandwiche]>0:
                studentsDict[sandwiche]-=1
                remainedStudent -=1
            else:
                return remainedStudent
        return remainedStudent

        