public class Main {
    public static void main(String[] args) {
        
        
        Libro libro1 = new Libro("Gabriel García Márquez", 5, 2);
        libro1.setTitulo("Cien años de soledad");

        
        LibroVacio libro2 = new LibroVacio();

        
        System.out.println(" Información del Libro 1:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getNumeroEjemplares());
        System.out.println("Prestados: " + libro1.getNumeroEjemplaresPrestados());
        System.out.println();

        System.out.println("Información del Libro Vacío:");
        System.out.println("Título: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getNumeroEjemplares());
        System.out.println("Prestados: " + libro2.getNumeroEjemplaresPrestados());
        System.out.println();

        
        System.out.println(" Intentando prestar un ejemplar de '" + libro1.getTitulo() + "'");
        if (libro1.prestamo()) {
            System.out.println(" Préstamo exitoso. Ahora prestados: " + libro1.getNumeroEjemplaresPrestados());
        } else {
            System.out.println(" No quedan ejemplares disponibles.");
        }

        System.out.println(" Devolviendo un ejemplar...");
        if (libro1.devolucion()) {
            System.out.println(" Devolución exitosa. Ahora prestados: " + libro1.getNumeroEjemplaresPrestados());
        } else {
            System.out.println(" No hay ejemplares prestados para devolver.");
        }
    }
}
