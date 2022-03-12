package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button press = findViewById(R.id.button);
        EditText finaly =  findViewById(R.id.editTextTextPersonName);
        EditText finaly2 =  findViewById(R.id.editTextTextPersonName2);







        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();



        press.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String bagData = finaly.getText().toString();
                String bagData2 = finaly2.getText().toString();
                if (finaly.getText().toString().isEmpty() || finaly2.getText().toString().isEmpty()){

              }else{
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("finaly", bagData);
                    intent.putExtra("finaly2", bagData2);
                    startActivity(intent);
              }
            }











        });


































    }
}