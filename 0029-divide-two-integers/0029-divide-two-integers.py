class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # Edge case: overflow
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1  # 32-bit integer max value

        # Determine sign
        negative = (dividend < 0) ^ (divisor < 0)

        # Work with positive values
        dividend, divisor = abs(dividend), abs(divisor)

        quotient = 0

        while dividend >= divisor:
            temp_divisor = divisor
            multiple = 1

            # Double the divisor until it’s too large
            while dividend >= (temp_divisor << 1):
                temp_divisor <<= 1
                multiple <<= 1

            # Subtract the largest shifted divisor
            dividend -= temp_divisor
            quotient += multiple

        # Apply sign
        if negative:
            quotient = -quotient

        return quotient
