/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import gestores.GestorUsuario;
import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import modelo.Usuario;

/**
 *
 * @author alumno
 */
public class VentanaAddUsuario extends JFrame {

    private VentanaIndex e;

    public VentanaAddUsuario(VentanaIndex e) {
        initComponents();
        getContentPane().setBackground(new Color(90, 37, 193));
        setLocationRelativeTo(null);
        setVisible(true);
        this.e = e;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        tituloLbl = new javax.swing.JLabel();
        nombreInpt = new javax.swing.JTextField();
        apellidoInpt = new javax.swing.JTextField();
        apellidoLbl = new javax.swing.JLabel();
        nombreLbl = new javax.swing.JLabel();
        crearBtn = new javax.swing.JButton();
        volverBtn = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        closeLbl = new javax.swing.JLabel();
        minLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContent.setBackground(new java.awt.Color(90, 37, 153));
        panelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloLbl.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        tituloLbl.setForeground(new java.awt.Color(183, 80, 102));
        tituloLbl.setText("Añadir Usuario");
        panelContent.add(tituloLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        nombreInpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreInptActionPerformed(evt);
            }
        });
        panelContent.add(nombreInpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, 30));
        panelContent.add(apellidoInpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, 30));

        apellidoLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        apellidoLbl.setForeground(new java.awt.Color(255, 255, 255));
        apellidoLbl.setText("Apellido:");
        panelContent.add(apellidoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 60, 30));

        nombreLbl.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        nombreLbl.setForeground(new java.awt.Color(255, 255, 255));
        nombreLbl.setText("Nombre:");
        panelContent.add(nombreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, 30));

        crearBtn.setBackground(new java.awt.Color(102, 0, 102));
        crearBtn.setForeground(new java.awt.Color(255, 255, 255));
        crearBtn.setText("Crear");
        crearBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        crearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBtnActionPerformed(evt);
            }
        });
        panelContent.add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 80, 30));

        volverBtn.setBackground(new java.awt.Color(102, 0, 102));
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        panelContent.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 80, 30));

        getContentPane().add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 408, 290));

        header.setBackground(new java.awt.Color(153, 0, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        closeLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        closeLbl.setText(" x ");
        closeLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLblMouseClicked(evt);
            }
        });

        minLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minLbl.setText(" -");
        minLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 366, Short.MAX_VALUE)
                .addComponent(minLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeLbl))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(closeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(minLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBtnActionPerformed
        String name = nombreInpt.getText().trim();
        String apellido = apellidoInpt.getText().trim();

        try {
            Usuario u = new Usuario(name, apellido);
            String nombre = u.getNombre() + " " + u.getPrimerApellido();
            
            if (nombre.equalsIgnoreCase("usuario pruebas")) {
                JOptionPane.showMessageDialog(this, "Nombre reservado para el correcto funcionamiento del programa.");
            } else {
                GestorUsuario.addUsuario(u);
                JOptionPane.showMessageDialog(this, "Usuario añadido correctamente.");
                nombreInpt.setText("");
                apellidoInpt.setText("");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_crearBtnActionPerformed

    private void closeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseClicked
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeLblMouseClicked

    private void minLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLblMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minLblMouseClicked

    private int yMouse, xMouse;

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void nombreInptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreInptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreInptActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoInpt;
    private javax.swing.JLabel apellidoLbl;
    private javax.swing.JLabel closeLbl;
    private javax.swing.JButton crearBtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel minLbl;
    private javax.swing.JTextField nombreInpt;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JPanel panelContent;
    private javax.swing.JLabel tituloLbl;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
