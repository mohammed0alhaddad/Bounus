package com.hell.bounus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {
   EditText t1,t2,t3;
    public String sname="l",sid="l",saddr="l",gender="l",nation="l";
   public String ss="Test";
   int=10;

    Button b1,b2;
    String data1[]= {"Choose"};
    Spinner spinner1;
    ArrayList list= new ArrayList(Arrays.asList(data1));
    RadioGroup radioGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link();


      b1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              data();








          }
      });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   sid= t1.getText().toString();
                sname=t2.getText().toString();
                saddr= t3.getText().toString();
                nation= spinner1.getSelectedItem().toString();

          Toast.makeText(MainActivity.this,sid+sname+saddr+nation,Toast.LENGTH_LONG).show();


*/
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                Toast.makeText(MainActivity.this, "Selected Radio Button: " + radioButton.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void data(){
        sid= t1.getText().toString();
        sname=t2.getText().toString();
        saddr= t3.getText().toString();
        nation= spinner1.getSelectedItem().toString();
        Intent intent = new Intent (MainActivity.this,MainActivity2.class);
        intent.putExtra("id",sid);
        intent.putExtra("name",sname);
        intent.putExtra("address",saddr);
        intent.putExtra("nation",nation);
        startActivity(intent);


    }
    public void link(){
        t1= findViewById(R.id.t1);
        t2= findViewById(R.id.t2);
        t3= findViewById(R.id.t3);
        b1= findViewById(R.id.b1);
        b2= findViewById(R.id.b2);
        spinner1= findViewById(R.id.spinner1);
        String items[]= {"Yemen","USA","Saudia Arabia"};

        ArrayAdapter myAdapter1= new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,items);
        spinner1.setAdapter(myAdapter1);
    }

    public void checkButton(View v) {
    /*    int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        gender=  radioButton.getText().toString();
    */}
}
