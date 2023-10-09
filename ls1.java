 class MaxWealth {
    public static void main(String[] args) {
         int array[][]={{21,23,45},{12,3,4}};
         System.out.println(maximumWealth(array));
    }
    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
           
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}


