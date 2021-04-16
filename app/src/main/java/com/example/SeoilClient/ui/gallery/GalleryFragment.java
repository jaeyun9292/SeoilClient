package com.example.SeoilClient.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.SeoilClient.ExpandableListAdapter;
import com.example.SeoilClient.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.widget.ExpandableListView;

public class GalleryFragment extends Fragment {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        expListView = (ExpandableListView) root.findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(getContext(),listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
        return root;
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("운행시간 및 배차정보");
        listDataHeader.add("코로나 관련 운행시간");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add(
                "면목역 노선\n" +
                "운행시간           배차간격\n" +
                "08:00~09:10      10분\n" +
                "09:10~10:00      15분\n" +
                "\n" +
                "망우역 노선\n" +
                "운행시간           배차간격\n" +
                "08:00~09:20      10분\n" +
                "09:20~10:00      15분");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("정상적으로운행 중 입니다.");


        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
    }
}
