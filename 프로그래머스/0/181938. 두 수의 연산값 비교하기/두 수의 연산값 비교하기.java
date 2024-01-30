class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strNum = ""+a+b;
        int firstNum = Integer.parseInt(strNum);
        int secondNum = 2 * a * b;
        
        answer = (firstNum>=secondNum) ? firstNum : secondNum;
        
        
        return answer;
    }
}