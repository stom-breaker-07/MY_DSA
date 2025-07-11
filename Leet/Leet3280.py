class Solution:
    def convertDateToBinary(self, date: str) -> str:
        a=date.split('-')
        dic=[]
        for i in a:
            s=str(bin(int(i))[2:])
            dic.append(s)
        return '-'.join(dic)