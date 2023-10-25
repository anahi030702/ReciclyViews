package com.example.reciclyviews.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reciclyviews.R;
import com.example.reciclyviews.models.pikachu;

import java.util.List;

public class pikachuAdapter extends RecyclerView.Adapter<pikachuAdapter.ViewHolder> {


    public pikachuAdapter(List<pikachu> pikachus) {
        this.pikachus = pikachus;
    }

    private List<pikachu> pikachus;

    @NonNull
    @Override
    public pikachuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly=LayoutInflater.from(parent.getContext());
        View v=ly.inflate(R.layout.pokemoni, parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull pikachuAdapter.ViewHolder holder, int position) {
        pikachu p=pikachus.get(position);
    }

    @Override
    public int getItemCount() {
        return pikachus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtchapeteizq;
        TextView txtchapeteder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtchapeteder=itemView.findViewById(R.id.txtchapeteder);
            txtchapeteizq=itemView.findViewById(R.id.txtchapeteizq);
        }

        public void setdata(pikachu p)
        {
            txtchapeteizq.setText(p.getChapeteizq().getColor());
            txtchapeteder.setText(p.getChapeteder().getColor());
        }
    }
}
