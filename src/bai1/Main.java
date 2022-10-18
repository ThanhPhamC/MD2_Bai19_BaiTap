package bai1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao ten lop hoc");
            String strName=sc.nextLine();
        Pattern pattern=Pattern.compile("^[APC]\\d{4}[GHIKLM]$");
        Matcher matcher= pattern.matcher(strName);
        boolean checkVali= matcher.matches();
        if (checkVali){
            System.out.println("Ten chinh xac");
        }else {
            System.out.println("Sai dinh dang");
        }
    }
}