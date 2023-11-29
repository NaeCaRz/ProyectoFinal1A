//package Principal;
//
//import java.io.*;
//import java.util.*;
//
//public class Sistema {
//
//    protected List<Usuario> usuario;
//
//    public Sistema(List<Usuario> usuario) {
//        this.usuario = usuario;
//    }
//
//
//    //Cambiar contrasena
//    public void cambiarContrasena(String contrasenaActual, String contrasenaNueva) {
//        for (Usuario current : usuario) {
//            if (current.getContrasena().equals(contrasenaActual)) {
//                current.setContrasena(contrasenaNueva);
//            }
//        }
//    }
//
//    //Autentificarse en el sistema.
//
////    public String autenticar(String nombreUsuario, String contrasenaActual) {
////        String mensajeAutenticacion = " ";
////        for (Usuario current : usuario) {
////            if (current.getNombreUsuario().equals(nombreUsuario) && current.getContrasena().equals(contrasenaActual)) {
////                if (current.isEnLinea()) {
////                    mensajeAutenticacion = "Ya se encuentra autenticado";
////                } else {
////                    current.setEnLinea(true);
////                    mensajeAutenticacion = "Se ha autenticado con éxito";
////                }
////            } else {
////                mensajeAutenticacion = "Proyecto.Usuario o contraseña incorrectos";
////            }
////        }
////        return mensajeAutenticacion;
////    }
//
//    //ver listado de usuarios
//
//    public ArrayList listadoUsuarios() {
//        ArrayList<Usuario> listaARetornar = new ArrayList<>();
//        for (Usuario current : usuario) {
//            current.toString();
//            listaARetornar.add(current);
//        }
//        return listaARetornar;
//    }
//
//    //ver listado de usuarios
//    public List<Usuario> getAllUsers() {
//        return usuario;
//    }
//
//    //exportar a un fichero un listado completo de las informaciones de todos usuarios
////    public void exportarFichero() {
////        String nombreExportar = "C:/Files/escuela/ProyectoFinal fichero/usuario.txt";
////        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreExportar))) {
////            for (Usuario current : usuario) {
////                writer.write(current.toString());
////                writer.newLine();
////            }
////
////            System.out.println("La informacion de los usuarios se ha exportado a " + nombreExportar);
////
////        } catch (IOException e) {
////            System.out.println("Error al exportar la informacion de los usuarios" + e.getMessage());
////        }
////    }
//
//    //imprimir el fichero
//    public String imprimirListado() {
//        String nombreArchivo = "C:/Files/escuela/ProyectoFinal fichero/usuario.txt";
//        String lista = " ";
//
//        try (BufferedReader breader = new BufferedReader(new FileReader(nombreArchivo))) {
//            String linea;
//            while ((lista = breader.readLine()) != null) {
//                // Crear una instancia de Proyecto.Usuario a partir de la línea y luego imprimir
//                System.out.println(lista);
//            }
//        } catch (IOException e) {
//            System.err.println("Error al leer el archivo: " + e.getMessage());
//        }
//        return lista;
//    }
//
//
//    protected static void agregarUsuarioAlGrupo(Map<String, List<Usuario>> grupos, Usuario user) {
//        grupos.computeIfAbsent(user.getGrupoPertenece(), k -> new ArrayList<>()).add(user);
//    }
//
//    protected static void agregarUsuarioAlGrupo(String key, Usuario user) {
//        var u = Main.grupos.get(key);
//        if (u == null) {
//            Main.grupos.put(key, List.of(user));
//
//        } else {
//            u.add(user);
//            Main.grupos.put(key, u);
//        }
//    }
//
//    protected static void agregarUsuarioAlGrupo(List<Usuario> user) {
//        for (var u : user) {
//            var key = u.getGrupoPertenece();
//            var grupo = Main.grupos.get(key);
//            if (grupo != null) {
//                grupo.add(u);
//                Main.grupos.put(key, grupo);
//            } else {
//                List<Usuario> l = new ArrayList<>();
//                l.add(u);
//                Main.grupos.put(key,l);
//            }
//
//        }
//    }
//
//    protected static void imprimirIntegrantesPorGrupo(Map<String, List<Usuario>> grupos, String nombreGrupo) {
//        if (grupos.containsKey(nombreGrupo)) {
//            System.out.println("Integrantes del grupo " + nombreGrupo + ":");
//            for (Usuario usuario : grupos.get(nombreGrupo)) {
//                System.out.println(usuario.getNombreUsuario());
//            }
//            System.out.println();
//        } else {
//            System.out.println("El grupo " + nombreGrupo + " no tiene integrantes.\n");
//        }
//    }


//    public String convertirStringUsuario() {
//        StringBuilder usuarioString = new StringBuilder();
//        for (Proyecto.Usuario current : usuario) {
//            usuarioString.append(current.toString()).append("\n");
//        }
//        return usuarioString.toString();
//    }


//    public void exportarFichero(Proyecto.Usuario usuarios){
//        createTXT("C://AdministracionUsuarios//usuario.txt", usuarios.toString(), false);
//    }
//
//    public  void createTXT(String PATH, String MODE, boolean APPEND){
//        File file;
//        FileWriter fileWriter;
//        try {
//            file = new File(PATH);
//            if (!file.exists()) {// Check if the file already exists
//                file.createNewFile();// Create the file if it doesn't exist
//            }
//            fileWriter = new FileWriter(PATH, APPEND );
//            fileWriter.write(MODE);
//            fileWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public String readTXT(String PATH, String SET, boolean APPEND){
//        File file = new File(PATH);
//        String line = null;
//        Scanner scanner;
//
//        if (!file.exists()){//if file doesn't exist it will auctomactly create a file with predeterminates values
//            createTXT(PATH, SET, APPEND);
//        }else {
//            try {
//                scanner = new Scanner(file);
//                line= scanner.nextLine();
//                System.out.println(line );
//            } catch (FileNotFoundException ex) {
//                throw new RuntimeException(ex);
//            }
//        }
//
//        return line;
//    }



