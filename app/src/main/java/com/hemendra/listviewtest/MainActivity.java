package com.hemendra.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] names ={"Youtube","Facebook","Android","Amazon","Flipkart","Google","Snapchat","Instagram"};
    int[] images ={R.drawable.ic_youtube,R.drawable.ic_facebook,R.drawable.ic_amazon_web_services,R.drawable.ic_amazon_web_services,R.drawable.ic_facebook,R.drawable.ic_youtube,R.drawable.ic_snapchat,R.drawable.ic_instagram};
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

      //  ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,names);

        lv.setAdapter(new ListAdapter(MainActivity.this,names,images));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clicked"+position,Toast.LENGTH_LONG).show();
            }
        });
    }
}
