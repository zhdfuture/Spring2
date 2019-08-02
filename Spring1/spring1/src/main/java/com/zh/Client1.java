package com.zh;

public class Client1 {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy=new DynamicProxy();
        IUserManager iUserManager= (IUserManager) dynamicProxy.createDynamicProxyObjectInstance(new UserManagerImpl());
        iUserManager.addUser("Sally","888");
        iUserManager.modifyUser(1,"Sally","666");
        iUserManager.delUser(1);
    }
    }

