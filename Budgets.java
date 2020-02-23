package com.example.myapplication;

public class Budgets {
    String budget_name;

    Budgets(String s)
    {
        budget_name=s;
    }
    public String getName()
    {
        return budget_name;
    }
    public boolean contains(String text)
    {
        return getName().contains(text);
    }
}

