package com.zh;

public class Client {
    public static void main(String[] args) {
        IUserManager iUserManager=new StaticProxy(new UserManagerImpl());
        iUserManager.addUser("Sally","888");
        iUserManager.modifyUser(1,"Sally","666");
        iUserManager.delUser(1);

    }
}
