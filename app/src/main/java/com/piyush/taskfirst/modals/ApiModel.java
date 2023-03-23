package com.piyush.taskfirst.modals;


public class ApiModel{
    int userId;
    int id;
    String title;


    public ApiModel(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
