package com.example.mohil.taxly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout monthContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        monthContainer = (LinearLayout) findViewById(R.id.data);
        setSupportActionBar(toolbar);
    }
    public void addMonth(View view){
        View monthView = LayoutInflater.from(this).inflate(R.layout.data_month, monthContainer, false);
        TextView displayedMonth = (TextView) monthView.findViewById(R.id.data_month_month);
        TextView displayedStipend = (TextView) monthView.findViewById(R.id.data_month_stipend);
        TextView displayedOhip = (TextView) monthView.findViewById(R.id.data_month_ohip);
        TextView displayedOverhead = (TextView) monthView.findViewById(R.id.data_month_overhead);
        monthContainer.addView(monthView);
    }
}
