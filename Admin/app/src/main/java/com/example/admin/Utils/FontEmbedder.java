package com.example.admin.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import me.myatminsoe.mdetect.MDetect;

import com.example.admin.BorrowBookActivity;
import com.example.admin.MainApplication;


import java.util.List;


public class FontEmbedder {

    private static Typeface typeface;

    public static void init(Typeface typeface){
        FontEmbedder.typeface = typeface;
    }

    public static String force(TextView textView, String text){
        textView.setText(Moduler.mercyOnZgUser(text));
        textView.setTypeface(typeface);
        return text;
    }
    public static String force(String text){
        return Moduler.mercyOnZgUser(text);
    }

    public static void forceTitle(TextView textView, String text) {
        textView.setText(Moduler.mercyOnZgUser(text));
        if(MDetect.INSTANCE.isUnicode()) {
            textView.setTypeface(MainApplication.typefaceManager.getMyanmarSagar());
        } else {
            textView.setTypeface(typeface);
        }
    }

    public static void force(Button button, String text){
        button.setText(Moduler.mercyOnZgUser(text));
        button.setTypeface(typeface);
    }

    public static void force(Button button){

        force(button, button.getText().toString());
    }
}
