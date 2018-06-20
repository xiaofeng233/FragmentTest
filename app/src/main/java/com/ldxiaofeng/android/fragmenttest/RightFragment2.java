package com.ldxiaofeng.android.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 13178 on 2018-6-14.
 */

public class RightFragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savefInstanceState){
        View view = inflater.inflate(R.layout.right_fragment_2,container,false);
        return view;
    }
}
