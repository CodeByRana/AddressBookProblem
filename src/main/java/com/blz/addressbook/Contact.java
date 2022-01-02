package com.blz.addressbook;

public class Contact {
    private String name;
    private String email;
    private int phone_no;
    private String country;

    public Contact(String name, String email, int phone_no, String country) {
        this.name = name;
        this.email = email;
        this.phone_no = phone_no;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone_no=" + phone_no +
                ", country='" + country + '\'' +
                '}';
    }
}
