package org.twitter.com;

public class TweetException extends Exception{
    private int errCode;
    private String erorMess;
    public TweetException (int errCode) {
        super() ;
        this.errCode = errCode ;
        if(errCode==1) {
            this.erorMess = "Tweet tidak boleh kosong!";
        }
        else if(errCode==2) {
            this.erorMess = "Tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter";
        }
    }
    public TweetException (String erorMess) {
        super(erorMess);
    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErorMess() {
        return this.erorMess;
    }
}
