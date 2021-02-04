package com.hell.bounus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public String sname="l",sid="l",saddr="l",gender="l",nation="l";
    Button b1;
    public TextView tx1,tx2,tx3,tx4,tx5,tx6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        link();




//Dtfyhjklkjhgfd dfghjk dfghj

        
        sid= getIntent().getStringExtra("id");
        sname= getIntent().getStringExtra("name");
        saddr= getIntent().getStringExtra("address");

        nation= getIntent().getStringExtra("nation");

        tx1.setText(sid);
        tx2.setText(sname);
        tx3.setText(saddr);

        tx5.setText(nation);



    }

    public void link(){
        tx1= findViewById(R.id.tx1);
        tx2= findViewById(R.id.tx2);
        tx3= findViewById(R.id.tx3);
        tx4= findViewById(R.id.tx4);
        tx5= findViewById(R.id.tx5);
    }
}