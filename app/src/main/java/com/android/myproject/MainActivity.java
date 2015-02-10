package com.android.myproject;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener{

    String name[]  ={"Uma","Neeraj","Asha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Run fghfghdhgfhd");
        System.out.println("print");
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(this);
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);

        Handler myHandler = new Handler() {
            @Override
            public void handleMessage(Message msg) {

               



            }

        };
        myHandler.sendEmptyMessage(0);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this,name[0],Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this,name[1],Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(this,name[2],Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(this,name[3],Toast.LENGTH_LONG).show();
                break;





        }


    }


}
