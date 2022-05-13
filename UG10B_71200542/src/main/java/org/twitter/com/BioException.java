package org.twitter.com;

public class BioException extends Exception{
    private int errCode ;
    private String erorMess;
    public BioException (int errCode){
        super();
        this.errCode = errCode;
        if(errCode==1) {
            this.erorMess = "Bio tidak boleh kosong";
        }
        else if (errCode==2) {
            this.erorMess = "Bio minimal harus terdiri dari 5 karakter dan maksimal 30 karakter";
        }
        else if (errCode==3) {
            this.erorMess = "Bio tidak boleh mengandung karakter spesial selain titik, et(@), serta spasi";
        }
    }
    public BioException (String erorMess) {
        super(erorMess);
    }
    public int getErrCode() {
        return this.errCode;
    }
    public String getErrorMessage() {
        return  this.erorMess;
    }
}
