class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        largest = 0

        head = 0
        tail = 0
        length = len(s)
        subset = set()
        
        while (tail < length):
            if s[tail] not in subset:
                subset.add(s[tail])
                tail = tail +1
                largest = max([largest, tail - head])
                
            else:
                subset.remove(s[head])
                head = head + 1
        return largest

        

if __name__ == "__main__":
    solution = Solution()
    print solution.lengthOfLongestSubstring("bbbbbb")
    print "\n"
    print solution.lengthOfLongestSubstring("abcabcbb")
    print "\n"
    print solution.lengthOfLongestSubstring("abcabcbb1234567")
    print "\n"
    print solution.lengthOfLongestSubstring("cdd")
    print "\n"
    print solution.lengthOfLongestSubstring("dvdf")
    print "\n"
    print solution.lengthOfLongestSubstring("pwwkew")
