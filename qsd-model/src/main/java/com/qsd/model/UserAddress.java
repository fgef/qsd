package com.qsd.model;

public class UserAddress {
    /**
     * user_address.id;
     */
    private Integer id;

    /**
     * user_address.address;收件地址
     */
    private String address;

    /**
     * user_address.addressee;收件人
     */
    private String addressee;

    /**
     * user_address.phone;收件人电话
     */
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee == null ? null : addressee.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}