package com.vkdevlops.cprogramfree.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.vkdevlops.cprogramfree.ImplementOtherPrograms;
import com.vkdevlops.cprogramfree.R;


public class OtherAdapter extends RecyclerView.Adapter<OtherAdapter.MyViewHolder>  {

    Context context;
    String[] data;
    public OtherAdapter(Context mContext, String[] s1){
        context = mContext;
        data = s1;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.other_program,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        switch (position){
            case 0:
                holder.head_card.setVisibility(View.VISIBLE);
                holder.head_title.setText("General Utility Programs");
                holder.img.setImageResource(R.drawable.general_icon);
                break;

            case 71:
                holder.head_card.setVisibility(View.VISIBLE);
                holder.head_title.setText("Basic Programs");
                holder.img.setImageResource(R.drawable.basic_program_icon);
                break;

            case 95:
                holder.head_card.setVisibility(View.VISIBLE);
                holder.head_title.setText("Conversion Programs");
                holder.img.setImageResource(R.drawable.conversion_icon);
                break;

            default:
                holder.head_card.setVisibility(View.GONE);
                break;
        }

        holder.p_name.setText(data[position]);
        holder.p_no.setText(String.valueOf(position+1).concat(" >"));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), ImplementOtherPrograms.class);
                intent.putExtra("position",position+1);
                intent.putExtra("prog_name",data[position]);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView p_name,p_no,head_title;
        ImageView img;
        CardView cardView,head_card;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            p_no = itemView.findViewById(R.id.program_no);
            p_name = itemView.findViewById(R.id.program_title);
            cardView = itemView.findViewById(R.id.other_cardview);
            head_card = itemView.findViewById(R.id.other_program_title_head);
            head_title = itemView.findViewById(R.id.other_program_hear_title);
            img = itemView.findViewById(R.id.other_program_head_image);

        }
    }
}
