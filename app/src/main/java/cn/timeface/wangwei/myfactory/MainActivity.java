package cn.timeface.wangwei.myfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupFruit();
    }

    private void setupFruit() {
        /**
         * 这是一个确定的工厂，如果有一个具体的苹果工厂，只需要修改苹果工厂里的内容，业务层不需要修改，达到了解耦的效果
         */
        FruitFactory factory = new AppleFactory();
        Fruit apple = factory.createFruit("apple");//生产一个水果
        apple.setColor();
        Fruit fruit = factory.orderFruit("apple");//处理过的水果

        /**
         * 这是一个确定的工厂，如果有一个具体的橘子工厂，只需要修改橘子工厂里的内容，业务层不需要修改，达到了解耦的效果
         */
        FruitFactory factoryOrange = new OrangeFactory();
        Fruit orange = factory.createFruit("orange");
        orange.setColor();
        Fruit fruitOrange = factory.orderFruit("orange");
    }
}
