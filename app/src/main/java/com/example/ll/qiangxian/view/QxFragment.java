package com.example.ll.qiangxian.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.ll.qiangxian.R;
import com.example.ll.qiangxian.model.Bean;

import java.util.ArrayList;

public class QxFragment extends Fragment {
    private ListView list_view;
    ArrayList<Bean> listd=new ArrayList<>();
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qx, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        listd.add(new Bean(null,R.mipmap.ic_launcher,null));
        MyListAdapter listAdapter=new MyListAdapter(getActivity(),listd);
        list_view.setAdapter(listAdapter);
    }

    private void initView(View view) {
        list_view = (ListView) view.findViewById(R.id.list_view);
    }
}
