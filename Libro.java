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
 