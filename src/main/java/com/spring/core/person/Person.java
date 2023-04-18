package com.spring.core.person;

import lombok.*;

/*
@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든 파라미터 생성자
*/

@Data // 위에 한꺼번에 불러줌, 실무에선 가급적 쓰지 말것
public class Person {

    private String nickname;
    private String address;
    private int age;

    // 1명에 대한 개인정보

}
