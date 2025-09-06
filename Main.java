public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("cien años de soledad");
        libro1.setAutor("Gabriel Garcia Marquez");
        libro1.setejemplares(3);
        libro1.setNumeroEjemplaresPrestados(0);

        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Número de ejemplares: " + libro1.getNumeroEjemplares());
        System.out.println("Número de ejemplares prestados: " + libro1.getNumeroEjemplaresPrestados());
        
        Libro libro2 = new Libro();
        libro1.setTitulo("");
        libro1.setAutor("");
        libro1.setejemplares(3);
        libro1.setNumeroEjemplaresPrestados(0);

        System.out.println("Ingrese los datos del libro 2:");
        System.out.println("titulo:" + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("ejemplares: " + libro2.getNumeroEjemplares());
        System.out.println("ejemplares prestados: " + libro2.getNumeroEjemplaresPrestados());
    
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para préstamo.");
        }

        if (libro1.devolucion()) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }

        System.out.println("Número de ejemplares prestados después de las operaciones: " + libro1.getNumeroEjemplaresPrestados());
    }
}

