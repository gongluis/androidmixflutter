package com.example.androdmixflutter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step1: app的buid.gradlew中 implementation project(path: ':flutter')
        //step2: project中 include ':flutter_module'   和 project(':flutter_module').projectDir = new File('../flutter_module')
        //step3: 将fluttert以fragment的形式添加到当前页面的容器
            // FlutterFragment fragment = FlutterFragment.withNewEngine().dartEntrypoint("main").build();
            //getSupportFragmentManager().beginTransaction().replace(R.id.fl_flutter,fragment).commitNow();
        //step4: 如果flutter中有插件，注册插件 GeneratedPluginRegistrant.registerWith(fragment.getFlutterEngine());
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FlutterActivity.class));
            }
        });

    }
}