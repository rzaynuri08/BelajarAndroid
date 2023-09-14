package com.example.belajargit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class CountryActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country2);
        listView = findViewById(R.id.Lv_negara);
        adapter = ArrayAdapter.createFromResource(this, R.array.Country, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapter.getItem(i), Toast.LENGTH_SHORT).show();
    }
}