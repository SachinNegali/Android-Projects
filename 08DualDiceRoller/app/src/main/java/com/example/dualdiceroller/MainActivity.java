package com.example.dualdiceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDicy1;
    private ImageView imageViewDicy2;
    private Button diceButton;

    private Random myRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageViewDicy1 = findViewById(R.id.imageView);
        imageViewDicy2 = findViewById(R.id.imageView2);
        diceButton = findViewById(R.id.button);
        diceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageViewDicy1.setImageResource(myRandomNumber);

            }
        });
    }

    public void rollOurDices(){

       int myRanNumber = myRandomNumber.nextInt(6)+1;
       switch (myRanNumber){

           case 1:
               ImageView.setImageResource(R.drawable.dice1);
               break;
           case 2:
               ImageView.setImageResource(R.drawable.dice2);
               break;
           case 3:
               ImageView.setImageResource(R.drawable.dice3);
               break;
           case 4:
               ImageView.setImageResource(R.drawable.dice4);
               break;
           case 5:
               ImageView.setImageResource(R.drawable.dice5);
               break;
           case 6:
               ImageView.setImageResource(R.drawable.dice6);
               break;
       }

    }
}
