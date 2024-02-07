class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        int lastNumber = num_list[num_list.length - 1];
        int beforeLastNumber = num_list[num_list.length - 2];


        for (int i = 0; i < num_list.length; i++)
        {
            answer[i] = num_list[i];
        }

        if (lastNumber > beforeLastNumber) {
            answer[num_list.length] = lastNumber - beforeLastNumber;
        } else if (lastNumber <= beforeLastNumber) {
            answer[num_list.length] = lastNumber * 2;
        }


        return answer;
    }
}