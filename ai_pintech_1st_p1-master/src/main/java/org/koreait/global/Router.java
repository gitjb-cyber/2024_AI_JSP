package org.koreait.global;

import org.koreait.global.exceptions.CommonException;
import org.koreait.global.libs.Utils;
import org.koreait.main.controllers.MainController;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Router {
    public static final Scanner sc; // 처음 만들어진게 바뀌지 않게 상수로 등록

    static {
        sc = new Scanner(System.in); // 사용자 입력 상품 등록
    }

    /**
     * 컨트롤러 라우터 실행
     *
     */
    public void execute() {
        while(true) {
            try {
                Utils.loadController(MainController.class);
            } catch (Exception e) {
                // 예외 공통 출력 처리 S
                int code = 500; // 우리가 정의한 예외가 아니라면 500으로 예외 코드 고정

                // 우리가 정의한 예외라면 그 예외 코드로 교체
                // reflection으로 유입된 경우
                if (e instanceof InvocationTargetException targetException) {
                   Throwable throwable = targetException.getTargetException(); // 감싸진 예외를 getTargetException 로 꺼내옴
                   if (throwable instanceof CommonException exception) { // 정의한 예외가 맞는지 체크
                       code = exception.getCode();
                   }
                }
                // 그외
                if (e instanceof CommonException commonException) { // 직접 정의된 예외면 행동
                    code = commonException.getCode();
                }

                System.out.printf("[%d]%s%n", code, e.getMessage());
                // 예외 공통 출력 처리 E
            }
        }
    }
}
