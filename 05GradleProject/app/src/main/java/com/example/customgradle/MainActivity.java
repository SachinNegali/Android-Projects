package com.example.customgradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPressed(View view){
        switch (view.getId()){
            case R.id.errorButton:
                Toasty.error(this,"Login Failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sucessButton:
                Toasty.success(this,"Login success", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this,"information here", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this,"oops", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this,"Some Random Thing", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_attach_money)).show();
                break;
        }
    }
}
