//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Forms;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SwingCalendar extends JFrame {
    public static SwingCalendar hashcodetest;
    DefaultTableModel model;
    Calendar cal = new GregorianCalendar();
    JLabel label;

    SwingCalendar() {
        this.setDefaultCloseOperation(2);
        this.setTitle("Swing Calendar");
        this.setSize(300, 200);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.label = new JLabel();
        this.label.setHorizontalAlignment(0);
        JButton b1 = new JButton("<-");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                SwingCalendar.this.cal.add(2, -1);
                SwingCalendar.this.updateMonth();
            }
        });
        JButton b2 = new JButton("->");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                SwingCalendar.this.cal.add(2, 1);
                SwingCalendar.this.updateMonth();
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(b1, "West");
        panel.add(this.label, "Center");
        panel.add(b2, "East");
        String[] columns = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        this.model = new DefaultTableModel((Object[][])null, columns);
        JTable table = new JTable(this.model);
        JScrollPane pane = new JScrollPane(table);
        this.add(panel, "North");
        this.add(pane, "Center");
        this.updateMonth();
    }

    public static SwingCalendar getInstance() {
        if (hashcodetest == null && hashcodetest == null) {
            hashcodetest = new SwingCalendar();
        }

        return hashcodetest;
    }

    void updateMonth() {
        this.cal.set(5, 1);
        String month = this.cal.getDisplayName(2, 2, Locale.US);
        int year = this.cal.get(1);
        this.label.setText(month + " " + year);
        int startDay = this.cal.get(7);
        int numberOfDays = this.cal.getActualMaximum(5);
        int weeks = this.cal.getActualMaximum(4);
        this.model.setRowCount(0);
        this.model.setRowCount(weeks);
        int i = startDay - 1;

        for(int day = 1; day <= numberOfDays; ++day) {
            this.model.setValueAt(day, i / 7, i % 7);
            ++i;
        }

    }
}
