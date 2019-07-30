package com.example.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editText);
        editTextPassword = findViewById(R.id.editText2);

    }

    public void screenone(View view){

        String username = editTextName.getText().toString();
        String userpassword = editTextPassword.getText().toString();


        if(editTextName.length() == 0){
            editTextName.setError("Enter Name");
        } else if (editTextPassword.length() <= 5){
            editTextPassword.setError("Password should contain atleast 6 characters");
        } else {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//            intent.putExtra("name", username);
//            intent.putExtra("password", userpassword);

            Bundle bundle = new Bundle();

            bundle.putString("name", username);
            bundle.putString("password", userpassword);

            intent.putExtras(bundle);

            startActivity(intent);
        }


    }
}
