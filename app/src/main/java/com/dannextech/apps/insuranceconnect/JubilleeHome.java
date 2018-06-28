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

public class JubilleeHome extends AppCompatActivity {

    ListView lvJubilleeTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jubillee_home);

        lvJubilleeTypes = findViewById(R.id.lvJubilleeTypes);

        ArrayList<String> types = new ArrayList<>();
        types.add("Medical");
        types.add("Travel");
        types.add("Property");

        lvJubilleeTypes.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,types));

        lvJubilleeTypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (lvJubilleeTypes.getItemAtPosition(position).equals("Travel")){
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }else if (lvJubilleeTypes.getItemAtPosition(position).equals("Property")){
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }else if (lvJubilleeTypes.getItemAtPosition(position).equals("Medical")){
                    startActivity(new Intent(getApplicationContext(),BritamMedical.class));
                }else {
                    Snackbar.make(view,"Still to be implimented",Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
