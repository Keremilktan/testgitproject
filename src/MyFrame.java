import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ExecutionException;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Proje1");
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);




        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setBackground(Color.blue);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.green);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.red);
    }
}
