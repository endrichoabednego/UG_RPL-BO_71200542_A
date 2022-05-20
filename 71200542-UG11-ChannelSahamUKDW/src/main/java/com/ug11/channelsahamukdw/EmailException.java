package com.ug11.channelsahamukdw;

public class EmailException extends Exception {
    private String errorMessage;
    private Integer errorCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public EmailException(int errorCode) {
    super();
    this.errorCode = errorCode;
    if(errorCode==1) {
        this.errorMessage = "login gagal! Email Anda tidak terdaftar dalam UKDW";
    }
    else if (errorCode==2){
        this.errorMessage = "login gagal! Email UKDW Anda tidak valid. ";
    }
    }
}

