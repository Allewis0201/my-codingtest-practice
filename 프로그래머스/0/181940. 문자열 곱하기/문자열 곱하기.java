class Solution {
    public String solution(String my_string, int k) {
        String answer;
        
        StringBuffer strBuffer = new StringBuffer();
        for(int i=0;i<k;i++)
        {
            strBuffer.append(my_string);
        }
        answer = strBuffer.toString();
        return answer;
    }
}