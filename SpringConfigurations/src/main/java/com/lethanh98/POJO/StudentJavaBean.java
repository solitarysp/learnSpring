package com.lethanh98.POJO;
//java thì phải có implements java.io.Serializable
public class StudentJavaBean implements java.io.Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
