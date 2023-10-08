package org.example;

//public class StrategyImpl1 extends  DefaultStrategyImpl implements Strategy{
public class StrategyImpl1 implements Strategy{
    @Override
    public void operationStrategy() {
        //super.operationStrategy();
        System.out.println("*********** Strategy 1 ***********");
    }
}
