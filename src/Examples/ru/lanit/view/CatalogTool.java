package Examples.ru.lanit.view;

import Examples.ru.lanit.stocklist.GenericItem;
import Examples.ru.lanit.stocklist.ItemCatalog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class CatalogTool extends JFrame {

    JTable gui_table;
    JScrollPane jsp;
    Vector<Vector> table;
    Vector<String> col_names;
    JPanel south = new JPanel();
    JLabel l_item = new JLabel();
    JLabel l_price = new JLabel();
    boolean flag = false;

    JTextField f_item = new JTextField();
    JTextField f_price = new JTextField();

    JButton add_btn = new JButton("Добавить");

    public CatalogTool(ItemCatalog cat) {
        super("Каталог товаров");
        table = new Vector<Vector>();
        Vector<String> table_row;
        ArrayList<GenericItem> list = cat.getALCatalog();
        for (GenericItem item : list) {
            table_row = new Vector<>();
            table_row.add(item.getName());
            table_row.add("" + item.getPrice());
            table.add(table_row);
        }
        col_names = new Vector<String>();
        col_names.add("Товар");
        col_names.add("Цена");
        gui_table = new JTable(table, col_names);
        jsp = new JScrollPane(gui_table,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setupGUI();
    }

    public void setupGUI() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.add(jsp);
        south.setLayout(new BoxLayout(south, BoxLayout.Y_AXIS));
        l_item.setText("Товар");
        l_price.setText("Цена");
        south.add(l_item);
        south.add(f_item);
        south.add(l_price);
        south.add(f_price);
        south.add(add_btn);
        c.add("South", south);
        CatalogTool frame = this;

        add_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = f_item.getText();
                float price = Float.parseFloat(f_price.getText());
                if (name == "") {

                } else {
                    GenericItem item = new GenericItem(name, price);
                    Vector<String> table_row = new Vector<>();
                    table_row.add(item.getName());
                    table_row.add(item.getPrice() + "");
                    table.add(table_row);
                    gui_table = new JTable(table, col_names);
                    if (flag) {
                        frame.setSize(frame.getWidth() - 1, frame.getHeight() - 1);
                        flag = false;
                    } else {
                        frame.setSize(frame.getWidth() + 1, frame.getHeight() + 1);
                        flag = true;
                    }
                }
            }

        });
        this.setSize(320, 400);
        this.setVisible(true);
    }


}
