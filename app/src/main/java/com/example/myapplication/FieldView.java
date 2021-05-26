package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FieldView extends FrameLayout {
    public FieldView(@NonNull Context context) {
        super(context);
        init();
    }

    public FieldView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_field, this, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 10));
        FieldAdapter adapter = new FieldAdapter();
        recyclerView.setAdapter(adapter);
        adapter.onFieldClickListener = new FieldAdapter.OnFieldClickListener() {
            @Override
            public void onClick(Position position) {

            }
        };
        addView(view);


    }
}
