class Solution(object):
    def myAtoi(self, s):
        """
        :type str: str
        :rtype: int
        """
        intMin = -2**31
        intMax = 2**31 - 1
        sign = 1
        numeros = set(['0','1','2','3','4','5','6','7','8','9','+','-'])
        if s == "":
            return 0
        while (s!= "" and s[0] not in numeros):
            if s[0] == ' ':
                s = s[1:]
                if s == "":
                    return 0
            else: 
                return 0
        if s == "":
            return 0
        
        if s[0] == '-' or s[0] == '+':
            if s[0] == '-':
                sign = -1
            s = s[1:]
            
        if s == "":
            return 0
        
        numeros.remove('+')
        numeros.remove('-')
        n = 0
        for i in s:
            if i not in numeros:
                break
            else:
                n = n*10 + int(i)
        n = n * sign
        if sign > 0 :
            n = min(intMax, n)
        else:
            n = max(intMin, n)
        return n

if __name__ == "__main__":
    print Solution().myAtoi("42")
    print Solution().myAtoi("   -42")
    print 
