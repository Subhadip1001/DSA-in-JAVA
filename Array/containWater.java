package Array;

// LeetCode Problem: 11
// Container With Most Water

public class containWater {
    public static int maxArea(int[] height){
        int lp = 0, rp = height.length - 1;
        int maxWater = 0;

        while(lp < rp){
            int w = rp - lp;
            int h = Math.min(height[lp], height[rp]);
            int currWater = w * h;
            maxWater = Math.max(maxWater, currWater);

            if(height[lp] < height[rp]){
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water that can be contained: " + maxArea(height));
    }
}
