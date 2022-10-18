package bai2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("nhap sdt");
//        String phoneNumber=sc.nextLine();
//        Pattern pattern=Pattern.compile("^\\d{2}[-][0]\\d{8}$");
//        Matcher matcher= pattern.matcher(phoneNumber);
//        boolean checkVali= matcher.matches();
//        String checkStr="aomacanada";
//        System.out.println(checkStr.matches("aoma"));
//        if (checkVali){
//            System.out.println("Ten chinh xac");
//        }else {
//            System.out.println("Sai dinh dang");
//        }
        // cach 2.
        String stringPattern= "^\\d{2}[-][0]\\d{8}$";
        String checkValiphone= "12-012345678";
        boolean checkOut= checkValiphone.matches(stringPattern);
        if (checkOut){
            System.out.println("Chinh xac");
        }else {
            System.out.println("Sai dinh dang");
        }
    }
}
