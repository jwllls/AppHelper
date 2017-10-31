package com.example.jwllls.apphelper.base;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by jwllls on 2017/10/22.
 */

public abstract class BaseActivity extends AppCompatActivity {

    public void shortToast(String str){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }

    public void longToast(String str){
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

//    public abstract void initData();
//    public abstract void initView();



}
