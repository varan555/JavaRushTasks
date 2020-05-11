package com.javarush.task.task36.task3608.model;



import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

/**
 * Created by JUVA on 12.02.2020.
 */
public class ModelData {
    private List<User> users;
    private User activeUser;
    private boolean displayDeletedUserList;

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }

    public boolean isDisplayDeletedUserList() {

        return displayDeletedUserList;
    }

    public void setActiveUser(User activeUser) {
        setDisplayDeletedUserList(true);
        this.activeUser = activeUser;
    }

    public User getActiveUser() {

        return activeUser;
    }

    public void setUsers(List<User> users) {
        setDisplayDeletedUserList(isDisplayDeletedUserList());
        this.users = users;
    }

    public List<User> getUsers() {

        return users;
    }
}
