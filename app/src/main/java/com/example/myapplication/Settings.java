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
import android.widget.TextView;

public class Settings extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container,false);

        TextView textView = root.findViewById(R.id.textView3);



        RecyclerView recyclerView = root.findViewById(R.id.recyclerViev3);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 10));
        recyclerView.setAdapter(new FieldAdapter());


        ImageButton button = (ImageButton) root.findViewById(R.id.imageButton7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Settings.this).navigate(R.id.action_settings_to_friend);
            }
        });

        ImageButton next = root.findViewById(R.id.imageButton8);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Settings.this).navigate(R.id.action_settings_to_play);

            }
        });



        return root;
    }
}