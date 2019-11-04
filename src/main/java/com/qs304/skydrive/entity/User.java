package com.qs304.skydrive.entity;

public class User {
    private Integer id;

    private String name;

    private Integer fileSize;

    private String accound;

    private String password;

    public User() {
    }

    public User(String name, Integer fileSize, String accound, String password) {
        this.name = name;
        this.fileSize = fileSize;
        this.accound = accound;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getAccound() {
        return accound;
    }

    public void setAccound(String accound) {
        this.accound = accound == null ? null : accound.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}