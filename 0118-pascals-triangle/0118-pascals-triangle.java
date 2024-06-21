class Solution {
    public static List<Integer> generaterow(int row){
        int ans=1;
        List<Integer> ansrow =new ArrayList<>();
        ansrow.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansrow.add((int)ans);
        }
        return ansrow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans =new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(generaterow(row));
        }
        return ans;
    }
}