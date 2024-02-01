class Solution {
    boolean solution(String s) {
       boolean check = true;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                cnt++;
            }
            else if(s.charAt(i)==')')
            {
                cnt--;
            }

            if(cnt<0)
            {
                check = false;
                break;
            }
        }
        
        if(cnt != 0)
        {
            check = false;
        }
        
        return check;
    }
}