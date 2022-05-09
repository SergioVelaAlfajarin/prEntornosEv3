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
import modelo.CuentaBanco;
import modelo.CuentaNetflix;
import modelo.Trabajo;
import modelo.Usuario;

/**
 *
 * @author alumno
 */
public class VentanaGestor extends JFrame {

    private int yMouse, xMouse;
    private VentanaIndex e;
    private Usuario u;

    public VentanaGestor(VentanaIndex e, Usuario u) {
        initComponents();
        getContentPane().setBackground(new Color(90, 37, 193));
        setLocationRelativeTo(null);
        setVisible(true);
        this.e = e;
        this.u = u;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelCuentaBanco = new javax.swing.JPanel();
        retiraSaldoButton = new javax.swing.JButton();
        ingresaSaldoButton = new javax.swing.JButton();
        addCuentaBancoButton = new javax.swing.JButton();
        CuentaBancoTituloLbl = new javax.swing.JLabel();
        panelTrabajo = new javax.swing.JPanel();
        addAntiguedadButton = new javax.swing.JButton();
        trabajarButton = new javax.swing.JButton();
        TrabajoTituloLbl = new javax.swing.JLabel();
        panelUsuario = new javax.swing.JPanel();
        CambiaTrabajoButton = new javax.swing.JButton();
        cambiaNombreButton = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        usuarioTituloLbl = new javax.swing.JLabel();
        panelCuentaNetflix = new javax.swing.JPanel();
        cobrarButton = new javax.swing.JButton();
        addPerfilButton = new javax.swing.JButton();
        addCuentaNetflixButton = new javax.swing.JButton();
        CuentaNetflixTituloLbl = new javax.swing.JLabel();
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

        labelTitulo.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(153, 0, 102));
        labelTitulo.setText("GESTOR USUARIO");
        panelContent.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        panelCuentaBanco.setBackground(new java.awt.Color(73, 21, 91));
        panelCuentaBanco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        retiraSaldoButton.setBackground(new java.awt.Color(90, 37, 153));
        retiraSaldoButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        retiraSaldoButton.setForeground(new java.awt.Color(255, 255, 255));
        retiraSaldoButton.setText("Retirar Saldo");
        retiraSaldoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiraSaldoButtonActionPerformed(evt);
            }
        });

        ingresaSaldoButton.setBackground(new java.awt.Color(90, 37, 153));
        ingresaSaldoButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        ingresaSaldoButton.setForeground(new java.awt.Color(255, 255, 255));
        ingresaSaldoButton.setText("Ingresar Saldo");
        ingresaSaldoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaSaldoButtonActionPerformed(evt);
            }
        });

        addCuentaBancoButton.setBackground(new java.awt.Color(90, 37, 153));
        addCuentaBancoButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        addCuentaBancoButton.setForeground(new java.awt.Color(255, 255, 255));
        addCuentaBancoButton.setText("Añadir Cuenta Banco");
        addCuentaBancoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCuentaBancoButtonActionPerformed(evt);
            }
        });

        CuentaBancoTituloLbl.setForeground(new java.awt.Color(255, 255, 255));
        CuentaBancoTituloLbl.setText("CUENTA BANCO");

        javax.swing.GroupLayout panelCuentaBancoLayout = new javax.swing.GroupLayout(panelCuentaBanco);
        panelCuentaBanco.setLayout(panelCuentaBancoLayout);
        panelCuentaBancoLayout.setHorizontalGroup(
            panelCuentaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentaBancoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelCuentaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentaBancoLayout.createSequentialGroup()
                        .addGroup(panelCuentaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ingresaSaldoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCuentaBancoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retiraSaldoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentaBancoLayout.createSequentialGroup()
                        .addComponent(CuentaBancoTituloLbl)
                        .addGap(53, 53, 53))))
        );
        panelCuentaBancoLayout.setVerticalGroup(
            panelCuentaBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentaBancoLayout.createSequentialGroup()
                .addComponent(CuentaBancoTituloLbl)
                .addGap(23, 23, 23)
                .addComponent(addCuentaBancoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresaSaldoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retiraSaldoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        panelContent.add(panelCuentaBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 190, 180));

        panelTrabajo.setBackground(new java.awt.Color(73, 21, 91));
        panelTrabajo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        addAntiguedadButton.setBackground(new java.awt.Color(90, 37, 153));
        addAntiguedadButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        addAntiguedadButton.setForeground(new java.awt.Color(255, 255, 255));
        addAntiguedadButton.setText("Añadir Antiguedad");
        addAntiguedadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAntiguedadButtonActionPerformed(evt);
            }
        });

        trabajarButton.setBackground(new java.awt.Color(90, 37, 153));
        trabajarButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        trabajarButton.setForeground(new java.awt.Color(255, 255, 255));
        trabajarButton.setText("Trabajar");
        trabajarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajarButtonActionPerformed(evt);
            }
        });

        TrabajoTituloLbl.setForeground(new java.awt.Color(255, 255, 255));
        TrabajoTituloLbl.setText("TRABAJO");

        javax.swing.GroupLayout panelTrabajoLayout = new javax.swing.GroupLayout(panelTrabajo);
        panelTrabajo.setLayout(panelTrabajoLayout);
        panelTrabajoLayout.setHorizontalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabajarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAntiguedadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TrabajoTituloLbl)
                .addGap(59, 59, 59))
        );
        panelTrabajoLayout.setVerticalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajoLayout.createSequentialGroup()
                .addComponent(TrabajoTituloLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(trabajarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addAntiguedadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        panelContent.add(panelTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 170, 180));

        panelUsuario.setBackground(new java.awt.Color(73, 21, 91));
        panelUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        CambiaTrabajoButton.setBackground(new java.awt.Color(90, 37, 153));
        CambiaTrabajoButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        CambiaTrabajoButton.setForeground(new java.awt.Color(255, 255, 255));
        CambiaTrabajoButton.setText("Cambiar Trabajo");
        CambiaTrabajoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiaTrabajoButtonActionPerformed(evt);
            }
        });

        cambiaNombreButton.setBackground(new java.awt.Color(90, 37, 153));
        cambiaNombreButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cambiaNombreButton.setForeground(new java.awt.Color(255, 255, 255));
        cambiaNombreButton.setText("Cambiar Nombre");
        cambiaNombreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiaNombreButtonActionPerformed(evt);
            }
        });

        infoBtn.setBackground(new java.awt.Color(90, 37, 153));
        infoBtn.setForeground(new java.awt.Color(255, 255, 255));
        infoBtn.setText("Informacion Usuario");
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        usuarioTituloLbl.setForeground(new java.awt.Color(255, 255, 255));
        usuarioTituloLbl.setText("USUARIO");

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cambiaNombreButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(CambiaTrabajoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(usuarioTituloLbl)
                .addGap(60, 60, 60))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addComponent(usuarioTituloLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(cambiaNombreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CambiaTrabajoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelContent.add(panelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 170, 180));

        panelCuentaNetflix.setBackground(new java.awt.Color(73, 21, 91));
        panelCuentaNetflix.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        cobrarButton.setBackground(new java.awt.Color(90, 37, 153));
        cobrarButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        cobrarButton.setForeground(new java.awt.Color(255, 255, 255));
        cobrarButton.setText("Cobrar");
        cobrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrarButtonActionPerformed(evt);
            }
        });

        addPerfilButton.setBackground(new java.awt.Color(90, 37, 153));
        addPerfilButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        addPerfilButton.setForeground(new java.awt.Color(255, 255, 255));
        addPerfilButton.setText("Añadir Perfil");
        addPerfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPerfilButtonActionPerformed(evt);
            }
        });

        addCuentaNetflixButton.setBackground(new java.awt.Color(90, 37, 153));
        addCuentaNetflixButton.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        addCuentaNetflixButton.setForeground(new java.awt.Color(255, 255, 255));
        addCuentaNetflixButton.setText("Añadir Cuenta Netflix");
        addCuentaNetflixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCuentaNetflixButtonActionPerformed(evt);
            }
        });

        CuentaNetflixTituloLbl.setForeground(new java.awt.Color(255, 255, 255));
        CuentaNetflixTituloLbl.setText("CUENTA NETFLIX");

        javax.swing.GroupLayout panelCuentaNetflixLayout = new javax.swing.GroupLayout(panelCuentaNetflix);
        panelCuentaNetflix.setLayout(panelCuentaNetflixLayout);
        panelCuentaNetflixLayout.setHorizontalGroup(
            panelCuentaNetflixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentaNetflixLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuentaNetflixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPerfilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCuentaNetflixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cobrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelCuentaNetflixLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(CuentaNetflixTituloLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCuentaNetflixLayout.setVerticalGroup(
            panelCuentaNetflixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentaNetflixLayout.createSequentialGroup()
                .addComponent(CuentaNetflixTituloLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(addCuentaNetflixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addPerfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cobrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelContent.add(panelCuentaNetflix, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 180));

        volverBtn.setBackground(new java.awt.Color(90, 37, 153));
        volverBtn.setForeground(new java.awt.Color(255, 255, 255));
        volverBtn.setText("VOLVER");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });
        panelContent.add(volverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        getContentPane().add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 550));

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
                .addGap(0, 556, Short.MAX_VALUE)
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

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CambiaTrabajoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiaTrabajoButtonActionPerformed
        String nombreTrabajo = JOptionPane.showInputDialog(this, "Introduce el nombre del trabajo.");

        if (nombreTrabajo != null && !nombreTrabajo.isEmpty()) {
            String sueldo = JOptionPane.showInputDialog(this, "Introduce el sueldo del trabajo.");
            if (sueldo != null && !sueldo.isEmpty()) {
                try {
                    sueldo = sueldo.replace(',', '.');
                    Double sueldoNumerico = Double.parseDouble(sueldo);
                    Trabajo t = new Trabajo(nombreTrabajo, sueldoNumerico);
                    u.setProfesion(t);
                    JOptionPane.showMessageDialog(this, "Trabajo cambiado correctamente.");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Sueldo no valido.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_CambiaTrabajoButtonActionPerformed

    private void cambiaNombreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiaNombreButtonActionPerformed
        String nuevoNombre = JOptionPane.showInputDialog(this, "Introduce el nuevo nombre del usuario.");

        if (nuevoNombre != null) {
            String[] nombreYApellido = nuevoNombre.split(" ");
            if (nombreYApellido.length == 2) {
                try {
                    u.setNombre(nombreYApellido[0]);
                    u.setPrimerApellido(nombreYApellido[1]);
                    JOptionPane.showMessageDialog(this, "Nombre cambiado satisfactoriamente.");
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(this, "El nombre no es valido. introduce nombre y apellidos.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre no es valido. introduce nombre y apellidos.");
            }
        }
    }//GEN-LAST:event_cambiaNombreButtonActionPerformed

    private void closeLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLblMouseClicked
        String nombre = u.getNombre() + " " + u.getPrimerApellido();
        if (nombre.equalsIgnoreCase("usuario pruebas")) {
            GestorUsuario.borraUsuario(u.getID());
        }
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeLblMouseClicked

    private void minLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minLblMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minLblMouseClicked


    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        JOptionPane.showMessageDialog(this, u.toString());
    }//GEN-LAST:event_infoBtnActionPerformed

    private void trabajarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajarButtonActionPerformed
        Trabajo t = u.getProfesion();

        if (t != null) {
            try {
                CuentaBanco cb = u.getCuentasBanco()[0];
                if (cb != null) {
                    t.trabajar(cb);
                    JOptionPane.showMessageDialog(this,
                            "Has trabajado correctamente. Sueldo: "
                            + t.getSueldo()
                            + ". Saldo actual: "
                            + cb.getSaldo()
                            + ". Bonus antiguedad: "
                            + t.getBonusAntiguedad());
                } else {
                    JOptionPane.showMessageDialog(this, "No puedes trabajar sin una cuenta del banco.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(this, "No puedes trabajar sin una cuenta del banco.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No tienes ninguna profesion.");
        }
    }//GEN-LAST:event_trabajarButtonActionPerformed

    private void addCuentaBancoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCuentaBancoButtonActionPerformed
        CuentaBanco cb = new CuentaBanco(u);
        u.addCuentaBanco(cb);
        JOptionPane.showMessageDialog(this, "Se ha añadido una cuenta Bancaria.");
    }//GEN-LAST:event_addCuentaBancoButtonActionPerformed

    private void addAntiguedadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAntiguedadButtonActionPerformed
        Trabajo t = u.getProfesion();
        if (t != null) {
            t.addMesAntiguedad();
            JOptionPane.showMessageDialog(this, "La antiguedad ha aumentado en un mes. Antiguedad actual: " + t.getMesesAntiguedad());
        } else {
            JOptionPane.showMessageDialog(this, "No tienes ninguna profesion.");
        }
    }//GEN-LAST:event_addAntiguedadButtonActionPerformed

    private void ingresaSaldoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaSaldoButtonActionPerformed
        try {
            CuentaBanco cb = u.getCuentasBanco()[0];
            if (cb != null) {
                try {
                    String cantidad = JOptionPane.showInputDialog(this, "Introduce el saldo a ingresar: ");
                    Double num = Double.parseDouble(cantidad);
                    cb.ingresaSaldo(num);
                    JOptionPane.showMessageDialog(this, "Has ingresado: " + num + ". Saldo: " + cb.getSaldo());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No has introducido un numero valido.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (NullPointerException ex) {

                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No tienes cuenta bancaria.");
        }
    }//GEN-LAST:event_ingresaSaldoButtonActionPerformed

    private void retiraSaldoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiraSaldoButtonActionPerformed
        try {
            CuentaBanco cb = u.getCuentasBanco()[0];
            if (cb != null) {
                try {
                    String cantidad = JOptionPane.showInputDialog(this, "Introduce el saldo a retirar: ");
                    Double num = Double.parseDouble(cantidad);
                    cb.retiraSaldo(num);
                    JOptionPane.showMessageDialog(this, "Has retirado: " + num + ". Saldo: " + cb.getSaldo());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "No has introducido un numero valido.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } catch (NullPointerException ex) {

                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No tienes cuenta bancaria.");
        }
    }//GEN-LAST:event_retiraSaldoButtonActionPerformed

    private void addCuentaNetflixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCuentaNetflixButtonActionPerformed
        CuentaNetflix cn = new CuentaNetflix(u);
        u.addCuentaNetflix(cn);
        JOptionPane.showMessageDialog(this, "Se ha agregado una cuenta Netflix.");
    }//GEN-LAST:event_addCuentaNetflixButtonActionPerformed

    private void addPerfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPerfilButtonActionPerformed
        String nombrePerfil = JOptionPane.showInputDialog(this, "Introduce el nombre del perfil.");

        try {
            CuentaNetflix cn = u.getCuentasNetflix()[0];
            JOptionPane.showMessageDialog(this, cn.crearPerfil(nombrePerfil));
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No tienes ninguna cuenta netflix.");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_addPerfilButtonActionPerformed

    private void cobrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrarButtonActionPerformed
        try {
            CuentaNetflix cn = u.getCuentasNetflix()[0];
            JOptionPane.showMessageDialog(this, cn.cobrar());
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "No tienes ninguna cuenta netflix.");
        }

    }//GEN-LAST:event_cobrarButtonActionPerformed

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        String nombre = u.getNombre() + " " + u.getPrimerApellido();
        if (nombre.equalsIgnoreCase("usuario pruebas")) {
            GestorUsuario.borraUsuario(u.getID());
        }
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiaTrabajoButton;
    private javax.swing.JLabel CuentaBancoTituloLbl;
    private javax.swing.JLabel CuentaNetflixTituloLbl;
    private javax.swing.JLabel TrabajoTituloLbl;
    private javax.swing.JButton addAntiguedadButton;
    private javax.swing.JButton addCuentaBancoButton;
    private javax.swing.JButton addCuentaNetflixButton;
    private javax.swing.JButton addPerfilButton;
    private javax.swing.JButton cambiaNombreButton;
    private javax.swing.JLabel closeLbl;
    private javax.swing.JButton cobrarButton;
    private javax.swing.JPanel header;
    private javax.swing.JButton infoBtn;
    private javax.swing.JButton ingresaSaldoButton;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel minLbl;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelCuentaBanco;
    private javax.swing.JPanel panelCuentaNetflix;
    private javax.swing.JPanel panelTrabajo;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JButton retiraSaldoButton;
    private javax.swing.JButton trabajarButton;
    private javax.swing.JLabel usuarioTituloLbl;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}
