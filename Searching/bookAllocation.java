package Searching;

// GFG: Allocate Minimum Pages
// Problem Statement: Given an array of integers representing the number of pages in each book, and an integer representing the number of students, allocate books to students such that the maximum number of pages allocated to a student is minimized.

public class bookAllocation {
    public static boolean isValid(int[] books, int n, int m, int maxAllowedPages){
        int students = 1, pages = 0;

        for(int i=0; i<n; i++){
            if(books[i] > maxAllowedPages) return false;

            if(pages + books[i] <= maxAllowedPages){
                pages += books[i];
            }else{
                students++;
                pages = books[i];
            }
        }

        if(students > m){
            return false;
        }else{
            return true;
        }
        
    }
    public static int allocateBooks(int[] books, int students){
        int n = books.length;

        if(n < students) return -1;

        int sum = 0;
        for(int book : books) sum += book;

        int str = 0, end = sum;
        int ans = -1;
        while(str <= end){
            int mid = str+(end-str)/2;
            if(isValid(books, n, students, mid)){
                ans = mid;
                end = mid - 1;
            }else{
                str = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] books = {2, 1, 3, 4};
        int students = 2;

        int result = allocateBooks(books, students);
        System.out.println("Minimum pages allocated: " + result);
    }
}
