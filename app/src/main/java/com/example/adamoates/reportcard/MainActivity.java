package com.example.adamoates.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ReportCard> grades = new ArrayList<ReportCard>();

        grades.add(new ReportCard("Adam Oates", "A", "A", "A"));

        ReportCardAdapter adapter = new ReportCardAdapter(this, grades);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
