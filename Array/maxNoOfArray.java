package Array;

public class maxNoOfArray {
    public static void main(String[] args) {
        int arr[] = {2,4,9,3,6,8};

        int maxVal = Integer.MIN_VALUE;
        int indx = -1;
        for(int i=0; i<arr.length; i++){
            // maxVal = Math.max(maxVal, arr[i]);
            if(maxVal < arr[i]){
                maxVal = arr[i];
                indx = i;
            }
        }

        System.out.println("Largest number of this array is : " + maxVal);
        System.out.println("It is present in " + indx + " postion.");
    }
}
