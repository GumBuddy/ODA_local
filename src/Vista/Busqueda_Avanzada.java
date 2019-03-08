/*
 * Created by JFormDesigner on Tue Mar 05 20:17:27 CST 2019
 */

package Vista;

import javax.swing.*;
import java.awt.*;

/**
 * @author Angelo Duriel Azcorra Moguel
 */
public class Busqueda_Avanzada extends JFrame {
    public Busqueda_Avanzada() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Angelo Duriel Azcorra Moguel
        scrollPane1 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setTitle("ODA");
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/logo.png")).getImage());
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Angelo Duriel Azcorra Moguel
    private JScrollPane scrollPane1;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
