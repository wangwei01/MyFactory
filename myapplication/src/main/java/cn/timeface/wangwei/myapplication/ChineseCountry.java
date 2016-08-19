package cn.timeface.wangwei.myapplication;

/**
 * Created by wangwei on 2016/8/19.
 */
public class ChineseCountry implements Factory {
    @Override
    public FruitFactory createFactory() {
        return new Apple();
    }

    @Override
    public TeastFactory countryFactory() {
        return new SweetTeastFactory();
    }
}
