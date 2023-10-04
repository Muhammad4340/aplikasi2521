package com.example

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/func
    fun loginCek():Boolean{
        if(username.equals("rafi")&& password.equals("admin")){
            return true
        }else{
            return false
        }
    }
}