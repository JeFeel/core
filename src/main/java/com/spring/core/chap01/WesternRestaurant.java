package com.spring.core.chap01;


public class WesternRestaurant implements Restaurant{

    //쉐프
    private Chef chef = new JannChef();

    //요리 코스
    private Course course = new FrenchCourse();

    //초기화로 nullpointer 방지

    //요리를 주문하는 기능
    public void order(){
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        chef.cook();
    }
}
