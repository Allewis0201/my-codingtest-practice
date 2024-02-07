class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;

        for(int find : num_list)
        {
            if(n==find)
            {
                answer=1;
                break;
            }
        }

        return answer;
    }
}