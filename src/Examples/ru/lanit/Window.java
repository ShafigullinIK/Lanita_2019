package Examples.ru.lanit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Window extends JFrame {

    public Window(){
        this.setVisible(true);
        this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 800, 600);
        this.setLayout(null);
        JButton button = new JButton();
        button.setText("Я кнопочка");
        button.setBounds(600, 450, 170, 60);
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Меня нажали");
            }
        });
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Random r = new Random();
                int x = r.nextInt(600 - button.getWidth());
                int y = r.nextInt(400 - button.getHeight());
                button.setBounds(x,y,button.getWidth(), button.getHeight());
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
