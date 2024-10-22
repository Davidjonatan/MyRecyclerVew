package com.example.myrecyclervew;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
RecyclerView recyclerView=findViewById(R.id.recyclervew);
List<Item> items = new ArrayList<Item>();
items.add(new Item("jhonwick","jhon.wick@email.com", R.drawable.a));
items.add(new Item("pancho","pancho.pantera@email.com",R.drawable.b));
items.add(new Item("andress","andress.cadames@email.com",R.drawable.c));
items.add(new Item("manolo","manolo.pedrolok@email.com",R.drawable.d));

recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}