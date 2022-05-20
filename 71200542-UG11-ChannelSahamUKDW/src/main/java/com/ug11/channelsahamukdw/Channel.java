package com.ug11.channelsahamukdw;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private Integer totalTag;
    private final String regex = "^(.+)@students.ukdw.ac.id";

    public void login(String emailku)throws EmailException{
        this.email=emailku;

        try {
            if (emailku.matches("(.*)@students.ukdw.ac.id") == false) {
                throw new EmailException(1);
            } else if (emailku.matches("(.)[.](.)@(.*)")==false){
                throw new EmailException(2);
            } else {
                System.out.println("login berhasil");
            }
        } catch (EmailException e){
            System.out.println("Error: "+e.getErrorMessage());
        }
    }
    public void printInfo()
    {
        String[] splitEmails = email.split("([\\.@])");

        System.out.println("Nama depan: " + splitEmails[0].toUpperCase());
        System.out.println("Nama belakang: " + splitEmails[1].toUpperCase());
        System.out.println("Email: "+ email);
        System.out.println("Total tag: "+ totalTag);
    }
    public void bagikanIde(String ide) {
        int total = 0;
        String tag = "";
        System.out.println("Ide: " + ide);
        StringBuilder sb = new StringBuilder();
        String[] arrOfStr = ide.split(" ");
        for (String a : arrOfStr) {
            Pattern att = Pattern.compile("^#(.+)");
            Matcher menti = att.matcher(a);
            if (menti.matches() == true) {
                sb.append(tag);
                tag = ", ";
                sb.append(a);
                this.totalTag += 1;
                total++;
            }
        }
        if (this.totalTag < 1) {
            System.out.println("Saham yang anda mention: -");
            System.out.println("Total saham yang anda tag: " + total);

        } else {
            System.out.println("Saham yang anda mention: " + sb.toString().trim());
            System.out.println("Total saham yang anda tag: " + total);
        }
    }
    }
