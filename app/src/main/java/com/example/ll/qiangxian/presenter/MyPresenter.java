package com.example.ll.qiangxian.presenter;
import android.support.v4.app.Fragment;
import com.example.ll.qiangxian.model.InterfaceModel;
import com.example.ll.qiangxian.model.RealizeInterfaceModel;
import com.example.ll.qiangxian.view.InterfaceView;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MyPresenter{
   private RealizeInterfaceModel model;
   private InterfaceView view;
    public MyPresenter(InterfaceView view) {
        this.view = view;
         model=new RealizeInterfaceModel();
    }
    public  void  min(){
        model.listf(new InterfaceModel() {
            @Override
            public void datas(List<Fragment> listf, List<String> lists) {
                view.isShowViewPager(listf,lists);
            }
        });
    }
}
