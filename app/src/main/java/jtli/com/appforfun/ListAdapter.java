package jtli.com.appforfun;

import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import butterknife.internal.Utils;

/**
 * Created by Jingtian(Tansent).
 */

public class ListAdapter  extends BaseQuickAdapter<FoodItem, BaseViewHolder> {


    public ListAdapter(List<FoodItem> data) {
        super(R.layout.list_item_food_info, data);
    }

    @Override
    protected void convert(final BaseViewHolder helper, final FoodItem item) {
        helper.setText(R.id.tv_food_name,item.getName());
        helper.setText(R.id.tv_food_price, String.valueOf( item.getPrice()));
        helper.setImageDrawable(R.id.iv_food_icon, item.getIcon());
        helper.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClickListener(item, helper.getView(R.id.iv_food_icon));
            }
        });
    }

    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClickListener(FoodItem positionData, View view);}

}
