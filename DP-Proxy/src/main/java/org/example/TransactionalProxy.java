package org.example;

public class TransactionalProxy implements IMetier{
    @Override
    public void process() {
        System.out.println("Begin Transaction");
        new IMetierImpl().process();
        System.out.println("Rollback ou Commit");
   }
}
