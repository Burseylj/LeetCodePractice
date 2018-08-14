class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        largest = 0
        for i in range(len(s)):
            substr = [s[i]]
            for j in range(i+1, len(s)):
                if s[j] not in substr:
                    substr.append(s[j])
                else: 
                    break
            if len(substr) > largest:
                largest = len(substr)
        return largest

if __name__ == "__main__":
    solution = Solution()
    print solution.lengthOfLongestSubstring("bbbbbb")
    print solution.lengthOfLongestSubstring("abcabcbb")
    print solution.lengthOfLongestSubstring("abcabcbb1234567")
    print solution.lengthOfLongestSubstring("cdd")
    print solution.lengthOfLongestSubstring("dvdf")
    print solution.lengthOfLongestSubstring("pwwkew")
