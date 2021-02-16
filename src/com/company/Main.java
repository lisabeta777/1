package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String phone = "89117237096";
        VerifyNumberPhone(phone);

    }
    public static void VerifyNumberPhone (String phone) {

       String phone_1 = phone.replaceFirst("\\+7", "8");
       String phone_2 = phone_1.replace(" ", "");
       String phone_3 = phone_2.replace("(",  "");
       String phone_4 = phone_3.replace(")",  "");

        int length = phone_4.length();
        if (length > 11 ){
            System.out.println("Введен некорректный номер; Количество символов больше 11");}
        else {
            System.out.println(phone_4);

            if (phone_1 != phone) {
                System.out.print("Замена +7 на 8; ");
            }
            if (phone_1 != phone_4) {
                System.out.print("В номере есть пробелы и/или скобки");
            }
            if (phone == phone_4) {
                System.out.print("Не было изменений");
            }
        }

    }
}
