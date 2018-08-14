class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        head = 0
        tail = len(height) -1
        maxArea = 0
        
        while (head < tail):
            hheight,theight = height[head],height[tail]
            
            area = abs((head - tail)*min(hheight,theight))
            maxArea = max(maxArea, area)
            hheight
            if hheight < theight:
                head = head + 1
                while (hheight > height[head] and head < tail):
                    head = head + 1
            else:
                tail = tail - 1
                while (theight > height[tail] and head < tail):
                    tail = tail - 1
            
        
        return maxArea

if __name__ == "__main__":
    solution = Solution()
    print Solution().maxArea([1,8,6,2,5,4,8,3,7])
