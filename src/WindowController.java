import javax.swing.*;
import java.awt.*;

public class WindowController extends JPanel {
    private final static int width = 500;
    private final static int height = 500;
    public WindowController() {
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
    }
}
