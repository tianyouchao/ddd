package org.example;

public class PasswrodNumber {
    public String NAME(String newname){
        String oldname=new String();
        oldname="tianyouchao";
        if (newname.equals(oldname)){
            System.out.println("用户正确");
            //System.out.println(PASS(pass));
        }else {
            newname="用户名有误";
        }
        return newname;
    }
    public String PASS(String newpass){
        String oldpass=new String();
        oldpass="20011101";
        if (newpass.equals(oldpass)){
            newpass="密码正确";
        }else {
            newpass="密码错误";
        }
        return newpass;
    }
}
