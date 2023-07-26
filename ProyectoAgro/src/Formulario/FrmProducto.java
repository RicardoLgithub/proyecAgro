package Formulario;
import Desarrollo.Producto;
import Desarrollo.Validacion;
import javax.swing.JOptionPane;
public class FrmProducto extends javax.swing.JInternalFrame {

    public FrmProducto() {
        initComponents();
        this.PanelBuscar.setVisible(false);
        this.setTitle("CATALOGO DE PRODUCTOS");
        Producto p1 = new Producto();
        this.CbNom.setModel(p1.LlenarCombo());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBuscar = new javax.swing.ButtonGroup();
        LblCodigo = new javax.swing.JLabel();
        LblNom = new javax.swing.JLabel();
        BtnAlta = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        TxtCodigo = new javax.swing.JTextField();
        TxtNom = new javax.swing.JTextField();
        PanelBuscar = new javax.swing.JPanel();
        RbCodigo = new javax.swing.JRadioButton();
        RbNom = new javax.swing.JRadioButton();
        TxtCodABuscar = new javax.swing.JTextField();
        CbNom = new javax.swing.JComboBox<>();
        BtnAceptarBaja = new javax.swing.JButton();
        BtnAceptarModificar = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblCodigo.setText("CODIGO");
        getContentPane().add(LblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        LblNom.setText("NOMBRE");
        getContentPane().add(LblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        BtnAlta.setText("ALTA");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        BtnBaja.setText("BAJA");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        BtnMostrar.setText("MOSTRAR");
        getContentPane().add(BtnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        TxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, -1));

        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });
        getContentPane().add(TxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));

        PanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        PanelBuscar.setToolTipText("");

        GrupoBuscar.add(RbCodigo);
        RbCodigo.setText("Código");
        RbCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbCodigoMouseClicked(evt);
            }
        });

        GrupoBuscar.add(RbNom);
        RbNom.setText("Nombre");
        RbNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbNomMouseClicked(evt);
            }
        });

        TxtCodABuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodABuscarKeyTyped(evt);
            }
        });

        BtnAceptarBaja.setText("Aceptar Baja");
        BtnAceptarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarBajaActionPerformed(evt);
            }
        });

        BtnAceptarModificar.setText("Aceptar Modificar");
        BtnAceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(RbCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCodABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAceptarBaja))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(RbNom)
                        .addGap(18, 18, 18)
                        .addComponent(CbNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnAceptarModificar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbCodigo)
                    .addComponent(TxtCodABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAceptarBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbNom)
                    .addComponent(CbNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAceptarModificar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(PanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 290, -1));

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        if (this.TxtCodigo.getText().isEmpty() || this.TxtNom.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos!!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String Nom = this.TxtNom.getText().toUpperCase();
            int Codigo = Integer.parseInt(this.TxtCodigo.getText());
            Producto p = new Producto(Codigo, Nom);
            p.Alta();
            Limpiar();
        }
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void TxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigoKeyTyped
        Validacion.SoloNros(evt);
        
        if (this.TxtNom.getText().length() > 5) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del pais");
        }
    }//GEN-LAST:event_TxtCodigoKeyTyped

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        Validacion.SoloLetras(evt);
        
        if (this.TxtNom.getText().length() > 29) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del Producto");
        }
    }//GEN-LAST:event_TxtNomKeyTyped

    private void TxtCodABuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodABuscarKeyTyped
        Validacion.SoloNros(evt);
        
        if (this.TxtNom.getText().length() > 5) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del pais");
        }
    }//GEN-LAST:event_TxtCodABuscarKeyTyped

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void RbCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbCodigoMouseClicked
        this.CbNom.setVisible(false);
        this.TxtCodABuscar.setVisible(true);
    }//GEN-LAST:event_RbCodigoMouseClicked

    private void RbNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbNomMouseClicked
        this.TxtCodABuscar.setVisible(false);
        this.CbNom.setVisible(true);
    }//GEN-LAST:event_RbNomMouseClicked

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        this.PanelBuscar.setVisible(true);
        this.BtnAceptarModificar.setVisible(false);
        this.BtnAceptarBaja.setVisible(true);
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        this.PanelBuscar.setVisible(true);
        this.BtnAceptarModificar.setVisible(true);
        this.BtnAceptarBaja.setVisible(false);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnAceptarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarBajaActionPerformed
        Producto p2 = new Producto();
        if (this.RbCodigo.isSelected()) {
            if (this.TxtCodABuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el código a eliminar");
            } else {
                int Codigo = Integer.parseInt(this.TxtCodABuscar.getText());
                p2.Baja(Codigo);
            }
        } else {
            //String Nombre = this.CbNom.getSelectedItem().toString(); esta es una forma de combertir un obj a String
            String Nombre = String.valueOf(this.CbNom.getSelectedItem());   //esta es otra forma de combertir un obj a String
            p2.Baja(Nombre);
        }
        
    }//GEN-LAST:event_BtnAceptarBajaActionPerformed

    private void BtnAceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarModificarActionPerformed
        Producto p2 = new Producto();
        if (this.RbCodigo.isSelected()) {
            if (this.TxtCodABuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar el código a Modificar");
            } else {
                int Codigo = Integer.parseInt(this.TxtCodABuscar.getText());
                boolean encontrado = p2.Buscar(Codigo);
                if (encontrado == true) {
                    this.TxtCodigo.setText(String.valueOf(p2.getCod()));
                    this.TxtNom.setText(p2.getNom());
                    this.BtnConfirmar.setVisible(true);
                    this.BtnCancelar.setVisible(true);
                    //p2.Modificar(Codigo);
                } else {
                    JOptionPane.showMessageDialog(null, "Producto inexistente");
                }
            }
        } else {
            //String Nombre = this.CbNom.getSelectedItem().toString(); esta es una forma de combertir un obj a String
            String Nombre = String.valueOf(this.CbNom.getSelectedItem());   //esta es otra forma de combertir un obj a String
            this.TxtNom.setText(Nombre);
            this.BtnConfirmar.setVisible(true);
            this.BtnCancelar.setVisible(true);
            //p2.Modificar(Nombre);
        }
    }//GEN-LAST:event_BtnAceptarModificarActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        Producto p3 = new Producto();
        if (this.RbCodigo.isSelected()) {
            p3.Modificar(Integer.parseInt(this.TxtCodABuscar.getText()), this.TxtNom.getText().toUpperCase());
        } else{
            p3.Modificar(String.valueOf(this.CbNom.getSelectedItem()), this.TxtNom.getText().toUpperCase());
        }
        Cancelar();
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Cancelar();
    }//GEN-LAST:event_BtnCancelarActionPerformed
    
    private void Cancelar(){
        this.TxtCodABuscar.setText(null);
        Limpiar();
        this.PanelBuscar.setVisible(false);
        this.BtnConfirmar.setVisible(false);
        this.BtnCancelar.setVisible(false);
    }
    private void Limpiar(){
            this.TxtNom.setText(null);
            this.TxtCodigo.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarBaja;
    private javax.swing.JButton BtnAceptarModificar;
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CbNom;
    private javax.swing.ButtonGroup GrupoBuscar;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblNom;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JRadioButton RbCodigo;
    private javax.swing.JRadioButton RbNom;
    private javax.swing.JTextField TxtCodABuscar;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNom;
    // End of variables declaration//GEN-END:variables
}
