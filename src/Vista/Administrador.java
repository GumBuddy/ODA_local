/*
 * Created by JFormDesigner on Tue Mar 05 21:48:32 CST 2019
 */

package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author Angelo Duriel Azcorra Moguel
 */
public class Administrador extends JFrame{
    public Administrador() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Autor.getWindows();
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Licenciatura.getWindows();
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Subcategoria.getWindows();
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Subcompetencia.getWindows();
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Tipo_Objeto.getWindows();
    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
        UnidadAprendizaje.getWindows();
    }

    private void button7ActionPerformed(ActionEvent e) {
        // TODO add your code here
        Objeto_Aprendizaje.getWindows();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Angelo Duriel Azcorra Moguel
        Admistrador = new JFrame();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        label1 = new JLabel();

        //======== Admistrador ========
        {
            Admistrador.setTitle("Administrador");
            Admistrador.setIconImage(new ImageIcon(getClass().getResource("/Recursos/logo.png")).getImage());
            Admistrador.setResizable(false);
            Container AdmistradorContentPane = Admistrador.getContentPane();

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- button1 ----
                button1.setText("Autor");
                button1.addActionListener(e -> button1ActionPerformed(e));

                //---- button2 ----
                button2.setText("Licenciatura");
                button2.addActionListener(e -> button2ActionPerformed(e));

                //---- button3 ----
                button3.setText("Subcategoria");
                button3.addActionListener(e -> button3ActionPerformed(e));

                //---- button4 ----
                button4.setText("Subcompetencia");
                button4.addActionListener(e -> button4ActionPerformed(e));

                //---- button5 ----
                button5.setText("Tipo de Objeto");
                button5.addActionListener(e -> button5ActionPerformed(e));

                //---- button6 ----
                button6.setText("Unidad de Aprendizaje");
                button6.addActionListener(e -> button6ActionPerformed(e));

                //---- button7 ----
                button7.setText("Objeto de Aprendizaje");
                button7.addActionListener(e -> {
			button7ActionPerformed(e);
			button7ActionPerformed(e);
		});

                //---- label1 ----
                label1.setText("Insertar Modulo Nuevo");
                label1.setHorizontalAlignment(SwingConstants.CENTER);

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(button7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button6, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button7))
                );
            }

            GroupLayout AdmistradorContentPaneLayout = new GroupLayout(AdmistradorContentPane);
            AdmistradorContentPane.setLayout(AdmistradorContentPaneLayout);
            AdmistradorContentPaneLayout.setHorizontalGroup(
                AdmistradorContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, AdmistradorContentPaneLayout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
            );
            AdmistradorContentPaneLayout.setVerticalGroup(
                AdmistradorContentPaneLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, AdmistradorContentPaneLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
            );
            Admistrador.pack();
            Admistrador.setLocationRelativeTo(Admistrador.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Angelo Duriel Azcorra Moguel
    private JFrame Admistrador;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
