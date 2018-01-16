package jtli.com.appforfun;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jingtian(Tansent).
 */

public class RecycleViewActivity extends Activity {

    RecyclerView rvAndroid;
    BaseQuickAdapter mAdapter;
    public List<FoodItem> foodList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        context = getBaseContext();
        foodList = new ArrayList<FoodItem>();
        FoodItem food1 = new FoodItem("strawberry smoothe",  3.50,
                getResources().getDrawable(R.drawable.strawberry_smoothe), false);
        FoodItem food2 = new FoodItem("omlete", 4.30,
                getResources().getDrawable(R.drawable.omelette), false);
        FoodItem food3 = new FoodItem("fry wings",  5.99,
                getResources().getDrawable(R.drawable.chicken_wing), false);
        FoodItem food4 = new FoodItem("cheeseburger", 3.99,
                getResources().getDrawable(R.drawable.cheeseburger),false);
        FoodItem food5 = new FoodItem("salami pizza", 5.50,
                getResources().getDrawable(R.drawable.salami_pizza),false);
        FoodItem food6 = new FoodItem("sandwich", 4.00,
                getResources().getDrawable(R.drawable.sandwich),false);
        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
        foodList.add(food5);
        foodList.add(food6);

        mAdapter = new ListAdapter(foodList);
//        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
//
//            }
//        });
        ((ListAdapter) mAdapter).setOnItemClickListener(new ListAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(FoodItem positionData, View view) {
                Log.d("tag",positionData.getName());
                Toast.makeText(context,positionData.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        rvAndroid = findViewById(R.id.rv_android);
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        rvAndroid.setAdapter(mAdapter);

    }

}
