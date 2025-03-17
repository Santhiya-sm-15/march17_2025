# march17_2025
The problem that i solved today in leetcode

1.You are given an integer array nums consisting of 2 * n integers.

You need to divide nums into n pairs such that:

Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.

Code:
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int x:nums)
            m.put(x,m.getOrDefault(x,0)+1);
        for(Map.Entry<Integer,Integer> x:m.entrySet())
        {
            if(x.getValue()%2==1)
                return false;
        }
        return true;
    }
}
