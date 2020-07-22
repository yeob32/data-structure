package com.example.demo.dpattern.builder;

public class Client {

    public static void main(String[] args) {
        Member member = new Member.Builder("hello")
                .email("aaaa")
                .cellphone("1234")
                .build();

        System.out.println(member);

        MemberLombok memberLombok = MemberLombok.builder()
                .name("hoy")
                .email("memem")
                .cellphone("11111")
                .build();

        System.out.println(memberLombok);
    }
}
