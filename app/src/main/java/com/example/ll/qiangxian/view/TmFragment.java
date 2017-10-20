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
import java.util.List;

public class TmFragment extends Fragment {
    private ListView mList;
    List<Bean> listb=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tm, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        listb.add(new Bean("羊毛衫",R.mipmap.ic_launcher,"190"));
        MyAdapter adapter=new MyAdapter(getActivity(),listb);
        mList.setAdapter(adapter);
    }

    private void initView(View view) {
        mList = (ListView) view.findViewById(R.id.mList);
    }
}
