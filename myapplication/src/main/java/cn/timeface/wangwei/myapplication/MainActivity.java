package cn.timeface.wangwei.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *实现了创建了一个提供一系列得接口，由接口来指定相关的实例去实现他。
         */
        Factory factory = new ChineseCountry();

        FruitFactory apple = factory.createFactory();//实现了自己的功能
        apple.setColor();

        TeastFactory teastFactory = factory.countryFactory();//实现了自己的功能
        teastFactory.setTeast();
    }
}
