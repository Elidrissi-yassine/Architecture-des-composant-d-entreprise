package dao;

import org.springframework.stereotype.Component;

@Component("cal2")
public class CalculV2 implements ICalcul{
    @Override
    public double getValue() {
        double d=150;
        return d;
    }
}
