package com.zh;

public interface IUserManager {
    public boolean addUser(String username,String password);
    public boolean delUser(int id);
    public boolean modifyUser(int id,String username,String password);
    public void queryUser(int id);
}
