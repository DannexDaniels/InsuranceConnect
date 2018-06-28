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

public class ApaHome extends AppCompatActivity {

    ListView lvAPATypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apa_home);

        lvAPATypes = findViewById(R.id.lvAPATypes);

        ArrayList<String> types = new ArrayList<>();
        types.add("Medical");
        types.add("Travel");
        types.add("Property");

        lvAPATypes.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,types));

        lvAPATypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (lvAPATypes.getItemAtPosition(position).equals("Travel")){
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }else if (lvAPATypes.getItemAtPosition(position).equals("Property")){
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }else if (lvAPATypes.getItemAtPosition(position).equals("Medical")){
                    startActivity(new Intent(getApplicationContext(),BritamMedical.class));
                }else {
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
