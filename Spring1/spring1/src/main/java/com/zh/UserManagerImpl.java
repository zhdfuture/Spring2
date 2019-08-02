package com.zh;

public class UserManagerImpl implements  IUserManager {
    public boolean addUser(String username, String password) {
        System.out.println("----------UserManagerImpl.addUser()----------");
        return false;
    }

    public boolean delUser(int id) {
        System.out.println("----------UserManagerImpl.delUser()----------");
        return false;
    }

    public boolean modifyUser(int id, String username, String password) {
        System.out.println("----------UserManagerImpl.modifyUser()----------");
        return false;
    }

    public void queryUser(int id) {
        System.out.println("----------UserManagerImpl.queryUser()----------");

    }
}
