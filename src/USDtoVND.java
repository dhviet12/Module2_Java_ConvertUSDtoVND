import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        double rate = 22500;
        double usd;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        usd = input.nextDouble();
        double result = usd * rate;
        System.out.println(usd+ " usd tuong ung voi so tien "+ result + " vnd ");
    }
}
