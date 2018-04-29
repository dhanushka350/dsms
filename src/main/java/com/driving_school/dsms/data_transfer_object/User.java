package com.driving_school.dsms.data_transfer_object;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 178882957864354065L;
    private Long userid;
    private String name;
    private String pass;

    public User(Long userid, String name, String pass) {
        this.userid = userid;
        this.name = name;
        this.pass = pass;
    }

    public User() {
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("userid=").append(userid);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
