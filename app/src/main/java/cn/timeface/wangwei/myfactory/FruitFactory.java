package cn.timeface.wangwei.myfactory;

/**
 * Created by wangwei on 2016/8/19.
 */
public abstract class FruitFactory {

    public Fruit orderFruit(){
        Fruit fruit = createFruit( );
        return fruit;
    }

    public abstract Fruit createFruit();
}
