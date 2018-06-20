package com.ldxiaofeng.android.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());//用replaceFragment()加载碎片
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                replaceFragment(new RightFragment2());
                break;
            default:
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {//加载碎片
        FragmentManager fragmentManager = getSupportFragmentManager();//
        FragmentTransaction transaction = fragmentManager.beginTransaction();//开启一个事务
        transaction.replace(R.id.right_layout,fragment);//向容器添加碎片
        transaction.addToBackStack(null);//将事务加入返回栈
        transaction.commit();//提交事务
    }
}
