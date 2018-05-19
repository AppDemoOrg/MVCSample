package com.abt.mvc.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.abt.mvc.base.BaseActivity;
import com.abt.mvc.impl.MainImpl;
import com.abt.mvc.model.MainModel;
import com.abt.mvc.R;
import com.orhanobut.logger.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @描述： @MainActivity
 * @作者： @黄卫旗
 * @创建时间： @20/05/2018
 */
public class MainActivity extends BaseActivity implements MainImpl {

    private MainModel mModel;

    @BindView(R.id.tv_view) TextView mView;

    @OnClick(R.id.btn) void btn() {
        loadData();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d("onCreate");
        ButterKnife.bind(this);
        mModel = new MainModel();
    }

    @Override
    public void loadData() {
        mModel.loadData(mView);
    }

}