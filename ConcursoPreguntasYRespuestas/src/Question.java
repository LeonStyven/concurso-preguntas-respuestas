public class Question {
    private String tema;
    private int categoria;
    private String respuesta;

    //Getters
    public String getTema() {
        return tema;
    }

    public int getCategoria() {
        return categoria;
    }

    public String getRespuesta() {
        return respuesta;
    }

    //Constructor
    public Question(String tema, int categoria, String respuesta) {
        this.tema = tema;
        this.categoria = categoria;
        this.respuesta = respuesta;
    }
}
