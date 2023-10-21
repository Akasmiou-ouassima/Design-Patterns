package org.example;

public class Controller {
   // @Autowired
    private IMetier metier=new TransactionalProxy();

    public String index(){
        metier.process();
        return "index";
    }
}
