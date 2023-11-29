package Principal;

import Fichero.Fichero;
import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

import static java.util.Arrays.asList;


public class Principal extends javax.swing.JFrame {

    protected ArrayList<Usuario> usuario;//Arreglo dinamico para guardar objetos de manera infinita
    protected Fichero fichero;
    protected Usuario UsuarioGuardado;

    public Principal(ArrayList<Usuario> usuario, Fichero fichero) {
        this.usuario = usuario;
        this.fichero = (fichero != null) ? fichero : new Fichero(usuario);
    }
    public  Usuario getUsuarioGuardado() {
        return UsuarioGuardado;
    }




    public Principal() { //Seccion donde se inicia los primeros codigos y los paneles
        initComponents();
        PanelPrincipal.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jButton1.setText("Conectarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
                PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                .addGap(231, 231, 231)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel2))
                                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jTextField1)
                                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                .addGap(265, 265, 265)
                                                .addComponent(jButton1)))
                                .addContainerGap(251, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
                PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo del boton del "Login" (Login: una interfaz grafica donde se autentifica X usuario)
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.fichero == null) {
            this.fichero = new Fichero(usuario);
        }
    /*
    Para realizarse el metodo de leerDatos, es necesario realizar un TryCatch, para atrapar los errores en
    caso de que el archivo que trata de usar, no exista o no tenga ningun dato
    */
        String nombre = jTextField1.getText(); //Guardamos el texto dentro de los campos para usarlos
        String contrasena = jPasswordField1.getText();//para mas adelante verificar el usuario
        System.out.println("Entered Username: " + nombre);
        System.out.println("Entered Password: " + contrasena);
        try {
            fichero.leerDatos();
            for (Usuario current : usuario) {//Registraremos en la base de datos con este for
                System.out.println(usuario.toString());
                if(this.usuario == null){
                    this.usuario = new ArrayList<>();
                }
                System.out.println("User in List: " + current.getNombreUsuario());
                if (current.getNombreUsuario().equals(nombre)) {//Aqui verificamos que el usuario exista
                    System.out.println("Username Matched: " + nombre);
                    if (current.getContrasena().equals(contrasena)) {//Verificamos que su contra sea correcta
                        System.out.println("Password Matched: " + contrasena);
                        UsuarioGuardado = current; //Guardar el usuario para usar mas tarde en el array
                        if (current instanceof Administrador) {//Verificamos si es Administrador
                            VentanaAdministrador v1 = new VentanaAdministrador(); // Creamos otra ventana
                            System.out.println("Opening Admin");
                            dispose(); // sin antes cerrar nuestra ventana principal con este comando
                            v1.setVisible(true); //ordenamos a esta ventana que se muestre, pero no
                        } else if (current instanceof UsuarioAvanzado) {// verificamos si es Proyecto.Usuario Avanzado
                            System.out.println("Opening VentanaUsuarioAvanzado");
                            VentanaUsuarioAvanzado v2 = new VentanaUsuarioAvanzado();
                            dispose();
                            v2.setVisible(true);
                        }
                        if (current instanceof Usuario) {// verificamos si es Usuario Simple
                            System.out.println("Opening Usuario");
                            VentanaUsuario v3 = new VentanaUsuario();
                            dispose();
                            v3.setVisible(true);
                        }
                        break;//cerramos el bucle ya que abrimos otra ventana
                    }
                    if (!current.equals(current.getContrasena())) {
                        jTextField1.setText("");//Limpiamos los campos de textos al declararlos como ""
                        jPasswordField1.setText("");
                        JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
//Este codigo de arriba crea una ventana chica emergente que es mas facil de usar
                    }
                    break;//Rompemos el bucle ya que la contrasena es incorrecta
                }
                if (!current.equals(UsuarioGuardado)) {
                    JOptionPane.showMessageDialog(null, "El usuario es incorrecto");
//Este codigo de arriba crea una ventana chica emergente que es mas facil de usar
                    jTextField1.setText("");//Limpiamos los campos de texto por si no coloca bien el usuario
                    jPasswordField1.setText("");
                }
                System.out.println(current.getNombreUsuario());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
//Asociamos el valor escrito dentro de los textfield en unas variables para trabajar


    }


    /**
     * @param args the command line arguments
     */


    public static void main(String args[]) throws FileNotFoundException {


        Usuario usuario1 = new UsuarioAvanzado("Eismer", "eismer", "alicate", "Avanzado *");
        Usuario usuario4 = new UsuarioAvanzado("Eismerin", "eismer2", "alicate", "Avanzado *");
        Usuario usuario2 = new Administrador("Nayelhis", "Nae", "lorem", "Administrador *");
        Usuario usuario3 = new Usuario("Anacleto", "Ana", "Sapotero", "Usuario*");

        ArrayList<Usuario> u = new ArrayList<>();

        u.addAll(asList(usuario1, usuario2, usuario3, usuario4));
        Fichero fichero = new Fichero(u);
        fichero.exportarFichero(u);
        Principal principal = new Principal(u,fichero);
        VentanaAdministrador administrador = new VentanaAdministrador(u, new Fichero(u), principal.getUsuarioGuardado());
        VentanaUsuarioAvanzado usuarioAvanzado = new VentanaUsuarioAvanzado(u, new Fichero(u), principal.getUsuarioGuardado());
        VentanaUsuario usuario = new VentanaUsuario(u, new Fichero(u), principal.getUsuarioGuardado());

//        try {
//            principal.fichero.escribirDatos(u);
//            principal.fichero.exportarFichero(u);
//            principal.fichero.LeerDatos();
//        } catch (IOException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error cargando la informacion del usuario");
//        }


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
}

