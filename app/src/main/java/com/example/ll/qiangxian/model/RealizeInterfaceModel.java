package com.example.ll.qiangxian.model;
import android.support.v4.app.Fragment;

import com.example.ll.qiangxian.view.QxFragment;
import com.example.ll.qiangxian.view.TmFragment;
import java.util.ArrayList;
import java.util.List;
public class RealizeInterfaceModel implements MyCallBack{
    @Override
    public void listf(InterfaceModel model) {
        List<Fragment> listff = new ArrayList<>();
        listff.add(new QxFragment());
        listff.add(new QxFragment());
        listff.add(new TmFragment());
        listff.add(new QxFragment());
        listff.add(new QxFragment());

       List<String> listt = new ArrayList<>();
        listt.add("推荐");
        listt.add("最新");
        listt.add("特卖爆推");
        listt.add("倒计时");
        listt.add("预告");
     model.datas(listff,listt);
    }
}
