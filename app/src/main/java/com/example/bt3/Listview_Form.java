package com.example.bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Listview_Form extends AppCompatActivity {
    ListView lvnhac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview__form);
        getSupportActionBar().setTitle("List Nhac");
        lvnhac=findViewById(R.id.lvnhac);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Cham Day Noi Dau_ Mr.Siro");
        arrayList.add("Lang Nghe Nuoc Mat_ Mr.Siro");
        arrayList.add("Tinh Yeu Chap Va_ Mr.Siro");
        arrayList.add("Tu lau Nuoc Mat_ Mr.Siro");
        arrayList.add("Duong Mat La Lam_ Mr.Siro");
        arrayList.add("Mot Buoc Yeu Van Dam Dau_ Mr.Siro");
        arrayList.add("Em Gai Mua_ Mr.Siro");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        lvnhac.setAdapter(arrayAdapter);
    }

    public void btn_ProfileForm(View view) {
        startActivity(new Intent(getApplicationContext(),profile.class));
    }
}
