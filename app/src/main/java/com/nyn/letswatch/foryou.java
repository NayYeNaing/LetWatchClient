package com.nyn.letswatch;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class foryou extends Fragment {
    RecyclerView outerRV;

    public foryou() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_foryou,container,false);

        outerRV = view.findViewById(R.id.outerRecyclerView);

        forYouAdapter forYouAdapter = new forYouAdapter(getContext());
        outerRV.setAdapter(forYouAdapter);
        outerRV.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        return view;
    }
}
