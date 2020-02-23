package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    ArrayList<Budgets> budgets;
    MyAdapter adapt;
    LinearLayout layout;
    ListView List;
    //private Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneview);
        //btn_add=findViewById(R.id.btn_add);
        budgets = new ArrayList<Budgets>();
        Budgets b1 = new Budgets("Bills");
        Budgets b2 = new Budgets("Utilities");
        Budgets b3 = new Budgets("Maids");
       // Budgets b4=new Budgets("Budget Done");
        budgets.add(b1);
        budgets.add(b2);
        budgets.add(b3);
        //budgets.add(b4);
        Intent i = getIntent();
        createView();

    }



    public void createView(){
        layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT));
        layout.setFocusable(true);
        List=new ListView(this);
        List.setLayoutParams(new ListView.LayoutParams(ListView.LayoutParams.MATCH_PARENT,ListView.LayoutParams.MATCH_PARENT));
        adapt=new MyAdapter(this, R.layout.oneview,(ArrayList<Budgets>)budgets);
        List.setAdapter(adapt);
        LayoutInflater inflater=(LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        RelativeLayout r1=new RelativeLayout(this);
        r1=(RelativeLayout) inflater.inflate(R.layout.oneview,layout,false);
        r1.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT));
        TextView text=r1.findViewById(R.id.budgetname);
        text.setText("List of Budgets");
        Button btn=r1.findViewById(R.id.btn_add);
        btn.setText("ADD BUDGET");
        btn.setOnClickListener(new View.OnClickListener()

        {
            public void onClick (View v)
            {
                Intent j = new Intent(Main3Activity.this, Main32Activity.class);
                startActivity(j);
            }
        });
        layout.addView(r1);
        layout.addView(List);
        setContentView(layout);
    }
}
