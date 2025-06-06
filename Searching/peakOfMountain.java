package Array;

// LeetCode: 852
// Find the peak of a mountain array

public class peakOfMountain {
    public static int findPeak(int[] arr){
        int str = 1, end = arr.length - 2;

        while(str <= end){
            int mid = str+(end-str)/2;

            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid-1] < arr[mid]){
                str = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        int peakIndex = findPeak(arr);
        System.out.println("Peak index: " + peakIndex);
    }
}
