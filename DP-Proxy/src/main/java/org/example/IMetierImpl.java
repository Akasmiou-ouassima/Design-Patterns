package org.example;

public class IMetierImpl implements IMetier {
    @Override
   // @Transactionnal
  //  @Cachable
    public void process() {
        System.out.println("Traitement");
    }
}
