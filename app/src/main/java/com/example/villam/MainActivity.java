package com.example.villam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    EditText username, password;
    Button login;
    TextView txtQuenMK;
    CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        username = (EditText) findViewById(R.id.edtUser);
        password = (EditText) findViewById(R.id.edtPass);
        login = (Button) findViewById(R.id.btnDN);
        txtQuenMK = (TextView) findViewById(R.id.qmk);
        checkbox = (CheckBox) findViewById(R.id.checkBox);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectFarm.class);
                startActivity(intent);
            }
        });





    }
}
