import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);

        var windowController = new WindowController();
        window.add(windowController);
        window.pack();

        window.setVisible(true);
    }
}