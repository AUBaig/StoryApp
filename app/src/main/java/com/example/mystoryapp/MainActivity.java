package com.example.mystoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        String[] titleStr = getResources().getStringArray(R.array.title1);
        String[] Stories = getResources().getStringArray(R.array.story);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,titleStr);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         String posTitle = titleStr[position];
         String fulS = Stories[position];

         Intent intent=new Intent(MainActivity.this,StroiesActivity.class);
         intent.putExtra("title",posTitle);
         intent.putExtra("fS",fulS);
         startActivity(intent);

            }
        });
    }
}