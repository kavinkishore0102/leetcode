class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE, flg = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    flg = 1;
                    if(nums1[i] < min1){
                        min1 = nums1[i];
                    }
                }
            }
        }
        if(flg == 1) return min1;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int x = nums1[i] * 10;     
                int y = x + nums2[j];       
                if (y < min) {
                    min = y;
                }
                int a = nums2[j] * 10;
                int b = nums1[i] + a;
                if (b < min) {
                    min = b;
                }
            }
        }
        return min;
    }
}
