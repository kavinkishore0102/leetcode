class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

       if (flowerbed.length >= 2 && flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            count++;
        } else if (flowerbed.length == 1 && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            count++;
        }

        for(int i = 1; i < flowerbed.length - 1; i++){
            if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i] != 1){
                flowerbed[i] = 1;
                count++;
            }
        }
        int last = flowerbed.length - 1;
        if(flowerbed[last] == 0 && flowerbed[last-1] == 0){
            flowerbed[last] = 1;
            count++;
        }

        if (count >= n) return true;
        return false;
    }
}