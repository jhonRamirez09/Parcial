public class Libro {

    private String titulo;
    private String autor;
    private int NumeroEjemplares;
    private int NumeroEjemplaresPrestados;


    public Libro() {
         
    }

    public Libro(String autor,int  NumeroEjemplares,int  NumeroEjemplaresPrestados){
        this.autor = autor;
        this.NumeroEjemplares = NumeroEjemplares;
        this.NumeroEjemplaresPrestados = NumeroEjemplaresPrestados;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getNumeroEjemplares() {
        return NumeroEjemplares;
    }

    public void setejemplares(int NumeroEjemplares) {
        this.NumeroEjemplares = NumeroEjemplares;
    }
    
    public int getNumeroEjemplaresPrestados() {
        return NumeroEjemplaresPrestados;
    }
    public void setNumeroEjemplaresPrestados(int NumeroEjemplaresPrestados) {
        this.NumeroEjemplaresPrestados = NumeroEjemplaresPrestados;
    }

    boolean prestamo(){
        if (NumeroEjemplares > NumeroEjemplaresPrestados) {
            NumeroEjemplaresPrestados = NumeroEjemplaresPrestados + 1;
            return true;
        } else {
            return false;
        }
    }
    boolean devolucion(){
        if (NumeroEjemplaresPrestados > 0) {
            NumeroEjemplaresPrestados = NumeroEjemplaresPrestados - 1;
            return true;
        } else {
            return false;
        }
    }
}
