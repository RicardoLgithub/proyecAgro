package Formulario;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        opcPais = new javax.swing.JMenuItem();
        OpcProducto = new javax.swing.JMenuItem();
        OpcFrescos = new javax.swing.JMenuItem();
        OpcRefrigerado = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        opcSalir = new javax.swing.JMenuItem();
        MenuVenta = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();
        ConsFrescos = new javax.swing.JMenuItem();
        ConsRefrigerados = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuArchivo.setMnemonic('f');
        MenuArchivo.setText("Archivo");

        opcPais.setMnemonic('o');
        opcPais.setText("PaisesOrigen");
        opcPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcPaisActionPerformed(evt);
            }
        });
        MenuArchivo.add(opcPais);

        OpcProducto.setMnemonic('s');
        OpcProducto.setText("Producto");
        OpcProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcProductoActionPerformed(evt);
            }
        });
        MenuArchivo.add(OpcProducto);

        OpcFrescos.setText("Producto Fresco");
        OpcFrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcFrescosActionPerformed(evt);
            }
        });
        MenuArchivo.add(OpcFrescos);

        OpcRefrigerado.setText("Producto Refrigerado");
        OpcRefrigerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcRefrigeradoActionPerformed(evt);
            }
        });
        MenuArchivo.add(OpcRefrigerado);

        jMenu1.setText("Producto Congelado");

        jMenuItem4.setText("Congelado por Aire");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Congelado por agua");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Congelado por Nitrogeno");
        jMenu1.add(jMenuItem6);

        MenuArchivo.add(jMenu1);

        opcSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        opcSalir.setMnemonic('x');
        opcSalir.setText("Exit");
        opcSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSalirActionPerformed(evt);
            }
        });
        MenuArchivo.add(opcSalir);

        BarraMenu.add(MenuArchivo);

        MenuVenta.setMnemonic('e');
        MenuVenta.setText("Venta");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        MenuVenta.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        MenuVenta.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        MenuVenta.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        MenuVenta.add(deleteMenuItem);

        BarraMenu.add(MenuVenta);

        MenuConsulta.setMnemonic('h');
        MenuConsulta.setText("Consulta");

        ConsFrescos.setMnemonic('c');
        ConsFrescos.setText("Mostrar todos los Productos Frescos");
        ConsFrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsFrescosActionPerformed(evt);
            }
        });
        MenuConsulta.add(ConsFrescos);

        ConsRefrigerados.setText("Mostrar todos los Productos Refrigerados");
        ConsRefrigerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsRefrigeradosActionPerformed(evt);
            }
        });
        MenuConsulta.add(ConsRefrigerados);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        MenuConsulta.add(aboutMenuItem);

        BarraMenu.add(MenuConsulta);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcSalirActionPerformed

    private void opcPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcPaisActionPerformed
        FrmPais pa = new FrmPais();
        Escritorio.add(pa);
        pa.show();
    }//GEN-LAST:event_opcPaisActionPerformed

    private void OpcProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcProductoActionPerformed
      //  FrmProducto p = new FrmProducto();
        Prueba p = new Prueba();
        Escritorio.add(p);
        p.show();
    }//GEN-LAST:event_OpcProductoActionPerformed

    private void OpcFrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcFrescosActionPerformed
        FrmFrescos f = new FrmFrescos();
        Escritorio.add(f);
        f.show();
    }//GEN-LAST:event_OpcFrescosActionPerformed

    private void ConsFrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsFrescosActionPerformed
        FrmMostrarFrescos mf = new FrmMostrarFrescos();
        Escritorio.add(mf);
        mf.show();
    }//GEN-LAST:event_ConsFrescosActionPerformed

    private void ConsRefrigeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsRefrigeradosActionPerformed
        FrmMostrarRefrigerados mr = new FrmMostrarRefrigerados();
        Escritorio.add(mr);
        mr.show();
    }//GEN-LAST:event_ConsRefrigeradosActionPerformed

    private void OpcRefrigeradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcRefrigeradoActionPerformed
        FrmRefrigerados r = new FrmRefrigerados();
        Escritorio.add(r);
        r.show();
    }//GEN-LAST:event_OpcRefrigeradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem ConsFrescos;
    private javax.swing.JMenuItem ConsRefrigerados;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JMenu MenuVenta;
    private javax.swing.JMenuItem OpcFrescos;
    private javax.swing.JMenuItem OpcProducto;
    private javax.swing.JMenuItem OpcRefrigerado;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem opcPais;
    private javax.swing.JMenuItem opcSalir;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables

}
