class Solution {
    public int solution(int n, int k) {
        int lambSkewersPrice = 12000;
        int drinkPrice = 2000;

        int answer = lambSkewersPrice * n + drinkPrice * k;

        while (n >= 10) {
            answer -= drinkPrice;
            n-=10;
        }

        return answer;
    }
}