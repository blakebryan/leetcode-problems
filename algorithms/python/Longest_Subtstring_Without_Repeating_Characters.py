class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if (len(s) < 2):
            return len(s)
        longest = 0
        substring = s[0]
        for i in range(len(s)):
            substring = s[i]
            for j in range(i + 1, len(s)):
                if substring.count(s[j]) > 0:
                    break
                substring += s[j]
            longest = max(longest, len(substring))
            substring = ""
        return longest