package com.hail.mytab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by 小智
 * on 2017/9/6
 * 描述：
 */

public class Tab3Fragment extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null) {
            initView(inflater);
        } else {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null) {
                parent.removeView(view);
            }
        }
        return view;
    }
    private void initView(LayoutInflater inflater) {
        view = inflater.inflate(R.layout.fragment_home3, null);
        ButterKnife.bind(this, view);
    }
}
