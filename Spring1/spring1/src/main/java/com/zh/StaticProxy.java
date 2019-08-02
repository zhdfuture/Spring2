package com.zh;
//静态代理
public class StaticProxy implements IUserManager {
    //对真实对象的引用
    private IUserManager iUserManager;
    public StaticProxy(IUserManager iUserManager){
        this.iUserManager=iUserManager;
    }
    public boolean addUser(String username, String password) {
      this.checkSecurity();
        System.out.println("StaticProxy.addUser()");
        return false;
    }

    public boolean delUser(int id) {
        this.checkSecurity();
        System.out.println("========StaticProxy.delUser()=======");
        return false;
    }

    public boolean modifyUser(int id, String username, String password) {
        System.out.println("========StaticProxy.modifyUser()=======");
        return false;
    }

    public void queryUser(int id) {
        System.out.println("StaticProxy.queryUser()");
    }
    //横切关注点（安全性检查）
    public void checkSecurity(){
        System.out.println("=====CheckSecurity()====");
    }
}
