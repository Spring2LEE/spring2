package function;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // Calculator 클래스의 calculate 메서드를 통해 연산 수행
            double result = calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            // 저장된 연산 결과 조회 (Getter 메서드 활용)
            System.out.println("현재까지 저장된 연산 결과: " + calculator.getResults());

            // 가장 먼저 저장된 결과 삭제 여부 확인
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            sc.nextLine(); // 버퍼 비우기
            String removeChoice = sc.nextLine();

            if (removeChoice.equals("remove")) {
                calculator.removeResult();
                System.out.println("삭제 후 연산 결과: " + calculator.getResults());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitChoice = sc.nextLine();

            if (exitChoice.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        // 반복문 종료

        sc.close();
    }
}
