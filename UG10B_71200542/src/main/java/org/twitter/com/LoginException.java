package org.twitter.com;

public class LoginException extends Exception{
    private int errCode;
    private String erorMess;
    public LoginException (int errCode) {
        super() ;
        this.errCode = errCode ;
        if(errCode==1) {
            this.erorMess = "Username tidak boleh kosong!";
        }
        else if (errCode==2) {
            this.erorMess = "Password tidak boleh kosong!";
        }
        else if(errCode==3) {
            this.erorMess = "Maaf, username atau password salah! Silahkan coba lagi!";
        }
    }
    public LoginException (String erorMess) {
        super(erorMess);
    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErorMess() {
        return this.erorMess;
    }
}
