package org.example;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Design Patterns");
        root.add(new File("Composite.java"));
        root.add(new File("Adapter.java"));
        Folder folder = (Folder) root.add(new Folder("src"));
        folder.add(new File("Main.java"));
        folder.add(new File("Strings.java"));

        root.show();
    }
}
