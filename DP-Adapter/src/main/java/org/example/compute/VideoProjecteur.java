package org.example.compute;

public class VideoProjecteur implements VGA{
    @Override
    public void print(String message) {
        System.out.println("---------VP-----------");
        System.out.println(message);
        System.out.println("---------VP-----------");
    }
}
