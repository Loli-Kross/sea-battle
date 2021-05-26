package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FieldAdapter extends RecyclerView.Adapter<FieldAdapter.FieldViewHolder> {

    public OnFieldClickListener onFieldClickListener;
    Mode mode;
    @NonNull
    @Override
    public FieldViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_field_view_holder, parent, false);
        return new FieldViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FieldViewHolder holder, int position) {
        holder.bind(new Position(position%10, position/10));
    }

    @Override
    public int getItemCount() {
        return 100;
    }


    public class FieldViewHolder extends RecyclerView.ViewHolder{

        public Position position;
        public FieldViewHolder(@NonNull View itemView) {
            super(itemView);
            final ImageView imageView =  itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onFieldClickListener.onClick(position);
                    imageView.setImageResource(R.drawable.image2);
                }
            });

        }
        public void bind(Position position) {
            this.position = position;
        }

    }
    interface OnFieldClickListener {
        void onClick(Position position);
    }


}
