#### 概述
安卓内嵌flutter的一个简单demo

#### 步骤
一、该方法是通过项目工程中创建一个flutter moduler的方式来内嵌flutter模块的的。第一步和第二步的依赖关系在创建的时候就自动加入了。
```
        //step1: app的buid.gradlew中 implementation project(path: ':flutter')
        //step2: project中 include ':flutter_module'   和 project(':flutter_module').projectDir = new File('../flutter_module')
        //step3: 将fluttert以fragment的形式添加到当前页面的容器
            // FlutterFragment fragment = FlutterFragment.withNewEngine().dartEntrypoint("main").build();
            //getSupportFragmentManager().beginTransaction().replace(R.id.fl_flutter,fragment).commitNow();
        //step4: 如果flutter中有插件，注册插件 GeneratedPluginRegistrant.registerWith(fragment.getFlutterEngine());
```