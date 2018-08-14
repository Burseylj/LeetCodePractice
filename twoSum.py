## Approach: make hash table of values and indicies, then we can quickly check if each number has a pair that sums to the target
def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    
    hashNums = {}
    for i in range(len(nums)) : 
        x = nums[i]
        recip = target -x
        if (recip in hashNums and hashNums[recip] != i): 
            return [hashNums[recip],i]
        hashNums[nums[i]] = i
        
    return None
