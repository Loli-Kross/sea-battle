package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Play extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_play, container,false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerViev4);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 10));
        recyclerView.setAdapter(new FieldAdapter());

        RecyclerView recyclerView1 = root.findViewById(R.id.recyclerview);
        recyclerView1.setLayoutManager(new GridLayoutManager(getContext(), 10));
        recyclerView1.setAdapter(new FieldAdapter());



        ImageButton button = (ImageButton) root.findViewById(R.id.imageButton12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Play.this).navigate(R.id.action_play_to_home2);
            }
        });






        return root;
    }
}