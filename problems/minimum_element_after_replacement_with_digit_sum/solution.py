class Solution(object):
    def minElement(self, nums):
        ans =[]
        for i in nums :
            temp = 0
            for j in str(i):
                temp += int(j)
            ans.append(temp)
            temp = 0
        return min(ans)