package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String phone = "+791172 3) 7096";
        System.out.println(Arrays.toString(VerifyNumberPhone(phone)));
    }

    public static String[] VerifyNumberPhone (String phone) {

        String phone_1 = phone.replaceFirst("\\+7", "8");
        String phone_2 = phone_1.replace(" ", "");
        String phone_3 = phone_2.replace("(", "");
        String phone_4 = phone_3.replace(")", "");

        String[] array  = {"", ""};
        int length = phone_4.length();
        if (length > 11) {
            array[0] = "Введен некорректный номер; Количество символов больше 11";
        } else {
            array[0] = phone_4;

            if (!phone_1.equals(phone)) {
                array[1] = "Замена +7 на 8; ";
            }
            if (!phone_1.equals(phone_4)) {
                array[1] = array[1] + "В номере есть пробелы и/или скобки";
            }
            if (phone.equals(phone_4)) {
                array[1] = "Не было изменений";
            }
        }
        return array;
    }

}
