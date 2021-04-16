package com.example.SeoilClient.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.SeoilClient.R;
import com.example.SeoilClient.*;

public class SlideshowFragment extends Fragment {
    static final String[] LIST_MENU = {"서비스 이용약관", "위치기반서비스이용약관", "개인정보 처리방침", "정보제공처", "버전정보"} ;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, LIST_MENU) ;
        ListView listview = (ListView) root.findViewById(R.id.listview1) ;
        listview.setAdapter(adapter) ;

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent;
                switch (i){
                    case 0:intent = new Intent(getActivity(), setting0.class);break;
                    case 1:intent = new Intent(getActivity(), setting1.class);break;
                    case 2:intent = new Intent(getActivity(), setting2.class);break;
                    case 3:intent = new Intent(getActivity(), setting3.class);break;
                    case 4:intent = new Intent(getActivity(), setting4.class);break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + i);
                }
                intent.putExtra("title",LIST_MENU[i]);

                startActivity(intent);
            }
        });
        return root;


    }
}
