package com.xw.rent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xw.baselib.utils.StatusBarHelper;

public class UbarOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubar_out);
        StatusBarHelper.translucent(this);
    }
}