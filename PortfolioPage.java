package com.example.android.loginportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PortfolioPage extends AppCompatActivity {
    ListView listView;
    String[] myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portfolio_page);
        myList = getResources().getStringArray(R.array.port_options);
        listView = (ListView) findViewById(R.id.port_list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, myList);
        listView.setAdapter(adapter);
    }
}
