package com.example.ll.qiangxian.view;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.ll.qiangxian.R;
import com.example.ll.qiangxian.model.Bean;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    Context context;
    List<Bean> list;

    public MyAdapter(Context context, List<Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolders2 vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_2, null);
            vh=new ViewHolders2(convertView);
            convertView.setTag(vh);
        }else {
            vh= (ViewHolders2) convertView.getTag();
        }
        vh.img.setImageResource(list.get(position).getImg());
        vh.name.setText(list.get(position).getName());
        vh.money.setText(list.get(position).getMoney());
        vh.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context,YjActivity.class));
            }
        });
        return convertView;
    }
    public static class ViewHolders2 {
        public View rootView;
        public ImageView img;
        public TextView name;
        public TextView money;

        public ViewHolders2(View rootView) {
            this.rootView = rootView;
            this.img = (ImageView) rootView.findViewById(R.id.img);
            this.name = (TextView) rootView.findViewById(R.id.name);
            this.money = (TextView) rootView.findViewById(R.id.money);
        }

    }
}
