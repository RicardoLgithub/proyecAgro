package Formulario;

import Desarrollo.PaisOrigen;
import Desarrollo.Producto;
import Desarrollo.Refrigerados;
import Desarrollo.Validacion;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmRefrigerados extends javax.swing.JInternalFrame {
PaisOrigen pais = new PaisOrigen();
Producto p = new Producto();
private char Boton;

    public FrmRefrigerados() {
        initComponents();
        this.CbProducto.setModel(p.LlenarCombo());
        this.CbPais.setModel(pais.LlenarCombo());
      //para visualizar la fecha del dia en el calendario y que tome esa por default
        java.time.LocalDate hoy = LocalDate.now();
        java.util.Date FechaHoy = java.sql.Date.valueOf(hoy);
        this.FechaEnva.setDate(FechaHoy);
        this.FechaVto.setDate(FechaHoy);
        this.PanelBajaModif.setVisible(false);
        this.BtnConfirmar.setVisible(false);
        this.BtnAnular.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelTitulo = new javax.swing.JPanel();
        PanelIzquierdo = new javax.swing.JPanel();
        Foto = new org.edisoncor.gui.panel.PanelImage();
        PanelCentral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelDerecho = new javax.swing.JPanel();
        PanelBotones = new javax.swing.JPanel();
        BtnAlta = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnBaja = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        PanelCuerpo = new javax.swing.JPanel();
        PanelIngreso = new javax.swing.JPanel();
        PanelPestaña = new javax.swing.JTabbedPane();
        PanelLote = new javax.swing.JPanel();
        LblNroLote = new javax.swing.JLabel();
        TxtNroLote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtTemp = new javax.swing.JTextField();
        TxtCodOrga = new javax.swing.JTextField();
        PanelProductosyPais = new javax.swing.JPanel();
        LblPais = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CbPais = new javax.swing.JComboBox<>();
        CbProducto = new javax.swing.JComboBox<>();
        PanelFechas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FechaEnva = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        FechaVto = new com.toedter.calendar.JDateChooser();
        BtnConfirmar = new javax.swing.JButton();
        BtnAnular = new javax.swing.JButton();
        PanelBajaModif = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        RbCodigo = new javax.swing.JRadioButton();
        RbNombre = new javax.swing.JRadioButton();
        PanelTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnAceptar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        PanelTitulo.setBackground(new java.awt.Color(255, 0, 255));

        PanelIzquierdo.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout FotoLayout = new javax.swing.GroupLayout(Foto);
        Foto.setLayout(FotoLayout);
        FotoLayout.setHorizontalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        FotoLayout.setVerticalGroup(
            FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelIzquierdoLayout = new javax.swing.GroupLayout(PanelIzquierdo);
        PanelIzquierdo.setLayout(PanelIzquierdoLayout);
        PanelIzquierdoLayout.setHorizontalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIzquierdoLayout.setVerticalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelCentral.setBackground(new java.awt.Color(204, 102, 0));

        jLabel1.setText("PRODUCTOS REFRIGERADOS");

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        PanelDerecho.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout PanelDerechoLayout = new javax.swing.GroupLayout(PanelDerecho);
        PanelDerecho.setLayout(PanelDerechoLayout);
        PanelDerechoLayout.setHorizontalGroup(
            PanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        PanelDerechoLayout.setVerticalGroup(
            PanelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDerecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelIzquierdo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCentral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelDerecho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PanelBotones.setLayout(new java.awt.GridLayout(0, 1));

        BtnAlta.setText("ALTA");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnAlta);

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnModificar);

        BtnBaja.setText("BAJA");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });
        PanelBotones.add(BtnBaja);

        BtnSalir.setText("SALIR");
        PanelBotones.add(BtnSalir);

        PanelCuerpo.setBackground(new java.awt.Color(204, 51, 0));

        PanelIngreso.setBackground(new java.awt.Color(0, 0, 153));
        PanelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblNroLote.setText("Nro de Lote");

        TxtNroLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNroLoteKeyTyped(evt);
            }
        });

        jLabel2.setText("Temperatura");

        jLabel6.setText("Código de Organismo");

        TxtTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTempKeyTyped(evt);
            }
        });

        TxtCodOrga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodOrgaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelLoteLayout = new javax.swing.GroupLayout(PanelLote);
        PanelLote.setLayout(PanelLoteLayout);
        PanelLoteLayout.setHorizontalGroup(
            PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtNroLote)
                    .addComponent(LblNroLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtTemp)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(PanelLoteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(TxtCodOrga, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        PanelLoteLayout.setVerticalGroup(
            PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNroLote)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(PanelLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCodOrga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        PanelPestaña.addTab("LOTE", PanelLote);

        LblPais.setText("Pais");

        jLabel5.setText("Producto");

        javax.swing.GroupLayout PanelProductosyPaisLayout = new javax.swing.GroupLayout(PanelProductosyPais);
        PanelProductosyPais.setLayout(PanelProductosyPaisLayout);
        PanelProductosyPaisLayout.setHorizontalGroup(
            PanelProductosyPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosyPaisLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LblPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(57, 57, 57))
            .addGroup(PanelProductosyPaisLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(CbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        PanelProductosyPaisLayout.setVerticalGroup(
            PanelProductosyPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosyPaisLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PanelProductosyPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPais)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(PanelProductosyPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        PanelPestaña.addTab("PRODUCTOS y PAIS", PanelProductosyPais);

        jLabel3.setText("Fecha de Envasado");

        jLabel4.setText("Fecha de Vencimiento");

        javax.swing.GroupLayout PanelFechasLayout = new javax.swing.GroupLayout(PanelFechas);
        PanelFechas.setLayout(PanelFechasLayout);
        PanelFechasLayout.setHorizontalGroup(
            PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
            .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFechasLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelFechasLayout.createSequentialGroup()
                            .addComponent(FechaEnva, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FechaVto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PanelFechasLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(28, 28, 28)
                            .addComponent(jLabel4)))
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        PanelFechasLayout.setVerticalGroup(
            PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
            .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelFechasLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(PanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FechaVto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FechaEnva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        PanelPestaña.addTab("FECHAS", PanelFechas);

        PanelIngreso.add(PanelPestaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 210));

        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        PanelIngreso.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        BtnAnular.setText("Anular");
        PanelIngreso.add(BtnAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        PanelBajaModif.setBackground(new java.awt.Color(51, 153, 0));
        PanelBajaModif.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setText("Buscar por");
        PanelBajaModif.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigoKeyTyped(evt);
            }
        });
        PanelBajaModif.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, -1));

        buttonGroup1.add(RbCodigo);
        RbCodigo.setText("Nro de Lote");
        RbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbCodigoActionPerformed(evt);
            }
        });
        PanelBajaModif.add(RbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        buttonGroup1.add(RbNombre);
        RbNombre.setText("Nombre");
        RbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbNombreActionPerformed(evt);
            }
        });
        PanelBajaModif.add(RbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        PanelTabla.setViewportView(Tabla);

        PanelBajaModif.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 330, 120));

        BtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Aceptar.png"))); // NOI18N
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });
        PanelBajaModif.add(BtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 40, 30));

        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cancelar.png"))); // NOI18N
        PanelBajaModif.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 40, 30));

        javax.swing.GroupLayout PanelCuerpoLayout = new javax.swing.GroupLayout(PanelCuerpo);
        PanelCuerpo.setLayout(PanelCuerpoLayout);
        PanelCuerpoLayout.setHorizontalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBajaModif, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCuerpoLayout.setVerticalGroup(
            PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuerpoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBajaModif, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNroLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNroLoteKeyTyped
        Validacion.SoloNros(evt);
        
        if (this.TxtNroLote.getText().length() > 5) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del N° de Lote");
        }
    }//GEN-LAST:event_TxtNroLoteKeyTyped

    private void TxtTempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTempKeyTyped
        Validacion.SoloNros(evt);
        
        if (this.TxtTemp.getText().length() > 2) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres de la Temperatura");
        }
    }//GEN-LAST:event_TxtTempKeyTyped

    private void TxtCodOrgaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodOrgaKeyTyped
        Validacion.Simbolos(evt);
        
        if (this.TxtCodOrga.getText().length() > 15) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del Código de Organismo");
        }
    }//GEN-LAST:event_TxtCodOrgaKeyTyped

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        AltaModif();
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        HabilitarPanelBuscar();
        Boton = 'B';
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        HabilitarPanelBuscar();
        Boton = 'M';
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void RbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbCodigoActionPerformed
        this.TxtCodigo.setVisible(true);
        this.PanelTabla.setVisible(false);
        this.TxtCodigo.requestFocus();
    }//GEN-LAST:event_RbCodigoActionPerformed

    private void RbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbNombreActionPerformed
        this.TxtCodigo.setVisible(false);
        this.PanelTabla.setVisible(true);
        Refrigerados r = new Refrigerados();
        this.Tabla.setModel(r.MostrarProductoyLote());
        this.Tabla.setModel(r.MostrarContenidoProductoyLote());
    }//GEN-LAST:event_RbNombreActionPerformed

    private void TxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigoKeyTyped
        Validacion.SoloNros(evt);
        
        if (this.TxtCodigo.getText().length() > 5) {
            evt.consume();//esta funcion sirve para que no pueda seguir tipiando y no se exceda de la longitud que le permitimos
            JOptionPane.showMessageDialog(null, "excede la longitud de caracteres del N° de Lote");
        }
    }//GEN-LAST:event_TxtCodigoKeyTyped

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        switch (Boton) {
            case 'B':
                try {
                    int confirma = JOptionPane.showConfirmDialog(null, "Desea eliminar al Lote: " + this.TxtCodigo.getText());
                    if (confirma == 0) {
                        int LoteABorrar = Integer.parseInt(this.TxtCodigo.getText());
                        Refrigerados r = new Refrigerados();
                        r.Baja(LoteABorrar);
                    }
                    this.TxtCodigo.setText(null);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cancelar");
                }
                break;
            case 'M':
                DeshabilitarPanelBuscar();
                BuscaryEnviarALasCajas();
                this.TxtNroLote.setEditable(false);
                this.BtnConfirmar.setVisible(true);
                this.TxtCodOrga.requestFocus();
                this.BtnAnular.setVisible(true);
                break;
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int col = 1;//digo que tome la columna 1(porque empieza 0,1,2)
        int fila = this.Tabla.getSelectedRow();
        this.TxtCodigo.setText(this.Tabla.getValueAt(fila, col).toString());
        //System.out.println(this.Tabla.getValueAt(fila, col));
    }//GEN-LAST:event_TablaMouseClicked

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        AltaModif();
        Limpiar();
        this.PanelBajaModif.setVisible(false);
        this.BtnConfirmar.setVisible(false);
        this.BtnAnular.setVisible(false);
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void AltaModif(){
        int NroLote, TempMant;
        Date FechaEnvaForm, FechaVtoForm; 
        java.sql.Date FechaEnvaSql, FechaVtoSql;
        String CodOrga;
        //validar la caja de lote
        if (this.TxtNroLote.getText().isEmpty() || this.TxtCodOrga.getText().isEmpty() || this.TxtTemp.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos");
        } else {
            NroLote = Integer.parseInt(this.TxtNroLote.getText());
            CodOrga = this.TxtCodOrga.getText();
            TempMant = Integer.parseInt(this.TxtTemp.getText());
            //este if sirve para verificar si las fechas estan vacias
            if (this.FechaEnva.getDate() == null || this.FechaVto.getDate() == null) {
                JOptionPane.showMessageDialog(null, "debe completar las fechas");
            }
            
            //convertir las fechas
            FechaEnvaForm = this.FechaEnva.getDate();
            FechaVtoForm = this.FechaVto.getDate();
            
            FechaEnvaSql = Validacion.ConvertirFecha(FechaEnvaForm);
            FechaVtoSql = Validacion.ConvertirFecha(FechaVtoForm);
            
            //los metodos de retorno de codigo de pais y producto
            String PaisElegido = this.CbPais.getSelectedItem().toString();
            String ProductoElegido = this.CbProducto.getSelectedItem().toString();
            
            p.DevolverIdProd(ProductoElegido); //asi se utilliza cuando es un metodo void
            int CodProd = p.getCod();
            
            //int CodProd = p.DevolverIdProd(ProductoElegido); //y asi cuando es un metodo de retorno
            int CodPais = pais.DevolverIdpais(PaisElegido);
            //hacer el alta
            Refrigerados f = new Refrigerados(CodOrga, FechaEnvaSql, TempMant, CodPais, NroLote, FechaVtoSql, CodProd);
            if (Boton == 'M') {
                f.Modificar();
                Boton = 'A';//aqui utilizo cualquier caracter para blanquear nada mas porque un char no acepta nulos
            } else {
                f.Alta();
            }
        }   
    }

    private void HabilitarPanelBuscar(){
        this.PanelBajaModif.setVisible(true);
        this.TxtCodigo.setVisible(false);
        this.PanelTabla.setVisible(false);
        this.PanelPestaña.setEnabled(false);
        this.TxtNroLote.setEnabled(false);
        this.TxtTemp.setEnabled(false);
        this.TxtCodOrga.setEnabled(false);
    }
    private void DeshabilitarPanelBuscar(){
        this.PanelBajaModif.setVisible(true);
        this.TxtCodigo.setVisible(false);
        this.PanelTabla.setVisible(false);
        this.PanelPestaña.setEnabled(true);
        this.TxtNroLote.setEnabled(true);
        this.TxtTemp.setEnabled(true);
        this.TxtCodOrga.setEnabled(true);
    }
    private void BuscaryEnviarALasCajas(){
        Refrigerados r = new Refrigerados();
        r.BuscarPorLote(Integer.parseInt(this.TxtCodigo.getText()));
        Date fvto = r.getFechaVto();
        Date fEnva = r.getFechaEnvasado();
        
        this.TxtNroLote.setText(String.valueOf(r.getNroLote()));
        this.TxtTemp.setText(String.valueOf(r.getTempMant()));
        this.TxtCodOrga.setText(r.getCodOrga());
        this.FechaVto.setDate(fvto);
        this.FechaEnva.setDate(fEnva);
        this.CbPais.setSelectedItem(r.getNomPais());
        this.CbProducto.setSelectedItem(r.getNomProd());
    }
    private void Limpiar(){
        //limpieza de la caja de lote
        this.TxtNroLote.setText(null);
        this.TxtCodOrga.setText(null);
        this.TxtTemp.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnAlta;
    private javax.swing.JButton BtnAnular;
    private javax.swing.JButton BtnBaja;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CbPais;
    private javax.swing.JComboBox<String> CbProducto;
    private com.toedter.calendar.JDateChooser FechaEnva;
    private com.toedter.calendar.JDateChooser FechaVto;
    private org.edisoncor.gui.panel.PanelImage Foto;
    private javax.swing.JLabel LblNroLote;
    private javax.swing.JLabel LblPais;
    private javax.swing.JPanel PanelBajaModif;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelCuerpo;
    private javax.swing.JPanel PanelDerecho;
    private javax.swing.JPanel PanelFechas;
    private javax.swing.JPanel PanelIngreso;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JPanel PanelLote;
    private javax.swing.JTabbedPane PanelPestaña;
    private javax.swing.JPanel PanelProductosyPais;
    private javax.swing.JScrollPane PanelTabla;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JRadioButton RbCodigo;
    private javax.swing.JRadioButton RbNombre;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxtCodOrga;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNroLote;
    private javax.swing.JTextField TxtTemp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
