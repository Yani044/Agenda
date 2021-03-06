/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Contactos;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controladores.Cvs;
import Controladores.Ordenar;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author sarai
 */
public class Inicio extends javax.swing.JFrame{
    Cvs cvs;
    ArrayList<Contactos> agenda = new ArrayList ();
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        labelId.setText(String.valueOf(agenda.size()));
        CrearTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        labelId = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 69, 91), 5, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/foto.png"))); // NOI18N

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 102, 153), null, new java.awt.Color(0, 153, 255)));
        jTable1.setFont(new java.awt.Font("Utopia", 2, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(new java.awt.Color(114, 114, 152));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Utopia", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Utopia", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Utopia", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Utopia", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Telefono");

        jLabel6.setFont(new java.awt.Font("Utopia", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Dirección");

        txtNombre.setBackground(new java.awt.Color(153, 153, 255));
        txtNombre.setFont(new java.awt.Font("URW Gothic", 3, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        txtApellido.setBackground(new java.awt.Color(153, 153, 255));
        txtApellido.setFont(new java.awt.Font("URW Gothic", 3, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));

        txtTelefono.setBackground(new java.awt.Color(153, 153, 255));
        txtTelefono.setFont(new java.awt.Font("URW Gothic", 3, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        txtDireccion.setBackground(new java.awt.Color(153, 153, 255));
        txtDireccion.setFont(new java.awt.Font("URW Gothic", 3, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));

        bntGuardar.setFont(new java.awt.Font("Utopia", 1, 12)); // NOI18N
        bntGuardar.setText("Nuevo");
        bntGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Utopia", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        labelId.setBackground(new java.awt.Color(60, 154, 248));

        btnOrdenar.setFont(new java.awt.Font("Utopia", 1, 12)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(bntGuardar)
                                .addGap(40, 40, 40)
                                .addComponent(btnModificar)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOrdenar)
                        .addGap(100, 100, 100)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntGuardar)
                            .addComponent(btnModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnOrdenar)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        String id = labelId.getText();
        String nombre= txtNombre.getText();
        String apellido= txtApellido.getText();
        String direccion= txtDireccion.getText();
        String tel= txtTelefono.getText();
        int duplicado= agenda.size();
        int comprobar= Integer.parseInt(id);
        if( duplicado>comprobar && comprobar!=0){
            JOptionPane.showMessageDialog(null,"Presione modificar");
        }else{
        if( !id.equals("")){
            if( !nombre.equals("")){
                if( !apellido.equals("")){
                    if( !direccion.equals("")){
                        if( !tel.equals("")){
                            Contactos contacto = new Contactos(Integer.parseInt(id),nombre,apellido,direccion,tel);
                            agenda.add(contacto);
                            JOptionPane.showMessageDialog(null,"Guardado con éxito");
                            txtApellido.setText("");
                            labelId.setText(String.valueOf(agenda.size()));
                            txtDireccion.setText("");
                            txtNombre.setText("");
                            txtTelefono.setText("");
                            mostrar();
                        }else{
                            JOptionPane.showMessageDialog(null,"El campo Teléfono está vacio");
                        }
                    }else{
                          JOptionPane.showMessageDialog(null,"El campo Dirección está vacio");
                    }
                 }else{
                        JOptionPane.showMessageDialog(null,"El campo apellido está vacio");
                    }
             }else{
            JOptionPane.showMessageDialog(null,"El campo Nombre está vacio");
                   }
            
        }else{
            JOptionPane.showMessageDialog(null,"El campo ID está vacio");
        }
        }
        
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
  
        String [] info= new String[5];
        info[0]=labelId.getText();
        info[1]=txtApellido.getText();
        info[2]=txtNombre.getText();
        info[3]=txtTelefono.getText();
        info[4]=txtDireccion.getText();
        
        for (int i=1; i < jTable1.getColumnCount();i++) {
            model.setValueAt(info[i], filas, i);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int seleccion= jTable1.getSelectedRow();
        labelId.setText(jTable1.getValueAt(seleccion,0).toString());
        txtApellido.setText(jTable1.getValueAt(seleccion,1).toString());
        txtNombre.setText(jTable1.getValueAt(seleccion,2).toString());
        txtTelefono.setText(jTable1.getValueAt(seleccion,3).toString());
        txtDireccion.setText(jTable1.getValueAt(seleccion,4).toString());
        filas=seleccion;
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
     
     ArrayList<Contactos> ordenado= new ArrayList();
        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                if(agenda.get(i).getApellido().compareToIgnoreCase(agenda.get(j).getApellido()) == -1){
                 ordenado.add(0,agenda.get(i));
            
                agenda.add(i, agenda.get(j));
           
                agenda.add(j, ordenado.get(0));
            
                
            }
            
                
        }}
            for (Contactos contactos : agenda) {
                
                System.out.println(contactos.getApellido()+ "");
            }
        
        
     
        
    }//GEN-LAST:event_btnOrdenarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    DefaultTableModel model;
    int filas;
    private void CrearTabla(){
        try{
            model= (new DefaultTableModel(null, new String []{"Id","Apellido","Nombre","Teléfono","Dirección"}){});
            jTable1.setModel(model);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("No se encuentra el archivo: " + path);
            return null;
        }
    }
    
    public void mostrar (){
        Object object[]=null;
        if(jTable1.getRowCount()<agenda.size()){
        for (int i=jTable1.getRowCount();i<agenda.size();i++){
            Contactos contactos = (Contactos) agenda.get(i);
            model.addRow(object);
            model.setValueAt(contactos.getId(), i, 0);
            model.setValueAt(contactos.getApellido(), i, 1);
            model.setValueAt(contactos.getNombre(), i, 2);
            model.setValueAt(contactos.getDireccion(), i, 3);
            model.setValueAt(contactos.getTelefono(), i, 4);
        }
        }
    }
    
    public void Ordenar(){
            jTable1.removeRowSelectionInterval(0,agenda.size());
            Ordenar();
            CrearTabla();
            mostrar();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelId;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
