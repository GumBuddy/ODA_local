/*
 * Created by JFormDesigner on Tue Mar 05 19:36:09 CST 2019
 */

package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author Angelo Duriel Azcorra Moguel
 */
public class Index extends JFrame {
    public Index() {
        initComponents();
    }

    private void Boton_BuscarActionPerformed(ActionEvent e) {
        // TODO add your code here
        Busqueda_General.getWindows();
    }

    private void Busqueda_AvanzadaActionPerformed(ActionEvent e) {
        // TODO add your code here
        Vista.Busqueda_Avanzada.getWindows();
    }

    private void ModuloAdministradorActionPerformed(ActionEvent e) {
        // TODO add your code here
        Administrador.getWindows();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Angelo Duriel Azcorra Moguel
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        CampoBusqueda = new JTextField();
        Boton_Buscar = new JButton();
        label1 = new JLabel();
        panel3 = new JPanel();
        Carreras = new JComboBox();
        Unidad_De_Aprendizaje = new JComboBox();
        Busqueda_Avanzada = new JButton();
        label2 = new JLabel();
        panel4 = new JPanel();
        button1 = new JButton();
        label3 = new JLabel();

        //======== this ========
        setTitle("Sistema de Busqueda de Objetos de Aprendizaje ");
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/logo.png")).getImage());
        setResizable(false);
        setBackground(new Color(0, 102, 204));
        setForeground(Color.blue);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== panel1 ========
                {

                    GroupLayout panel1Layout = new GroupLayout(panel1);
                    panel1.setLayout(panel1Layout);
                    panel1Layout.setHorizontalGroup(
                        panel1Layout.createParallelGroup()
                            .addGap(0, 245, Short.MAX_VALUE)
                    );
                    panel1Layout.setVerticalGroup(
                        panel1Layout.createParallelGroup()
                            .addGap(0, 110, Short.MAX_VALUE)
                    );
                }

                //======== panel2 ========
                {

                    //---- Boton_Buscar ----
                    Boton_Buscar.setText("Realiza tu Busqueda");
                    Boton_Buscar.addActionListener(e -> Boton_BuscarActionPerformed(e));

                    //---- label1 ----
                    label1.setText("Busqueda General");

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                        panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(Boton_Buscar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CampoBusqueda, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(10, Short.MAX_VALUE))
                    );
                    panel2Layout.setVerticalGroup(
                        panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoBusqueda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_Buscar)
                                .addContainerGap())
                    );
                }

                //======== panel3 ========
                {

                    //---- Busqueda_Avanzada ----
                    Busqueda_Avanzada.setText("Realiza tu Busqueda");
                    Busqueda_Avanzada.addActionListener(e -> {
			Busqueda_AvanzadaActionPerformed(e);
			Busqueda_AvanzadaActionPerformed(e);
		});

                    //---- label2 ----
                    label2.setText("Busqueda Avanzada");

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(Unidad_De_Aprendizaje, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(Carreras, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(label2)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                .addContainerGap(166, Short.MAX_VALUE)
                                .addComponent(Busqueda_Avanzada)
                                .addGap(156, 156, 156))
                    );
                    panel3Layout.setVerticalGroup(
                        panel3Layout.createParallelGroup()
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(10, 10, 10)
                                .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(Unidad_De_Aprendizaje)
                                    .addComponent(Carreras))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Busqueda_Avanzada)
                                .addGap(61, 61, 61))
                    );
                }

                //======== panel4 ========
                {

                    //---- button1 ----
                    button1.setText("Ingresar");
                    button1.setIconTextGap(5);
                    button1.addActionListener(e -> ModuloAdministradorActionPerformed(e));

                    //---- label3 ----
                    label3.setText("Modulo Administrador");

                    GroupLayout panel4Layout = new GroupLayout(panel4);
                    panel4.setLayout(panel4Layout);
                    panel4Layout.setHorizontalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel4Layout.createParallelGroup()
                                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                    );
                    panel4Layout.setVerticalGroup(
                        panel4Layout.createParallelGroup()
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(label3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1)
                                .addContainerGap(55, Short.MAX_VALUE))
                    );
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Angelo Duriel Azcorra Moguel
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField CampoBusqueda;
    private JButton Boton_Buscar;
    private JLabel label1;
    private JPanel panel3;
    private JComboBox Carreras;
    private JComboBox Unidad_De_Aprendizaje;
    private JButton Busqueda_Avanzada;
    private JLabel label2;
    private JPanel panel4;
    private JButton button1;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
