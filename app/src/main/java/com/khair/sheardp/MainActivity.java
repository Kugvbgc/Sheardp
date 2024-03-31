package com.khair.sheardp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextText;
    Button button,button2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText=findViewById(R.id.editTextText);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

        sharedPreferences=getSharedPreferences(""+getString(R.string.app_name),MODE_PRIVATE);
        editor=sharedPreferences.edit();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string=editTextText.getText().toString();
                editor.putString("name",""+string);
                editor.apply();
                Toast.makeText(MainActivity.this, "DATA SAVE IS SACESSFULY", Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));



            }
        });



























    }
}