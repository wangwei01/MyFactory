package cn.timeface.wangwei.myfactory;

/**
 * Created by wangwei on 2016/8/19.
 */
public class AppleFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        Fruit fruit = new Apple();
        return fruit;
    }

}
