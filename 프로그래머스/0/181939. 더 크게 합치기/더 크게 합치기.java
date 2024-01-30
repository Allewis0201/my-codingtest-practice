class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String firstStr = ""+a+b;
        String secondStr = ""+b+a;

        int firstNum = Integer.parseInt(firstStr);
        int secondNum = Integer.parseInt(secondStr);
        
        answer = (firstNum>=secondNum) ? firstNum : secondNum;

        return answer;
    }
}