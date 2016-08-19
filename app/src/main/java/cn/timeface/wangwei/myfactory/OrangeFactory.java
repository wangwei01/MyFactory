package cn.timeface.wangwei.myfactory;

/**
 * Created by wangwei on 2016/8/19.
 */
public class OrangeFactory extends FruitFactory {
    @Override
    public Fruit createFruit(String type) {
        if (type.equals("orange")) {
            Fruit fruit = new Orange();
            return fruit;
        }
        return null;
    }
}
