package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.test.recyclerview.InfoActivity;
import org.test.recyclerview.R;

import java.util.List;

import Model.Listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener{
   private Context context;



    @Override
    public void onClick(View view) {


    }

    private List<Listitem> listitems;
   private RecyclerView recyclerView;


    public MyAdapter(Context context , List listitems) {
        this.context=context;
        this.listitems=listitems;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row ,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Listitem item = listitems.get(position);
     holder.name.setText(item.getName());
     holder.description.setText(item.getDescription());
        holder.age.setText(item.getAge());
    }

    @Override
    public int getItemCount() {

        int size = listitems.size();
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name;
        private TextView description;
        private TextView age;
        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            name= itemView.findViewById(R.id.title);
            description= itemView.findViewById(R.id.myinfo);
            age= itemView.findViewById(R.id.age);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Listitem item = listitems.get(position);
           // Toast.makeText(context, item.getName(), Toast.LENGTH_LONG).show();
            Intent intent1= new Intent(context, InfoActivity.class);
            intent1.putExtra("name",item.getName());
            intent1.putExtra("description",item.getDescription());
            intent1.putExtra("age",item.getAge());
            context.startActivity(intent1);


        }
    }
}
