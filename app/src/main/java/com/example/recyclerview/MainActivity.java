package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager LayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(LayoutManager);
        ArrayList<DataShop> arrayList=new ArrayList<>();
        arrayList.add(new DataShop(R.drawable.acer,"ACER"));
        arrayList.add(new DataShop(R.drawable.dell,"DELL"));
        arrayList.add(new DataShop(R.drawable.mayban,"MAY BAN"));
        arrayList.add(new DataShop(R.drawable.macboook,"MACBOOK"));
        arrayList.add(new DataShop(R.drawable.maytinh,"LENOVO"));
        ShopAdapter shopAdapter= new ShopAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);
    }
}