class Solution {
    public int[] plusOne(int[] digits) {
        int size=digits.length;
        for(int i=size-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
                digits[i]=0;
        }
        int[] num= new int[size+1];
        num[0]=1;
        return num;
    }
}