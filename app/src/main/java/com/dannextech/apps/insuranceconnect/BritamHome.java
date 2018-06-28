package com.dannextech.apps.insuranceconnect;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BritamHome extends AppCompatActivity {

    ListView lvTypes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_britam_home);

        lvTypes = findViewById(R.id.lvTypes);

        //String [] types = {"Life", "Motor", "Medical"};

        ArrayList<String> types = new ArrayList<>();
        types.add("Life");
        types.add("Motor");
        types.add("Medical");

        lvTypes.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,types));

        lvTypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (lvTypes.getItemAtPosition(position).equals("Life")){
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }else if (lvTypes.getItemAtPosition(position).equals("Motor")){
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }else if (lvTypes.getItemAtPosition(position).equals("Medical")){
                    startActivity(new Intent(getApplicationContext(),BritamMedical.class));
                }else {
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
