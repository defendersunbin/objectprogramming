import java.util.Scanner;

public class studentInfo {
    public static void main(String args[]) {
        System.out.print("학번, 이름, 전공학과를 한칸씩 띄어서 입력해주세요");
        Scanner scanner = new Scanner(System.in);

        int studentNumber = scanner.nextInt();
        System.out.println("학번: " + studentNumber + ' ');

        String studentName = scanner.next();
        System.out.println("이름: " + studentName + ' ');

        String studentMajor = scanner.next();
        System.out.println("전공학과: " + studentMajor + ' ');

        scanner.close();
    }
}