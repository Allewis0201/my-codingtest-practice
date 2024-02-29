import java.math.BigInteger;
import java.util.Scanner;

public class Main {


    public static void hanoi(int circleNumber)
    {
        int start = 1;
        int second = 2;
        int third = 3;

        BigInteger base = new BigInteger("2");
        BigInteger count = base.pow(circleNumber).subtract(new BigInteger("1"));

        System.out.println(count);

        if(circleNumber <= 20)
        {
            hanoiCalculate(circleNumber,start,second,third);
        }

    }
    public static void hanoiCalculate(int n, int from, int aux, int to) {


        if (n == 1) {
            System.out.println(from + " " + to);
            return;
        }

        // 첫번째 기둥에서 두번째 기둥으로 전부 보냄
        hanoiCalculate(n - 1, from, to, aux);
        
        System.out.println(from + " " + to);
        
        // 두번째 기둥에서 세번째 기둥으로 전부 보냄
        hanoiCalculate(n - 1, aux, from, to);
    }

    public static void main(String[] args) {

        int circleNumber;
        Scanner scanner = new Scanner(System.in);

        circleNumber = scanner.nextInt();
        hanoi(circleNumber);

    }
}
