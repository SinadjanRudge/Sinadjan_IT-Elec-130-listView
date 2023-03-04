package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    ListView listView;
    TextView textView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_List);

        listView=(ListView)findViewById(R.id.listView);
        listItem=getResources().getStringArray(R.array.Robots);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.my_List,R.id.textView,listItem);
        listView.setAdapter(adapter);

        listView.SetOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=adapter.getItem(position);
                Toast.makeToast(getApplicationContext(), value,Toast.LENGTH_SHORT).show();
            }
        }

    );
    }
}