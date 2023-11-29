package Principal;

import Fichero.Fichero;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



    /**
     *
     * @author Admin
     */
    public class VentanaAdministrador extends javax.swing.JFrame{

        protected ArrayList<Usuario> user;
        protected Fichero fichero;
        protected Usuario usuarioGuardado;

        public VentanaAdministrador(ArrayList<Usuario> user, Fichero fichero, Usuario usuarioGuardado){
            this.user = user;
            this.fichero = fichero;
            this.usuarioGuardado = usuarioGuardado;
        }

        //Metodo para Limpiar los datos, que se usa junto a la escritura de datos
//        public void LimpiarDatosEnFichero() throws IOException {
//            FileWriter limpiador = new FileWriter("C:/Files/escuela/ProyectoFinal fichero/users.txt");
//
//            limpiador.write("");/*
//        lo limpiamos diciendo que escriba ""
//        */
//            limpiador.close();
//        }

        //Metodo para guardar los datos en fichero
     //   public static void GuardarDatosEnFichero() throws IOException{

          //  FileWriter escritor = new FileWriter("C:/Files/escuela/ProyectoFinal fichero/users.txt", true);
//Creamos un archivo "Escritor de Ficheros" para "escribir en el fichero..." / Guardar los datos
//Se le escribe la direccion y un valor booleano para darle permiso si escribir continuamente o no

//            for(Usuario current: usuario){//Recorre el arrayList
//                escritor.write(current.getNombreCompleto());//Tomamos el nombre y se lo escribimos al fichero
//                escritor.write("\n"); //Para que de un salto de linea, y no se amontonen los datos
//                escritor.write(current.getNombreUsuario());//Toamos el nombreUsuario y lo agregamos
//                escritor.write("\n"); //Para que de un salto de linea, y no se amontonen los datos
//                escritor.write(current.getGrupoPertenece());//Le escribimos al fichero el grupo
//                escritor.write("\n"); //Para que de un salto de linea, y no se amontonen los datos
//            }
//
//            escritor.close(); //cerrar el fichero
//        }

        public VentanaAdministrador() {
            initComponents();
            PanelCambiarNombre.setVisible(false);
            PanelCambiarContra.setVisible(false);
            PanelEliminar.setVisible(false);
            PanelCrearUsuario.setVisible(false);
            PanelTrabajoDatos.setVisible(false);
            PanelCambiarDeGrupo.setVisible(false);
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

            PanelAdministrador = new javax.swing.JPanel();
            PanelCambiarDeGrupo = new javax.swing.JPanel();
            jTextField9 = new javax.swing.JTextField();
            jLabel14 = new javax.swing.JLabel();
            jLabel15 = new javax.swing.JLabel();
            jButton7 = new javax.swing.JButton();
            jComboBox3 = new javax.swing.JComboBox<>();
            PanelTrabajoDatos = new javax.swing.JPanel();
            jButton2 = new javax.swing.JButton();
            jButton1 = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            CajaTextoDatos = new javax.swing.JTextArea();
            jButton8 = new javax.swing.JButton();
            jButton12 = new javax.swing.JButton();
            PanelCambiarNombre = new javax.swing.JPanel();
            jTextField6 = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            jButton5 = new javax.swing.JButton();
            jTextField8 = new javax.swing.JTextField();
            jLabel9 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTextArea1 = new javax.swing.JTextArea();
            jButton9 = new javax.swing.JButton();
            PanelCrearUsuario = new javax.swing.JPanel();
            jComboBox1 = new javax.swing.JComboBox<>();
            jTextField4 = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jTextField5 = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jButton4 = new javax.swing.JButton();
            jPasswordField2 = new javax.swing.JPasswordField();
            jScrollPane3 = new javax.swing.JScrollPane();
            jTextArea2 = new javax.swing.JTextArea();
            jButton10 = new javax.swing.JButton();
            jComboBox2 = new javax.swing.JComboBox<>();
            PanelEliminar = new javax.swing.JPanel();
            jTextField2 = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            jButton3 = new javax.swing.JButton();
            PanelCambiarContra = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            jPasswordField3 = new javax.swing.JPasswordField();
            jLabel11 = new javax.swing.JLabel();
            jPasswordField4 = new javax.swing.JPasswordField();
            jLabel12 = new javax.swing.JLabel();
            jPasswordField5 = new javax.swing.JPasswordField();
            jButton6 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            jButton11 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            PanelAdministrador.setMaximumSize(new java.awt.Dimension(642, 442));
            PanelAdministrador.setPreferredSize(new java.awt.Dimension(642, 442));

            jTextField9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField9ActionPerformed(evt);
                }
            });

            jLabel14.setFont(new java.awt.Font("Arial", 0, 14));
            jLabel14.setText("Nombre de Usuario");

            jLabel15.setFont(new java.awt.Font("Arial", 0, 14));
            jLabel15.setText("Grupo al que desea Cambiar");

            jButton7.setFont(new java.awt.Font("Arial", 0, 14));
            jButton7.setText("OK");
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton7ActionPerformed(evt);
                }
            });

            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Administrador", " Usuario Avanzado", "Usuario" }));
            jComboBox3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox3ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelCambiarDeGrupoLayout = new javax.swing.GroupLayout(PanelCambiarDeGrupo);
            PanelCambiarDeGrupo.setLayout(PanelCambiarDeGrupoLayout);
            PanelCambiarDeGrupoLayout.setHorizontalGroup(
                    PanelCambiarDeGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCambiarDeGrupoLayout.createSequentialGroup()
                                    .addGroup(PanelCambiarDeGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelCambiarDeGrupoLayout.createSequentialGroup()
                                                    .addGap(251, 251, 251)
                                                    .addComponent(jLabel14))
                                            .addGroup(PanelCambiarDeGrupoLayout.createSequentialGroup()
                                                    .addGap(291, 291, 291)
                                                    .addComponent(jButton7))
                                            .addGroup(PanelCambiarDeGrupoLayout.createSequentialGroup()
                                                    .addGap(226, 226, 226)
                                                    .addGroup(PanelCambiarDeGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jTextField9))))
                                    .addContainerGap(233, Short.MAX_VALUE))
            );
            PanelCambiarDeGrupoLayout.setVerticalGroup(
                    PanelCambiarDeGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCambiarDeGrupoLayout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15)
                                    .addGap(16, 16, 16)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(60, Short.MAX_VALUE))
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
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
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
                                    .addContainerGap(19, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
            );

            jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel8.setText("Nuevo Nombre");

            jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jButton5.setText("OK");
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton5ActionPerformed(evt);
                }
            });

            jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel9.setText("Escriba el nombre de usuario a cambiar");

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane2.setViewportView(jTextArea1);

            jButton9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jButton9.setText("Visualizar los usuarios registrados");
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton9ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelCambiarNombreLayout = new javax.swing.GroupLayout(PanelCambiarNombre);
            PanelCambiarNombre.setLayout(PanelCambiarNombreLayout);
            PanelCambiarNombreLayout.setHorizontalGroup(
                    PanelCambiarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCambiarNombreLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addGroup(PanelCambiarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(jButton5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                    .addGroup(PanelCambiarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2))
                                    .addGap(19, 19, 19))
            );
            PanelCambiarNombreLayout.setVerticalGroup(
                    PanelCambiarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCambiarNombreLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(PanelCambiarNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelCambiarNombreLayout.createSequentialGroup()
                                                    .addGap(0, 56, Short.MAX_VALUE)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(36, 36, 36)
                                                    .addComponent(jButton5))
                                            .addComponent(jScrollPane2))
                                    .addGap(8, 8, 8)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
            );

            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario Avanzado", "Usuario" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });

            jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel4.setText("Nombre Completo del Usuario");

            jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel5.setText("Nombre del Usuario");

            jTextField5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField5ActionPerformed(evt);
                }
            });

            jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel6.setText("Contraseña");

            jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel7.setText("Grupo");

            jButton4.setText("Crear");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });

            jTextArea2.setColumns(20);
            jTextArea2.setRows(5);
            jScrollPane3.setViewportView(jTextArea2);

            jButton10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jButton10.setText("Visualizar lista de usuarios");
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton10ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelCrearUsuarioLayout = new javax.swing.GroupLayout(PanelCrearUsuario);
            PanelCrearUsuario.setLayout(PanelCrearUsuarioLayout);
            PanelCrearUsuarioLayout.setHorizontalGroup(
                    PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCrearUsuarioLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                    .addComponent(jButton4)
                                    .addGap(51, 51, 51)
                                    .addGroup(PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addGroup(PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addGap(31, 31, 31))
            );
            PanelCrearUsuarioLayout.setVerticalGroup(
                    PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCrearUsuarioLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30))
                            .addGroup(PanelCrearUsuarioLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(PanelCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliminar Usuario", "Crear Usuario", "Cambiar nombre de Usuario", "Cambiar Contraseña", "Trabajo con Datos ", "Cambiar Grupo de Usuario" }));
            jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox2ActionPerformed(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
            jLabel3.setText("Escriba el nombre del usuario que desea eliminar");

            jButton3.setText("Eliminar");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelEliminarLayout = new javax.swing.GroupLayout(PanelEliminar);
            PanelEliminar.setLayout(PanelEliminarLayout);
            PanelEliminarLayout.setHorizontalGroup(
                    PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEliminarLayout.createSequentialGroup()
                                    .addGap(177, 177, 177)
                                    .addComponent(jLabel3)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelEliminarLayout.createSequentialGroup()
                                    .addGap(269, 269, 269)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                                            .addGap(238, 238, 238)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(239, Short.MAX_VALUE)))
            );
            PanelEliminarLayout.setVerticalGroup(
                    PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEliminarLayout.createSequentialGroup()
                                    .addGap(86, 86, 86)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(96, 96, 96)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(117, Short.MAX_VALUE))
                            .addGroup(PanelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEliminarLayout.createSequentialGroup()
                                            .addGap(148, 148, 148)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(171, Short.MAX_VALUE)))
            );

            jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel10.setText("Escriba la contraseña");

            jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel11.setText("Escriba la nueva contraseña");

            jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel12.setText("Repita la Nueva Contraseña");

            jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jButton6.setText("OK");
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelCambiarContraLayout = new javax.swing.GroupLayout(PanelCambiarContra);
            PanelCambiarContra.setLayout(PanelCambiarContraLayout);
            PanelCambiarContraLayout.setHorizontalGroup(
                    PanelCambiarContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCambiarContraLayout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelCambiarContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPasswordField5)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                            .addComponent(jPasswordField3)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPasswordField4))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCambiarContraLayout.createSequentialGroup()
                                    .addContainerGap(288, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(281, 281, 281))
            );
            PanelCambiarContraLayout.setVerticalGroup(
                    PanelCambiarContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCambiarContraLayout.createSequentialGroup()
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(23, Short.MAX_VALUE))
            );

            jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel1.setText("Elija la opcion que necesite");

            jButton11.setText("Desconectarse");
            jButton11.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton11ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout PanelAdministradorLayout = new javax.swing.GroupLayout(PanelAdministrador);
            PanelAdministrador.setLayout(PanelAdministradorLayout);
            PanelAdministradorLayout.setHorizontalGroup(
                    PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministradorLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addGap(46, 46, 46)
                                    .addComponent(jButton11)
                                    .addGap(28, 28, 28))
                            .addComponent(PanelEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelCrearUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelCambiarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelCambiarContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelTrabajoDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelCambiarDeGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            PanelAdministradorLayout.setVerticalGroup(
                    PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAdministradorLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton11)
                                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel1)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                    .addComponent(PanelEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministradorLayout.createSequentialGroup()
                                            .addGap(0, 81, Short.MAX_VALUE)
                                            .addComponent(PanelCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministradorLayout.createSequentialGroup()
                                            .addGap(0, 111, Short.MAX_VALUE)
                                            .addComponent(PanelCambiarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministradorLayout.createSequentialGroup()
                                            .addGap(0, 91, Short.MAX_VALUE)
                                            .addComponent(PanelCambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministradorLayout.createSequentialGroup()
                                            .addGap(0, 71, Short.MAX_VALUE)
                                            .addComponent(PanelTrabajoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdministradorLayout.createSequentialGroup()
                                            .addGap(0, 109, Short.MAX_VALUE)
                                            .addComponent(PanelCambiarDeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 654, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(PanelAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 454, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(PanelAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        }//GEN-LAST:event_jComboBox1ActionPerformed

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
            //configuracion del comboBox primero, para las opciones

            switch(jComboBox2.getSelectedIndex()){
                case 0: PanelEliminar.setVisible(true);
                    PanelCrearUsuario.setVisible(false);
                    PanelCambiarNombre.setVisible(false);
                    PanelCambiarContra.setVisible(false);
                    PanelTrabajoDatos.setVisible(false);
                    PanelCambiarDeGrupo.setVisible(false);
                    break;

                case 1: PanelCrearUsuario.setVisible(true);
                    PanelEliminar.setVisible(false);
                    PanelCambiarNombre.setVisible(false);
                    PanelCambiarContra.setVisible(false);
                    PanelTrabajoDatos.setVisible(false);
                    PanelCambiarDeGrupo.setVisible(false);
                    break;

                case 2: PanelCambiarNombre.setVisible(true);
                    PanelEliminar.setVisible(false);
                    PanelCrearUsuario.setVisible(false);
                    PanelCambiarContra.setVisible(false);
                    PanelTrabajoDatos.setVisible(false);
                    PanelCambiarDeGrupo.setVisible(false);
                    break;

                case 3: PanelCambiarContra.setVisible(true);
                    PanelCambiarNombre.setVisible(false);
                    PanelEliminar.setVisible(false);
                    PanelCrearUsuario.setVisible(false);
                    PanelTrabajoDatos.setVisible(false);
                    PanelCambiarDeGrupo.setVisible(false);
                    break;

                case 4: PanelTrabajoDatos.setVisible(true);
                    PanelCambiarContra.setVisible(false);
                    PanelCambiarNombre.setVisible(false);
                    PanelEliminar.setVisible(false);
                    PanelCrearUsuario.setVisible(false);
                    PanelCambiarDeGrupo.setVisible(false);
                    break;

                case 5:PanelCambiarDeGrupo.setVisible(true);
                    PanelTrabajoDatos.setVisible(false);
                    PanelCambiarContra.setVisible(false);
                    PanelCambiarNombre.setVisible(false);
                    PanelEliminar.setVisible(false);
                    PanelCrearUsuario.setVisible(false);
                    break;

                default: break;
            }
        }//GEN-LAST:event_jComboBox2ActionPerformed

        private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        }//GEN-LAST:event_jComboBox3ActionPerformed
        //ELIMINAR USUARIO
        public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            String nom = jTextField2.getText();
            boolean valor = false;
            for (Usuario current : user ) {
                    if (current.getNombreCompleto().equals(nom)) {
                        user.remove(current);   //para eliminar el usuario en la posicion que coincida
                        valor = true;
                        break; //Se detiene el bucle automaticamente ya que retrona el valor solicitado

                    }
            }
            if(valor){
                JOptionPane.showMessageDialog(null, "El Usuario ha sido eliminado con exito");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontro usuario para eliminar");
            }

            try {
                fichero.limpiarDatos();
                fichero.escribirDatos(user);
            } catch (IOException ex) {
                Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        }//GEN-LAST:event_jTextField9ActionPerformed

        //CAMBIAR EL GRUPO
        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            String nombre;
            String grupo;
            boolean encontrado = false;

            nombre = jTextField9.getText();
            grupo = (String) jComboBox3.getSelectedItem();
            //El selected index devuelve el indice del comboBOx seleccionado, y asi el getItem at
            //Devuelve lo escrito en la posicion de ese indice

            String nombreCompleto, nombreUsuario, contrasena, tipoUsuario;
            //Todos los datos del objeto deben de ser guardados porque el casteo es casi imposible hacerse
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
        //CAMBIAR CONTRASENA
        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            //Guardar las 3 contra y verificar que se pueda hacer un cambio correcto
            String contrasena1,contrasena2,contrasena3;
            boolean error = true;

            contrasena1= jPasswordField5.getText();
            contrasena2= jPasswordField3.getText();
            contrasena3= jPasswordField4.getText();

            if(contrasena2.length() > 4){//solo se ejecutara si la contra es mayor de 4 digitos
                if(contrasena2.equals(contrasena3)){//solo se ejecuta si son ambas contras
                    if(usuarioGuardado.getContrasena().equals(contrasena1)){//se verifica el usuario
                        usuarioGuardado.CambiarContrasena(contrasena2);//se cambia la contrasena
                        JOptionPane.showMessageDialog(null, "Se cambio la contraseña correctamente");
                        user.add(usuarioGuardado);
                        error = false;
                    }
                }
            }

            if(error){
                JOptionPane.showMessageDialog(null, "Alguna de las contraseñas esta mal escrita");
            }

            //Metodo para limpiar el archivo TXT y guardar la nueva informacion de los usarios actualizados
            try {//Limpia y reescribe
                fichero.limpiarDatos();
                fichero.escribirDatos(user);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }//GEN-LAST:event_jButton6ActionPerformed

        //Metodo para que se vea la lista de Usuarios
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            CajaTextoDatos.setText(""); //Limpiamos la caja de texto igualandolo a nada

            String datos = ""; //Guardamos los datos en este String para imprimirlo en el AreaFild

            for(Usuario current: user){ //para recorrer el arreglo
                datos += current.getNombreUsuario();//Guardamos de manera concatenda el nombre de los usarios
                datos += "\n" + current.getNombreCompleto() + "\n";//damos un salto de linea
            }

            CajaTextoDatos.setText(datos); //mostrar los datos

        }//GEN-LAST:event_jButton2ActionPerformed

        //Metodo para visualizar todos los datos
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            CajaTextoDatos.setText("");  //Limpiamos la caja de texto
            String datos = ""; //Guardamos todos los datos en este String

            for(Usuario current: user){//recorremos el arreglo
                datos += current.getNombreCompleto() + "\n" + current.getNombreUsuario() + "\n";
                datos +=  current.getGrupoPertenece() + "\n";
                //Guardamos nombre, nombre usuario, y su grupo
            }//ya que la contraseña es secreta

            CajaTextoDatos.setText(datos);//Imprimimos los datos

        }//GEN-LAST:event_jButton1ActionPerformed
        //Metodo para Guardar todos los datos en un fichero
        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            try {
                fichero.limpiarDatos();//Limpiamos el fichero
                fichero.escribirDatos(user);//Lo escribimos
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }

            JOptionPane.showMessageDialog(null, "Se guardaron los datos en el fichero de manera correcta");
            //enviamos un mensaje que se cumplio todo
        }//GEN-LAST:event_jButton8ActionPerformed
        //CAMBIAR NOMBRE
        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            boolean error = false;
            String nombreUsuario = "", nomCambiado = "";
            int contador = 0;

            nombreUsuario = jTextField8.getText();
            nomCambiado = jTextField6.getText();
            //Guardamos los datos del textField para trabajar con ellos

            for(Usuario current: user){
                contador++;
                if(current.getNombreUsuario().equals(nombreUsuario)){
                   current.CambiarNombreUsuario(nomCambiado);

                    try {
                        fichero.limpiarDatos();
                        fichero.escribirDatos(user);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                    break;
                }
                if(contador == user.size() - 1){//Esto se refiere a que llego al final y no hizo nada, porque  no funciono el break
                    error = true;
                }
            }
            if(error){
                JOptionPane.showMessageDialog(null, "No se pudo realizar el cambio, revise que halla escrito correctamente los nombres");
            }
            else{
                JOptionPane.showMessageDialog(null, "Se realizo correctamente el cambio");
            }

        }
        // CREAR USUARIO
        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if(jTextField4.getText().isBlank() || jTextField5.getText().isBlank()
                    || jPasswordField2.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Alguno de los campos estan en blanco");
                //isBlank, devuelve TRUE si un String esta en blanco o espacios en blanco
            }
            else{
                boolean continuar = true, logrado = false;//Los Booleans son para darle continuidad a los codigos
                String nombre ="", nombreUsuario = "", contrasena = "", tipo = ""; //inicializar las variables

                //Guardamos los TextFields
                nombre = jTextField4.getText();
                nombreUsuario = jTextField5.getText();
                contrasena = jPasswordField2.getText();
                tipo = (String) jComboBox1.getSelectedItem(); //No estoy seguro de que funcione

                for(Usuario current: user){
                    if (current.getNombreUsuario().equals(nombreUsuario)){//Revisa si el Nomb Usuario ya existe
                        continuar = false;
                        JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya existe");
                        break;
                    }
                }

                if(contrasena.length() > 4 && continuar){
                    switch (tipo){
                        case ("Administrador"):
                            tipo = "Administrador";
                            Administrador userAdmin = new Administrador(nombre,nombreUsuario,contrasena,tipo);
                            logrado = true;  user.add(userAdmin); break;

                        case ("Usuario Avanzado"):
                            tipo = "Usuario Avanzado";
                            UsuarioAvanzado userAvanzado = new UsuarioAvanzado(nombre,nombreUsuario,contrasena,tipo);
                            logrado = true; user.add(userAvanzado); break;

                        case ("Usuario Simple"):
                            tipo = "Usuario Simple";
                            Usuario userSimple = new Usuario(nombre,nombreUsuario,contrasena,tipo);
                            logrado = true; user.add(userSimple); break;

                        default: break;
                    }
                }else if (continuar){
                    JOptionPane.showMessageDialog(null, "La contraseña es muy corta, debe de tener mas de 4 digitos");
                }

                if(logrado){
                    try {
                        fichero.leerDatos();
                        fichero.escribirDatos(user);
                        JOptionPane.showMessageDialog(null, "Se creo correctamente del usuario");
                    } catch (IOException ex) {
                        Logger.getLogger(VentanaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }//GEN-LAST:event_jButton4ActionPerformed

        //Metodo para vizualizar los usuarios registrados
        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

            jTextArea1.setText("");  //Limpiamos la caja de texto
            String datos = ""; //Guardamos todos los datos en este String

            for(Usuario current: user){//recorremos el arreglo
                datos += current.getNombreCompleto() + "\n" + current.getNombreUsuario() + "\n" + "\n" + current.getGrupoPertenece();
                //Guardamos nombre, nombre usuario, y su grupo
            }//la contraseña es secreta

            jTextArea1.setText(datos); //imprimimos los datos

        }//GEN-LAST:event_jButton9ActionPerformed
        //Guarda todos los datos
        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

            jTextArea2.setText("");  //Limpiamos la caja de texto
            String datos = ""; //Guardamos todos los datos en este String

            for(Usuario current: user){//recorremos el arreglo
                datos += current.getNombreCompleto() + "\n" + current.getNombreUsuario() + "\n" + current.getGrupoPertenece();
                //Guardamos nombre, nombre usuario, y su grupo
            }// la contraseña es secreta...

            jTextArea2.setText(datos); //imprimimos los datos.. hay mas arriba un metodo igual
        }//GEN-LAST:event_jButton10ActionPerformed
        //DESCONECTARSE
        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

            Principal p = new Principal();//Creamos un objeto de nuestra ventana principal
            p.setVisible(true); //Le decimos que sea visible, osea, que se muestro
            dispose(); //Cierra la ventana actual

        }//GEN-LAST:event_jButton11ActionPerformed
        //Mostrar La lista de usuarios segun el grupo
        private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            CajaTextoDatos.setText(""); //Limpiamos la caja de texto
            String usuarioAv = "", usuarioAdmin = "", usuarioS = ""; //Creas 3 Strings para Guardar los nombres de los usuarios
            for(Usuario current: user){ //for para recorrer el arreglo
                if(current instanceof Administrador){//Si es de clase administrador se guarda
                    usuarioAdmin += current.getNombreCompleto() + "\n";// para imprimirlo
                }
                if(current instanceof UsuarioAvanzado){    //Si es de clase Usuario avanzado se guarda
                    usuarioAv += current.getNombreCompleto() + "\n";//en el String para imprimirlo
                }
                if(current instanceof Usuario){    //Si es de clase Proyecto.Usuario Simple se guarda
                    usuarioS += current.getNombreCompleto() + "\n";//en el String para imprimirlo
                }
            }
            // para mostrar los grupos y sus respectivos usuarios en orden
            CajaTextoDatos.setText("Grupo de Administradores: " + "\n" + usuarioAdmin + "\n" +
                    "Grupo de Usuarios Avanzados: " + "\n" + usuarioAv + "\n" +
                    "Grupo de Usuarios Simples: " + "\n" + usuarioS);
            //Muestra segun el nivel de mayor a menor
        }//GEN-LAST:event_jButton12ActionPerformed

        private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        }//GEN-LAST:event_jTextField5ActionPerformed

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
        private javax.swing.JPanel PanelAdministrador;
        private javax.swing.JPanel PanelCambiarContra;
        private javax.swing.JPanel PanelCambiarDeGrupo;
        private javax.swing.JPanel PanelCambiarNombre;
        private javax.swing.JPanel PanelCrearUsuario;
        private javax.swing.JPanel PanelEliminar;
        private javax.swing.JPanel PanelTrabajoDatos;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton11;
        private javax.swing.JButton jButton12;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JComboBox<String> jComboBox3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPasswordField jPasswordField2;
        private javax.swing.JPasswordField jPasswordField3;
        private javax.swing.JPasswordField jPasswordField4;
        private javax.swing.JPasswordField jPasswordField5;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JTextArea jTextArea2;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField jTextField9;
        // End of variables declaration//GEN-END:variables
    }


