import java.util.Random;


public class Test4 {

    public static void main(String[] args) {
	Random rand = new Random();
        int money = 10000;

        System.out.println("���� " + money + "���� �ֽ��ϴ�.");

        while (true) {
		int n = rand.nextInt(money)+1;

            System.out.println(n + "�� ����մϴ�. ���� ���� " + (money -= n) + "���Դϴ�.");

            if (money == 0) {

                break;

            }

        }

    }

}