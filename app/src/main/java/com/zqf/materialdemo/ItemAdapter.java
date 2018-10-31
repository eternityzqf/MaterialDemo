package com.zqf.materialdemo;

import android.content.Context;
import android.widget.TextView;

import java.util.List;

/**
 * Author：zqf
 * Time：2018/10/31 15:24
 * desc：
 */
public class ItemAdapter extends BaseRecyclerAdapter<String> {

    public ItemAdapter(Context context, List<String> datas) {
        super(context, R.layout.item_string, datas);
    }

    @Override
    public void convert(BaseRecyclerHolder holder, String item, int position) {
        TextView tv = holder.getView(R.id.tv);
        tv.setText(item);

    }
}
