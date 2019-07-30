package com.example.dualbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // Button clickMe;
   // Button dont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*clickMe = findViewById(R.id.clickMe);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("test1","good one");
            }
        });*/

//        dont = findViewById(R.id.dontTouch);
//
//        dont.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Log.d("test2","The Hell Bro");
//            }
//        });
    }

    public void bluepressed(View view){
       Log.d("test","just by method");

       Context context = getApplicationContext();
       CharSequence msg = "Toast from ClickMe";
       int duration = Toast.LENGTH_SHORT;

       Toast toast = Toast.makeText(context, msg, duration);
       toast.show();

    }

    public void dontTouch(View view){

//        Context context = getApplicationContext();
//        CharSequence text = "Warned you not to Touch";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

        Toast.makeText(this, "Warned You Not To Touch", Toast.LENGTH_SHORT).show();
    }
}
