import java.util.Scanner;

 

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("������ �Է��ϼ��� >> ");

        int a;

        a = sc.nextInt();

        if ( a%3 == 0 ) {

            System.out.println(a + "�� 3�� ����̴�.");

        } else if ( a%2 == 0 ) {

           System.out.println(a + "�� ¦���̴�.");

        } else {

          System.out.println(a + "�� Ȧ���̴�.");

       }

       sc.close();

    }

}