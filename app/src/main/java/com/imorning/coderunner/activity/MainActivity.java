package com.imorning.coderunner.activity;

import android.os.Bundle;
import android.view.View;

import com.imorning.coderunner.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    private ActivityMainBinding bindingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingView = ActivityMainBinding.inflate(getLayoutInflater());
        View view = bindingView.getRoot();
        setContentView(view);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}