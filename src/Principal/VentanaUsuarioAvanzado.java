package Principal;
import Fichero.Fichero;
import Principal.Administrador;
import Principal.VentanaAdministrador;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class VentanaUsuarioAvanzado  extends javax.swing.JFrame{


    /**
     *
     * @author ADmin
     */

    protected ArrayList<Usuario> user;
    protected Fichero fichero;
    protected Usuario usuarioGuardado;

    public VentanaUsuarioAvanzado(ArrayList<Usuario> user, Fichero fichero, Usuario usuarioGuardado){
        this.user = user;
        this.fichero = fichero;
        this.usuarioGuardado = usuarioGuardado;
    }


    public VentanaUsuarioAvanzado() {
            initComponents();
            PanelCambiarUsuarioG.setVisible(false);
            PanelTrabajoDatos.setVisible(false);
            //Inicialisamos la ventana con todas los paneles de obciones invisibles
        }


        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            PanelCambiarUsuarioG = new javax.swing.JPanel();
            jComboBox3 = new javax.swing.JComboBox<>();
            jTextField9 = new javax.swing.JTextField();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            jButton7 = new javax.swing.JButton();
            PanelTrabajoDatos = new javax.swing.JPanel();
            jButton2 = new javax.swing.JButton();
            jButton1 = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            CajaTextoDatos = new javax.swing.JTextArea();
            jButton8 = new javax.swing.JButton();
            jButton12 = new javax.swing.JButton();
            jButton11 = new javax.swing.JButton();
            jComboBox1 = new javax.swing.JComboBox<>();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario Avanzado", "Usuario" }));
            jComboBox3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox3ActionPerformed(evt);
                }
            });

            jTextField9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField9ActionPerformed(evt);
                }
            });

            jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel14.setText("Nombre de Usuario");

            jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel15.setText("Grupo al que desea Cambiar");

            jButton7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jButton7.setText("OK");
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelCambiarUsuarioGLayout = new javax.swing.GroupLayout(PanelCambiarUsuarioG);
            PanelCambiarUsuarioG.setLayout(PanelCambiarUsuarioGLayout);
            PanelCambiarUsuarioGLayout.setHorizontalGroup(
                    PanelCambiarUsuarioGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCambiarUsuarioGLayout.createSequentialGroup()
                                    .addGroup(PanelCambiarUsuarioGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelCambiarUsuarioGLayout.createSequentialGroup()
                                                    .addGap(223, 223, 223)
                                                    .addGroup(PanelCambiarUsuarioGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(PanelCambiarUsuarioGLayout.createSequentialGroup()
                                                                    .addGap(25, 25, 25)
                                                                    .addComponent(jLabel14))
                                                            .addGroup(PanelCambiarUsuarioGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(PanelCambiarUsuarioGLayout.createSequentialGroup()
                                                    .addGap(296, 296, 296)
                                                    .addComponent(jButton7)))
                                    .addContainerGap(248, Short.MAX_VALUE))
            );
            PanelCambiarUsuarioGLayout.setVerticalGroup(
                    PanelCambiarUsuarioGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCambiarUsuarioGLayout.createSequentialGroup()
                                    .addContainerGap(86, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15)
                                    .addGap(16, 16, 16)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60))
            );

            jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jButton2.setText("Visualizar lista de usuarios");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jButton1.setText("Visualizar todos los datos");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            CajaTextoDatos.setColumns(20);
            CajaTextoDatos.setRows(5);
            jScrollPane1.setViewportView(CajaTextoDatos);

            jButton8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jButton8.setText("Guardar todos los datos en fichero");
            jButton8.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton8ActionPerformed(evt);
                }
            });

            jButton12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jButton12.setText("Visualizar usuarios por grupos");
            jButton12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton12ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelTrabajoDatosLayout = new javax.swing.GroupLayout(PanelTrabajoDatos);
            PanelTrabajoDatos.setLayout(PanelTrabajoDatosLayout);
            PanelTrabajoDatosLayout.setHorizontalGroup(
                    PanelTrabajoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTrabajoDatosLayout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addGroup(PanelTrabajoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(117, 117, 117)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addContainerGap())
            );
            PanelTrabajoDatosLayout.setVerticalGroup(
                    PanelTrabajoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTrabajoDatosLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTrabajoDatosLayout.createSequentialGroup()
                                    .addContainerGap(15, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
            );

            jButton11.setText("Desconectarse");
            jButton11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton11ActionPerformed(evt);
                }
            });

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajo con datos", "Cambiar Usuario" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            jLabel1.setText("Elija la opcion deseada");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                    .addComponent(jButton11)
                                    .addGap(28, 28, 28))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelTrabajoDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelCambiarUsuarioG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton11)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                    .addContainerGap(403, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 92, Short.MAX_VALUE)
                                            .addComponent(PanelTrabajoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 99, Short.MAX_VALUE)
                                            .addComponent(PanelCambiarUsuarioG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

            Principal p1 = new Principal();//Creamos un objeto de nuestra ventana principal
            p1.setVisible(true); //Le decimos que sea visible, osea, que se muestro
            dispose(); //Cierra la ventana actual
        }//GEN-LAST:event_jButton11ActionPerformed

        private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_jComboBox3ActionPerformed

        private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_jTextField9ActionPerformed
        //Cambiar Grupo de los Usuarios
        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            String nombre;
            String grupo;
            String nombreCompleto, nombreUsuario, contrasena, tipoUsuario;
            boolean encontrado = false;

            nombre= jTextField9.getText();
            grupo = jComboBox3.getItemAt( jComboBox3.getSelectedIndex() ); //Duda con este metodo
            //El selected index devuelve el indice del comboBOx seleccionado, y asi el getItem at
            //Devuelve lo escrito en la posicion de ese indice

