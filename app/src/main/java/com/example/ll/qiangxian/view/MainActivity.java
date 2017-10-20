package com.example.ll.qiangxian.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.example.ll.qiangxian.R;
import com.example.ll.qiangxian.adapter.MyPagerAdapter;
import com.example.ll.qiangxian.presenter.MyPresenter;
import java.util.List;

public class MainActivity extends AppCompatActivity implements InterfaceView {
    private TabLayout tab;
    private MyPagerAdapter adapter;
    MyPresenter presenter = new MyPresenter(this);
    private MyViewPage pager_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        pager_view = (MyViewPage) findViewById(R.id.pager_view);
        presenter.min();
    }
    @Override
    public void isShowViewPager(List<Fragment> listf, List<String> lists) {
        tab.setupWithViewPager(pager_view);
        adapter = new MyPagerAdapter(getSupportFragmentManager(), listf, lists);
        pager_view.setAdapter(adapter);
        pager_view.setPagingEnabled(false);
        pager_view.setCurrentItem(0);
    }
}
