class Solution {
    public int reverseBits(int n) {
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<32;i++)
        {
            int bit = (n >> i)&1;
            temp.append(bit);
        }
        return Integer.parseUnsignedInt(temp.toString(), 2);
        
    }
}