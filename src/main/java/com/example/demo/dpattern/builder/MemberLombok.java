package com.example.demo.dpattern.builder;

public class MemberLombok {

    private String name;
    private String email;
    private String cellphone;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String email;
        private String cellphone;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cellphone(String cellphone) {
            this.cellphone = cellphone;
            return this;
        }

        public MemberLombok build() {
            MemberLombok memberLombok = new MemberLombok();
            memberLombok.name = this.name;
            memberLombok.email = this.email;
            memberLombok.cellphone = this.cellphone;
            return memberLombok;
        }
    }

    @Override
    public String toString() {
        return "MemberLombok{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
