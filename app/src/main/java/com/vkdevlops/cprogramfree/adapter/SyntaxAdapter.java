package com.vkdevlops.cprogramfree.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.vkdevlops.cprogramfree.MainActivity;
import com.vkdevlops.cprogramfree.R;
import com.vkdevlops.cprogramfree.SyntaxImplementation;

import org.w3c.dom.Text;

public class SyntaxAdapter extends RecyclerView.Adapter<SyntaxAdapter.Viewholder> {

    Context context;
    String[] data;
    public SyntaxAdapter(Context context,String[] s1) {
        this.context = context;
        this.data = s1;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.syntax_item,parent,false);

        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, final int position) {
        holder.SetData(data[position],position);

        holder.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SyntaxImplementation.class);
                intent.putExtra("position",position);
                intent.putExtra("title",data[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class Viewholder extends RecyclerView.ViewHolder{

        CardView heading,title;
        TextView head,tit;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.syntax_heading);
            tit = itemView.findViewById(R.id.syntax_title);
            title = itemView.findViewById(R.id.card_syntax_title);
            heading = itemView.findViewById(R.id.card_syntax_head);

            heading.setVisibility(View.INVISIBLE);
        }

        private void SetData(final String t, final int pos){
            tit.setText(t);

            switch(pos){
                case 0:
                    heading.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    heading.setVisibility(View.VISIBLE);
                    head.setText("Decision Control");
                    break;
                case 7:
                    heading.setVisibility(View.VISIBLE);
                    head.setText("Loops");
                    break;
                case 11:
                    heading.setVisibility(View.VISIBLE);
                    head.setText("Jump Statements");
                    break;
                default:
                    heading.setVisibility(View.GONE);
                    break;
            }


        }
    }
}
