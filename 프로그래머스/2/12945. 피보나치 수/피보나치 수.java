class Solution {
    static int[] arr = new int[100001];
    public int solution(int n) {
         if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else if(arr[n] != 0 )
        {
            return arr[n];
        }

        else
        {
            arr[n] = (solution(n - 1) + solution(n - 2)) % 1234567;
            return arr[n];
        }
    }
}