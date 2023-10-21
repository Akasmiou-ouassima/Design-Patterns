package org.example.compute;

import org.example.adapter.HdmiVgaAdapter;
import org.example.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        System.out.println();

        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Bonjour");
        System.out.println();

        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonjour");
        System.out.println();

        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        uniteCentrale.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapterH.print("Bonjour");
        System.out.println();

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.print("Bonjour");
        System.out.println();

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapter1);
        uniteCentrale.print("Bonjour");
    }
}
