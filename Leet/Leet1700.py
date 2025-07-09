class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        count=[0,0]
        for s in students:
            count[s]+=1

        remaining =len(sandwiches)
        for san in sandwiches:
            if count[san]==0:
                break
            if remaining==0:
                break
            count[san]-=1
            remaining-=1
        return remaining