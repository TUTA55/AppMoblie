package com.example.ta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);
        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);
        Button clear_button = (Button) findViewById(R.id.clear_button);
        clear_button.setOnClickListener(this);
    }

    public void  onClick(View view){
        int id = view.getId();
        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        if(tv.length() >5) {
            if(id == R.id.clear_button){
                tv.setText("");
            }
        }
        else if(id == R.id.button_1){
            tv.setText(tv.getText().toString() + "1");
        }
        else if(id == R.id.button_2){
            tv.setText(tv.getText().toString() + "2");
        }
        else if(id == R.id.button_3){
            tv.setText(tv.getText().toString() + "3");
        }
        else if(id == R.id.button_4){
            tv.setText(tv.getText().toString() + "4");
        }
        else if(id == R.id.button_5){
            tv.setText(tv.getText().toString() + "5");
        }
        else if(id == R.id.button_6){
            tv.setText(tv.getText().toString() + "6");
        }
        else if(id == R.id.button_7){
            tv.setText(tv.getText().toString() + "7");
        }
        else if(id == R.id.button_8){
            tv.setText(tv.getText().toString() + "8");
        }
        else if(id == R.id.button_9){
            tv.setText(tv.getText().toString() + "9");
        }
        else if(id == R.id.button_0){
            tv.setText(tv.getText().toString() + "0");
        }


    }



}
