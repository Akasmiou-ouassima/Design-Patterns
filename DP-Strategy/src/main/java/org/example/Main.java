package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context = new Context();
   /*     context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();*/

        Scanner scanner = new Scanner(System.in);
        Map<String, Strategy> strategyMap = new HashMap<>();
        Strategy strategy;
        while (true) {
            System.out.println("Quelle stratégie ?");
            String strategyClassName = scanner.nextLine(); //org.example.StrategyImpl1
            strategy = strategyMap.get(strategyClassName);
            if (strategy == null) {
                System.out.println("Création d'un nouvel objet de stratégie");
                strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
                strategyMap.put(strategyClassName,strategy);

            }
            context.setStrategy(strategy);
            context.effectuerOperation();
       }

    }

}

