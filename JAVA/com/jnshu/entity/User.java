package com.jnshu.entity;

import java.io.Serializable;

public class User implements Serializable {

    private long id;
    private String name;
    private String password;
    private String  salt;
    private String despwd;
    private long landtime;

    @Override
    public String toString() {
        return "User{" +
                ",id=" + id +
                ",name='" + name + '\'' +
                ",password='" + password + '\'' +
                ",salt='" + salt + '\'' +
                ",despwd='" + despwd + '\'' +
                ",landtime='" + landtime +
                "}";
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getDespwd() {
        return despwd;
    }

    public void setDespwd(String despwd) {
        this.despwd = despwd;
    }

    public long getLandtime() {
        return landtime;
    }

    public void setLandtime(long landtime) {
        this.landtime = landtime;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result
                +((password == null)?0:password.hashCode());
        result = prime * result
                +((name == null)?0:name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (password == null){
            if (other.password !=null)
                return false;
        }else if (!password.equals(other.password))
            return false;
        if (name == null){
            if (other.name != null)
                return false;
        }else if (!name.equals(other.name))
            return false;
        return true;
    }

}
