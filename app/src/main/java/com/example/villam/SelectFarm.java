package com.example.villam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.villam.detailfarm.Detail;

public class SelectFarm extends AppCompatActivity {

    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_farm);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView3);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectFarm.this, Detail.class);
                Bundle bundle = new Bundle();

                bundle.putString("id", "Tinnguyen");

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }
}
