package org.koreait.member;

import lombok.*;

// @Setter @Getter @ToString // @ 에노테이션 : 컴파일러에게 정보전달
// @Data
// @NoArgsConstructor(access = AccessLevel.PRIVATE) // 생성자 생성
// @AllArgsConstructor // 모든 인스턴스 변수 생성자 매개변수로 생성
// @RequiredArgsConstructor
@Builder
@ToString
public class Member {
    private long seq; // 회원 번호
    private  String email; // 이메일

    // @NonNull
    // @ToString.Exclude // ToString 에서 배제
    private String password; // 패스워드



}