package gasolineramarco;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class ventana1 extends javax.swing.JFrame {

    String productos[];
    double precios[] = {30, 32, 24};
    double precio = 0;
    int cantidad = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Venta> listaVentas = new ArrayList<Venta>();

    public ventana1() {
        this.productos = new String[]{"Regular", "Diesel", "Super"};
        initComponents();
        this.setTitle("GASOLINERA EL PASO");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        Image iconoAgregar = Toolkit.getDefaultToolkit().getImage(getClass().getResource(""));
        btnAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(btnAgregar.getWidth(), btnAgregar.getHeight(), Image.SCALE_SMOOTH)));
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        cboProducto.setModel(comboModel);
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        actualizarTabla();
        calcularPrecio();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_textogaso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_precio = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cboProducto = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txt_total = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtimporte = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_textogaso.setBackground(new java.awt.Color(0, 204, 51));
        txt_textogaso.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txt_textogaso.setForeground(new java.awt.Color(102, 255, 0));
        txt_textogaso.setText("---------------Gasolinera Marco---------------------");
        getContentPane().add(txt_textogaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 580, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Galones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 90, -1));

        txt_precio.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(255, 0, 0));
        txt_precio.setText("Precio");
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 80, 20));

        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 30));

        cboProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 300, 20));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));
        spnCantidad.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                spnCantidadAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 60, 20));

        tblProductos.setBackground(new java.awt.Color(255, 255, 51));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 870, 200));

        txt_total.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txt_total.setText("Total");
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 90, 20));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrecio.setText("Q 0.00 ");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 180, 20));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setText("Q 0.00 ");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 200, 20));

        txtimporte.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        txtimporte.setText("Importe");
        getContentPane().add(txtimporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        lblImporte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblImporte.setText("Q 0.00 ");
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 150, -1));

        btnActualizar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {
        calcularPrecio();
        lblImporte.setText(aMoneda(precio * cantidad)); // Actualizar el importe
    }


    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed

        calcularPrecio();


    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_spnCantidadAncestorAdded
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadAncestorAdded

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Venta venta = new Venta();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setProducto(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(cantidad * precio);
        listaVentas.add(venta);

        // Actualizar la tabla y limpiar los campos
        actualizarTabla();
        borrarVenta();

    }//GEN-LAST:event_btnAgregarActionPerformed

    public void borrarVenta() {
        precio = 0;
        cantidad = 0;
    }

    public void calcularPrecio() {
        precio = precios[cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio * cantidad));
        lblTotal.setText(aMoneda(precio * cantidad));

    }

    public String aMoneda(double precio) {

        return "Q " + Math.round(precio * 100.00) / 100.0 + "Quetzales";

    }

    public void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Venta v : listaVentas) {
            Object x[] = new Object[4];
            x[0] = v.getProducto();
            x[1] = v.getPrecio();
            x[2] = v.getCantidad();
            x[3] = v.getImporte();
            modelo.addRow(x);
        }

        tblProductos.setModel(modelo);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    private javax.swing.JLabel txt_precio;
    private javax.swing.JLabel txt_textogaso;
    private javax.swing.JLabel txt_total;
    private javax.swing.JLabel txtimporte;
    // End of variables declaration//GEN-END:variables

    private void borrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
