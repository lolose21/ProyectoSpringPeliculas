package models;

public class Peliculas {

    private int idpelicula;
    private int iddistribuidor;
    private int idgenero;
    private String titulo;
    private int idnacionalidad;
    private String argumento;
    private String fecha_estreno;
    private String actores;
    private int director;
    private int precio;

    public Peliculas() {
    }

    public Peliculas(int idpelicula, int iddistribuidor, int idgenero,
            String titulo, int idnacionalidad, String argumento, String fecha_estreno,
            String actores, int director, int precio) {

        this.idpelicula = idpelicula;
        this.iddistribuidor = iddistribuidor;
        this.idgenero = idgenero;
        this.titulo = titulo;
        this.idnacionalidad = idnacionalidad;
        this.argumento = argumento;
        this.fecha_estreno = fecha_estreno;
        this.actores = actores;
        this.director = director;
        this.precio = precio;
    }

    public Peliculas(int idpelicula, int iddistribuidor, int idgenero,
            String titulo, int idnacionalidad,
            String actores) {

        this.idpelicula = idpelicula;
        this.iddistribuidor = iddistribuidor;
        this.idgenero = idgenero;
        this.titulo = titulo;
        this.idnacionalidad = idnacionalidad;
        this.actores = actores;
    }

    public int getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(int idpelicula) {
        this.idpelicula = idpelicula;
    }

    public int getIddistribuidor() {
        return iddistribuidor;
    }

    public void setIddistribuidor(int iddistribuidor) {
        this.iddistribuidor = iddistribuidor;
    }

    public int getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(int idgenero) {
        this.idgenero = idgenero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdnacionalidad() {
        return idnacionalidad;
    }

    public void setIdnacionalidad(int idnacionalidad) {
        this.idnacionalidad = idnacionalidad;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
