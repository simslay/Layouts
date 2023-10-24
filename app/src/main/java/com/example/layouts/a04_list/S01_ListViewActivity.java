package com.example.layouts.a04_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.layouts.R;

public class S01_ListViewActivity extends AppCompatActivity {
    private ListView lvListView;

    private String[] stagiaires = new String[] {
                    "David 1", "Naoufel", "Stanlenes", "Laureline", "Nadia", "Didier", "Simon", "Rima",
                    "David 2", "Naziha", "Jerôme", "Ali", "Khadim"
    };

    public void populateListView() {
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                // le contex la mise en forme les donnees a afficher
                this, android.R.layout.simple_list_item_1, stagiaires
        );

        lvListView.setAdapter(adapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s01_list_view);

        lvListView = findViewById(R.id.lv_listview);

        populateListView();
    }
}