package org.example.adapter;

import org.example.compute.TV;
import org.example.compute.VGA;


// Cas 2: par héritage
public class HdmiVgaAdapterH extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("-----------Adapter-----------");
        byte[] msg=message.getBytes();
        super.view(msg);
        System.out.println("-----------Adapter-----------");
    }


}
