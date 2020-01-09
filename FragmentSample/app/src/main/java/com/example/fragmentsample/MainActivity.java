package com.example.fragmentsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mButton;
    Boolean isDisplayFragment=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton=findViewById(R.id.open_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isDisplayFragment){
                    displayFragment();

                }else {
                    closeFragment();
                }



            }
        });

    }
    public void displayFragment(){
        SampleFragment sampleFragment=new SampleFragment();

        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,sampleFragment);
        fragmentTransaction.commit();

        mButton.setText("Close");
        isDisplayFragment = true;
    }
    public  void closeFragment(){
        FragmentManager fragmentManager=getSupportFragmentManager();
        SampleFragment sampleFragment=(SampleFragment)fragmentManager
                .findFragmentById(R.id.fragment_container);

        if(sampleFragment != null){
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.remove(sampleFragment);
            fragmentTransaction.commit();

        }
        mButton.setText("Open");
        isDisplayFragment=false;

    }

}
