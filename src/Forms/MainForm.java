//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Forms;

import Util.Logger;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame {
    int hashcode1;
    int hashcode2;

    public MainForm() {
        this.setDefaultCloseOperation(3);
        this.setTitle("Main Form");
        this.setSize(600, 200);
        this.setLayout(new FlowLayout(2));
        this.setVisible(true);
        JButton b1 = new JButton("Show Calender 1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                MainForm.this.showNewCalender();
            }
        });
        JButton b2 = new JButton("Show Calender 2");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                MainForm.this.showNewCalender();
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(2));
        panel.add(b1);
        panel.add(b2);
        this.add(panel);
    }

    public int showNewCalender() {
        SwingCalendar sc = SwingCalendar.getInstance();
        Logger.log("Object HC: " + sc.hashCode());
        sc.setVisible(true);
        int hash = sc.hashCode();
        return hash;
    }
}
