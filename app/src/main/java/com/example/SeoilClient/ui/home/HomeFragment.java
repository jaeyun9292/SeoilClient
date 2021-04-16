package com.example.SeoilClient.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.SeoilClient.R;
import com.example.SeoilClient.mangwuActivity;
import com.example.SeoilClient.myeonmogActivity;

public class HomeFragment extends Fragment{

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btn_mangwuopen=(Button)view.findViewById(R.id.btn_mangwu);
        btn_mangwuopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), mangwuActivity.class);
                startActivity(intent);
            }
        });
        Button btn_myeonmogopen=(Button)view.findViewById(R.id.btn_myeonmog);
        btn_myeonmogopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),myeonmogActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
