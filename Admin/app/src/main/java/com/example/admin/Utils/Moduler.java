package com.example.admin.Utils;

import me.myatminsoe.mdetect.Rabbit;

public class Moduler {

    private static boolean isUnicode;

    public static void init(boolean isUnicode){
        Moduler.isUnicode = isUnicode;
    }

    public static String stringToUni(String text){
        if(!isUnicode){
            return Rabbit.zg2uni(text);
        }
        return text;
    }

    public static String mercyOnZgUser(String text){
        if (isUnicode){
            return text;
        }else{
            return Rabbit.uni2zg(text);
        }
    }
}

