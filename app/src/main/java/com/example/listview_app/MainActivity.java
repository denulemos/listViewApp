package com.example.listview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private TextView info;
private ListView options;
private String nombres[] = {"Denisse" , "Pablo" , "Juan", "Juana" , "Juanita", "Elvira" , "Homero"};
private String infoNom[]= {"18", "21" , "23" , "54" , "65" ,"60", "22"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = (TextView) findViewById(R.id.tv1);
        options = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listview_st , nombres);
        options.setAdapter(adapter);

        options.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                info.setText("La edad de " + options.getItemAtPosition(position) + " es " + infoNom[position] + " años");
            }
        });
    }
}
