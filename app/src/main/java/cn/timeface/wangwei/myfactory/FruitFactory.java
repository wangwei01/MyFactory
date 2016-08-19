package cn.timeface.wangwei.myfactory;

/**
 * Created by wangwei on 2016/8/19.
 */
public abstract class FruitFactory {

    public Fruit orderFruit(String  type){
        Fruit fruit = createFruit(type );
        return fruit;
    }

    public abstract Fruit createFruit(String  type);
}
