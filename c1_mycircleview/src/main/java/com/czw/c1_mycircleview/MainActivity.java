package com.czw.c1_mycircleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
* @author wenSome
*
*
*/
public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //新分支456
        //123
        //789
        setdata("分支");

        mTextView=findViewById(R.id.tv);

        mTextView.setText(getdata());
    }

    String sedata;
    public String getdata(){
        if(sedata!=null){
            return "data";
        }else{
            return null;
        }

    }

    public void setdata(String data){
        sedata=data;
    }


}
