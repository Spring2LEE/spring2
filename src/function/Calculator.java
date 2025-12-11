package function;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 연산 결과를 저장하는 컬렉션 타입 필드 (private으로 캡슐화)
   public List<Double> results;

    // 생성자
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 사칙연산을 수행하고 결과를 반환하는 메서드
    public double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("오류: 0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("오류: 올바른 연산 기호가 아닙니다.");
                return 0;
        }

        // 연산 결과를 컬렉션에 저장
        results.add(result);
        return result;
    }

    // Getter 메서드
    public List<Double> getResults() {
        return new ArrayList<>(results); // 원본 보호를 위해 복사본 반환
    }

    // Setter 메서드
    public void setResults(List<Double> results) {
        this.results = new ArrayList<>(results);
    }

    //  연산 결과 삭제
    public void removeResult() {
        if (results.isEmpty()) {
            System.out.println("삭제할 연산 결과가 없습니다.");
        } else {
            Double removed = results.remove(0);
            System.out.println("가장 먼저 저장된 결과 " + removed + "가 삭제되었습니다.");
        }
    }
}
