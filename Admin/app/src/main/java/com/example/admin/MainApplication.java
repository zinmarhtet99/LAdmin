package com.example.admin;

import android.app.Application;


import com.example.admin.Utils.FontEmbedder;
import com.example.admin.Utils.Moduler;
import com.example.admin.Utils.TypeFaceManager;

import me.myatminsoe.mdetect.MDetect;

public class MainApplication extends Application {

    public static TypeFaceManager typefaceManager;

    @Override
    public void onCreate() {
        super.onCreate();

        MDetect.INSTANCE.init(this);
        typefaceManager = new TypeFaceManager(getAssets());

        if (MDetect.INSTANCE.isUnicode()){
            FontEmbedder.init(typefaceManager.getShitUnicode());
            Moduler.init(true);
        }else{
            FontEmbedder.init(typefaceManager.getShitZawgyi());
            Moduler.init(false);
        }
    }



}

