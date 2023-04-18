package com.spring.core.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Ctrl Shift T -> 확인 -> test 밑에 생성
class PersonTest {

    // 테스트 메서드
    @Test
    void lombokTest(){
        Person p = new Person();
        p.setAddress("서울");
        p.setAge(10);
        p.setNickname("대길이");

        System.out.println(p);

        Person pk = new Person();
        pk.setNickname("춘식");
        pk.setAge(15);
        pk.setAddress("부산");

        System.out.println(pk);
    }

}