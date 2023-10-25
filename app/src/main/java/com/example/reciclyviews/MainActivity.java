package com.example.reciclyviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.reciclyviews.adapters.pikachuAdapter;
import com.example.reciclyviews.models.Chapete;
import com.example.reciclyviews.models.pikachu;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<pikachu> pikachus = new ArrayList<>();
        pikachus.add(new pikachu(new Chapete("Amarillo"), new Chapete("Rojo")));

        rc =findViewById(R.id.rc);
        pikachuAdapter piA=new pikachuAdapter(pikachus);
        rc.setAdapter(new pikachuAdapter(pikachus));

        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);

    }
}