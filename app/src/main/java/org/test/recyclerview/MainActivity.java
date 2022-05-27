package org.test.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.Listitem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Listitem> listitems;
    private  RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();
       // for (int x=1 ; x< 12 ; x++ ){
        //    Listitem listitem = new Listitem(
          //          "rania" + (x+1) , "Details" , "23"
          //  );
        //       listitems.add(listitem);
        //   }
        Listitem item1 =new Listitem("Rania" , "Mobile developper" , "23ans");
        Listitem item2 =new Listitem("Jack" , "Web developper" , "30ans");
        Listitem item3 =new Listitem("Daniel" , "Teacher" , "43ans");
        Listitem item4 =new Listitem("Carole" , "Mobile developper" , "53ans");
        Listitem item5 =new Listitem("Slim" , "Web developper" , "63ans");
        listitems.add(item1);
        listitems.add(item2);
        listitems.add(item3);
        listitems.add(item4);
        listitems.add(item5);
    adapter = new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);

    }
}