


import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import javax.swing.*;

/**
 * Name: Izzy Hurley
 * Lab Name: GUIPrototype
 * Lab Purpose: The goal of GUIPrototype is to create a program
 * Date: 2/19/19
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class GUIPrototype {
        public static ArrayList runPopup() {
            ArrayList list = new ArrayList();
            Object AntibioticsQ = new String();
            Object StartingColQ = new String();
            Object ReasourceQ = new Object();


            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("How Many Starting Antibiotics?:"));
            String[] items = {"One", "Two", "Three", "Four", "Five"};
            String[] numbers = {"10", "20", "30", "40", "50", "60", "70", "80", "90", "100" };
            JComboBox combo = new JComboBox(items);
            JComboBox field1 = new JComboBox(numbers);

            panel.add(combo);
            panel.add(new JLabel("How many starting colonies?:"));
            panel.add(field1);
            panel.add(new JLabel("Would you like your field to be resource restricted?: (beta)"));
            Boolean [] items2= {true,false};
            JComboBox jComboBox2 = new JComboBox(items2);
            panel.add(jComboBox2);
            int result = JOptionPane.showConfirmDialog(null, panel, "Test",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {

               AntibioticsQ = combo.getSelectedItem();
               list.add(AntibioticsQ);
               StartingColQ = field1.getSelectedItem();
               list.add(StartingColQ);
               ReasourceQ = jComboBox2.getSelectedItem();
               list.add(ReasourceQ);

                System.out.println(AntibioticsQ);

            } else {
                System.out.println("Cancelled");
            }
       return list;

        }
    }







