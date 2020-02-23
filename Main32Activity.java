package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main32Activity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgOne,imgTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);

        imgOne=(ImageView)findViewById(R.id.imgOne);
        imgTwo=(ImageView)findViewById(R.id.imgTwo);
        Intent j = getIntent();
        imgOne.setOnClickListener((View.OnClickListener) this);
        imgTwo.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v)
    {
        int id=v.getId();
        switch(id){
            case R.id.imgOne:
                imgOne.setVisibility(View.GONE);
                imgTwo.setVisibility(View.VISIBLE);
                break;
            case R.id.imgTwo:
                imgOne.setVisibility(View.VISIBLE);
                imgTwo.setVisibility(View.GONE);
                break;
        }
    }
}
