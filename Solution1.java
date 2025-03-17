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