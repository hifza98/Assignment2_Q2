package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;

import java.util.ArrayList;
public class MyAdapter extends ArrayAdapter<Budgets> {
    private ArrayList<Budgets> budgets;
    private Context context;
    private Button btn_add;
    public MyAdapter(Context context, int resource, ArrayList<Budgets> b)
    {
        super(context,resource,b);
        this.budgets=b;
        this.context=context;
    }
    public Budgets getitem(int index)
    {
        return budgets.get(index);
    }
    @Override
    public int getCount()
    {
        return budgets.size();
    }
    @Override
    public View getView(int index, View convertView, ViewGroup parent)
    {
        final Budgets bdgt=getItem(index);
        if(convertView==null)
        {
            LayoutInflater inflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.oneview,parent, false);
        }
        TextView name=(TextView) convertView.findViewById(R.id.budgetname);
        name.setText(bdgt.budget_name);
        final EditText box=convertView.findViewById(R.id.editbox);
        return convertView;
    }
}
