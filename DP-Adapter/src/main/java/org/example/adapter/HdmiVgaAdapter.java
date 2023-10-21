package org.example.adapter;

import org.example.compute.HDMI;
import org.example.compute.VGA;


// Cas 1: par composition
public class HdmiVgaAdapter implements VGA {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("-----------Adapter-----------");
        byte[] msg=message.getBytes();
        hdmi.view(msg);
        System.out.println("-----------Adapter-----------");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
