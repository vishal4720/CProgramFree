package com.vkdevlops.cprogramfree.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.vkdevlops.cprogramfree.Implement_Pattern_Programs;
import com.vkdevlops.cprogramfree.R;

public class PatternAdapter extends RecyclerView.Adapter<PatternAdapter.MyViewHolder> {
    String[] data;
    int[] images;
    Context context;
    public PatternAdapter(Context mContext,String[] s1,int[] img){
        context = mContext;
        images = img;
        data = s1;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.programs,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.name.setText(data[position]);
        holder.img.setImageResource(images[position]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Implement_Pattern_Programs.class);
                intent.putExtra("position",position);
                intent.putExtra("image",images[position]);
                intent.putExtra("data",data[position]);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView img;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.program_txt);
            img = itemView.findViewById(R.id.program_img);
            cardView = itemView.findViewById(R.id.pattern_cardview);
        }
    }
}
