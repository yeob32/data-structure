package com.example.demo.dpattern.builder;

public class Member {

    private String name;
    private String email;
    private String cellphone;

    protected Member(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.cellphone = builder.cellphone;
    }

    public static class Builder {

        private String name;
        private String email;
        private String cellphone;

        public Builder(String name) {
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }

        public Member build() {
            return new Member(this);
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
