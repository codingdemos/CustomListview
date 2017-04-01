package com.example.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    String[] states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.listView);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            String country = mBundle.getString("CountryName");
            if (country.equalsIgnoreCase("Australia")) {
                states = getResources().getStringArray(R.array.australia_states);
            } else if (country.equalsIgnoreCase("US")) {
                states = getResources().getStringArray(R.array.us_states);
            }
        }

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ListActivity.this,
                android.R.layout.simple_list_item_1,
                states);
        listView.setAdapter(mAdapter);
    }
}
