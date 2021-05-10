package com.example.androdmixflutter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class FlutterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);
        //将fluttert以fragment的形式添加到当前页面的容器
        FlutterFragment fragment = FlutterFragment.withNewEngine().dartEntrypoint("main").build();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_flutter,fragment).commitNow();

        //如果flutter中有插件，需要注册插件
        GeneratedPluginRegistrant.registerWith(fragment.getFlutterEngine());
    }
}