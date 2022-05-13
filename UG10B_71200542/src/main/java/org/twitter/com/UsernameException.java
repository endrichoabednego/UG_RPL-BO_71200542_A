package org.twitter.com;

public class UsernameException extends Exception{
    private int errCode ;
    private String erorMess;
    public UsernameException (int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1) {
            this.erorMess = "Username tidak boleh kosong!";
        }
        else if (errCode==2) {
            this.erorMess = "Password minimal terdiri dari 6 karakter";
        }
        else if (errCode==3) {
            this.erorMess = "Username hanya boleh terdiri dari huruf, angka, dan simbol underscore";

        }
    }
    public UsernameException (String erorMess) {
        super (erorMess);
    }
    public int getErrCode(){
        return this.errCode;
    }
    public String getErorMess() {
        return this.erorMess;
    }
    }



