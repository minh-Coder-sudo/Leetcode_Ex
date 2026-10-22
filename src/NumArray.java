class NumArray {
    private int[] nums = new int[0];
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        int i = left;
        do {
            sum+=getNums()[i];
            i++;
        }while(i<=right);
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */