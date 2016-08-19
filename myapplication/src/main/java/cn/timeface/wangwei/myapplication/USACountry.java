package cn.timeface.wangwei.myapplication;

/**
 * Created by wangwei on 2016/8/19.
 */
public class USACountry implements Factory {
    @Override
    public FruitFactory createFactory() {
        return new Orange();
    }

    @Override
    public TeastFactory countryFactory() {
        return new BitterTeastFactory();
    }
}