//            if(VentanaAdministrador.(nombre, grupo)){
//                JOptionPane.showMessageDialog(null, "Se ha realiado la tarea correctamente");
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "No se pudo encontrar");
//            }
//
//            try {//Limpia y reescribe
//                Principal.LimpiarDatos();
//                Principal.EscribirDatos();
//            } catch (IOException ex) {
//                java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
            for (Usuario current : user) {
                if (current.getNombreCompleto().equals(nombre)) {
                    nombreCompleto = current.getNombreCompleto();
                    nombreUsuario = current.getNombreUsuario();
                    contrasena = current.getContrasena();
                    encontrado =true;
                    //se Guardan los datos
                    if (grupo.equalsIgnoreCase(" Administrador")) {
                        tipoUsuario = "Administrador";

                        Administrador aux = new Administrador(nombre, nombreUsuario, contrasena, tipoUsuario);
                        user.remove(current);
                        user.add(aux);

                    } else if (grupo.equalsIgnoreCase("Usuario Avanzado")) {
                        tipoUsuario = "Usuario Avanzado";
                        UsuarioAvanzado aux = new UsuarioAvanzado(nombre, nombreUsuario, contrasena, tipoUsuario);
                        user.remove(current);
                        user.add(aux);
                    } else {
                        tipoUsuario = "Usuario";
                        Usuario aux = new Usuario(nombre, nombreUsuario, contrasena, tipoUsuario);
                        user.remove(current);
                        user.add(aux);
                    }
                }
            }


            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Se ha realiado la tarea correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo encontrar");
            }

            try {//Limpia y reescribe
                fichero.limpiarDatos();
                fichero.escribirDatos(user);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        //GEN-LAST:event_jButton7ActionPerformed
        //Vizualizar listas de usuarios
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            CajaTextoDatos.setText(""); //Limpiamos la caja de texto, lo igualamos a practicamente... Nada...

            String datos = ""; //Guardamos los datos en este String para imprimirlo en el AreaFild

            for(Usuario current: user){ //un for para recorrer el arreglo
                datos += current.getNombreUsuario();//Guardamos de manera concatenda el nombre de los usarios
                datos += "\n" + current.getNombreCompleto() + "\n";//Le damos un salto de linea
            }

            CajaTextoDatos.setText(datos); //Mandamos a mostrar los datos

        }//GEN-LAST:event_jButton2ActionPerformed
        //Visualizar todos los datos
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            CajaTextoDatos.setText("");  //Limpiamos la caja de texto
            String datos = ""; //Guardamos todos los datos en este String

            for(Usuario current: user){//recorremos el arreglo
                datos += current.getNombreCompleto() + "\n" + current.getNombreUsuario() + "\n";
                datos +=  current.getGrupoPertenece() + "\n";
                //Guardamos nombre, nombre usuario, y su grupo
            }//la contraseña es secreta...

            CajaTextoDatos.setText(datos);//Imprimimos los datos...

        }//GEN-LAST:event_jButton1ActionPerformed
        //Guardar todos los datos en el fichero
        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

            try {
                fichero.limpiarDatos();//Limpiamos el fichero
                fichero.escribirDatos(user);//Lo escribimos
                JOptionPane.showMessageDialog(null, "Se guardaron los datos en el fichero de manera correcta");
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(VentanaUsuarioAvanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }


            //enviamos un mensaje que se cumplio todo correctamente
        //GEN-LAST:event_jButton8ActionPerformed
        //visualizar los usuarios por grupo
        private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            CajaTextoDatos.setText(""); //Limpiamos la caja de texto, x si tiene algo
            String usuarioAdmin = "", usuarioAvanzado = "", usuarioS = ""; //Creas 3 Strings para Guardar los nombres de los usuarios
            for(Usuario current: user){ //for para recorrer el arreglo
                if(current instanceof Administrador){//Si es de clase administrador se guarda
                    usuarioAdmin += current.getNombreCompleto() + "\n";//en el String de ad para imprimirlo
                }
                if(current instanceof UsuarioAvanzado){    //Si es de clase Usuario avanzado se guarda
                    usuarioAvanzado += current.getNombreCompleto() + "\n";//en el String de ua para imprimirlo
                }
                if(current instanceof Usuario){    //Si es de clase Usuario Simple se guarda
                    usuarioS += current.getNombreCompleto() + "\n";//en el String de us para imprimirlo
                }
            }
            //se usa para mostrar los grupos y sus respectivos usuarios en orden
            CajaTextoDatos.setText("Grupo de Administradores: " + "\n" + usuarioAdmin + "\n" +
                    "Grupo de Usuarios avanzados: " + "\n" + usuarioAvanzado + "\n" +
                    "Grupo de Usuarios simples: " + "\n" + usuarioS);
            //Muestra segun el nivel
        }//GEN-LAST:event_jButton12ActionPerformed

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            //Muetra la opcion que quiero realizar
            switch (jComboBox1.getSelectedIndex()){
                case 0:
                    PanelTrabajoDatos.setVisible(true);
                    PanelCambiarUsuarioG.setVisible(false);
                    break;

                case 1:
                    PanelCambiarUsuarioG.setVisible(true);
                    PanelTrabajoDatos.setVisible(false);
                    break;

                default: break;
            }
            //Se vasa en el indice tal cual arreglo
        }//GEN-LAST:event_jComboBox1ActionPerformed

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
                    java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                    java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new VentanaAdministrador().setVisible(true);
                    }
                });

            }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextArea CajaTextoDatos;
        private javax.swing.JPanel PanelCambiarUsuarioG;
        private javax.swing.JPanel PanelTrabajoDatos;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton11;
        private javax.swing.JButton jButton12;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField jTextField9;
        // End of variables declaration//GEN-END:variables
    }

