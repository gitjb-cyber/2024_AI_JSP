package org.koreait.global;

import java.util.Map;

/**
 * 출력 화면 Template 기본 구성
 *
 */
public interface Template {
    void print();
    default void print(Model model) {} // 옵션, 있어도 되고 없어도 된다.
}
