class Solution {
    public int reverseBits(int n) {
        String temp="";
        for(int i=0;i<32;i++)
        {
            int bit = (n >> i)&1;
            temp+=bit;
        }
        return Integer.parseUnsignedInt(temp, 2);
        
    }
}