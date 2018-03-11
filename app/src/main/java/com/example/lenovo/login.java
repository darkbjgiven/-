package com.example.lenovo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class login extends AppCompatActivity {

    private Button bt1;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.avtivity_login);
        bt1 =(Button) findViewById(R.id.login_button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
