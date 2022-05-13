package org.twitter.com;


import java.util.Scanner;
public class User
{
    private String Username;

    private String Password;


    public User(String username, String password) {
        this.Username = username;
        this.Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    public static void main(String[] args) throws UsernameException,TweetException,LoginException,BioException {
        User user = new User ("u71200542", "p71200542");
        System.out.println("Selamat datang di Twitter");
        System.out.println("Silakan login dengan akun Anda");
        Scanner Username = new Scanner(System.in);
        System.out.print("Username : ");
        String newUsername;
        newUsername = Username.nextLine();
        Scanner Password = new Scanner(System.in);
        System.out.print("Password : ");
        String newPassword ;
        newPassword = Password.nextLine();
        Boolean login = false;

        try {
            if (newUsername.equals(user.getUsername()) && newPassword.equals(user.getPassword())) {
                System.out.println("Selamat datang di Twitter, u71200542");
            } else if (newUsername.isEmpty()) {
                throw new UsernameException(1);
            } else if (newUsername.length() < 6) {
                throw new UsernameException(2);

            }
        }
            catch (UsernameException e) {
            System.out.print("Error : " + e.getErorMess());

        }
        boolean flagKecil = false;
        boolean flagBesar = false;
        boolean flagAngka = false;
        for (int i = 0; i < newPassword.length(); i++) {
            char c = newPassword.charAt(i);
            if (Character.isLetter(c) &&
                    Character.isLowerCase(c))
                flagKecil = true;
            if (Character.isLetter(c) &&
                    Character.isUpperCase(c))
                flagBesar = true ;
            if(Character.isDigit(c))
                flagAngka = true;


    }

    }
}
