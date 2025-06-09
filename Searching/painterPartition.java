package Searching;

public class painterPartition {
    public static boolean isVaild(int[] board, int n, int m, int maxAllowedTime) {
        int painters = 1, time = 0;

        for(int i=0; i<n; i++){
            if(board[i] > maxAllowedTime) return false;

            if(time + board[i] <= maxAllowedTime){
                time += board[i];
            }else{
                painters++;
                time = board[i];
            }
        }

        return painters <= m;
    }
    public static int allocateBoards(int[] boards, int painters) {
        int n = boards.length;
        if(n < painters) return -1;

        int sum = 0;
        for(int board : boards) sum += board;

        int str = 0, end = sum;
        int ans = -1;
        while(str <= end){
            int mid = str+(end-str)/2;
            if(isVaild(boards, n, painters, mid)){
                ans = mid;
                end = mid-1;
            }else{
                str = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] boards = {40, 30,10, 20};
        int painters = 2;
        int result = allocateBoards(boards, painters);
        System.out.println("Minimum time to paint all boards: " + result);
    }
}
