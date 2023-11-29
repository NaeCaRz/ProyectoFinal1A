//package Principal;
//
//import java.util.*;
//import static Principal.Principal.usuario;
//import static java.util.Arrays.asList;
//
//public class Main {
//    static Map<String, List<Usuario>> grupos = new HashMap<>();
//
//    public static void main(String[] args) {
//        new Main();
//    }
//
//    public Main() {
//
//        Usuario usuario1 = new UsuarioAvanzado("Eismer", "eismer", "alicate", "Avanzado");
//        Usuario usuario4 = new UsuarioAvanzado("Eismer", "eismer2", "alicate", "Avanzado");
//        Usuario usuario2 = new Administrador("Nayelhis", "Nae", "lorem", "Proyecto.Administrador");
//        Usuario usuario3 = new Usuario("Anacleto", "Ana", "Sapotero", "Proyecto.Usuario");
//      usuario.addAll(asList(usuario1, usuario2, usuario3, usuario4));
//      Principal principal = new Principal(usuario);

//        sistema.exportarFichero();
//        sistema.imprimirListado();
//
//        // Agregar usuarios al mapa
//        //Proyecto.Sistema.agregarUsuarioAlGrupo("Avanzado", usuario1);
//        Sistema.agregarUsuarioAlGrupo(user);
//
//        Sistema.agregarUsuarioAlGrupo("SupremeOverlor", new Usuario("andery", "adrewdev", "qweqwe", "SupremeOverlor"));
//
//        // Imprimir integrantes de cada grupo
//        Sistema.imprimirIntegrantesPorGrupo(grupos, "Avanzado");
//        Sistema.imprimirIntegrantesPorGrupo(grupos, "Proyecto.Administrador");
//        Sistema.imprimirIntegrantesPorGrupo(grupos, "Proyecto.Usuario");
//        Sistema.imprimirIntegrantesPorGrupo(grupos, "SupremeOverlor");
