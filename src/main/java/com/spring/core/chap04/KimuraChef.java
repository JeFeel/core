package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("kc") //bean의 이름이 kc로 지정
public class KimuraChef implements Chef {

    public void cook(){
        System.out.println("일식 요리의 대가 키무라입니다.");
    }
}
