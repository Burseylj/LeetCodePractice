def divide(dividend, divisor):
    """
    :type dividend: int
    :type divisor: int
    :rtype: int
    """
    n = 0
    sign = 1
    if (bool(dividend < 0) ^ bool(divisor < 0)):
        sign = -1
        dividend = abs(dividend)
        divisor = abs(divisor)
    while(dividend > divisor):
        divisor = divisor + divisor
        n = n+1
    
    return sign*n
