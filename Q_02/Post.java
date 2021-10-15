package Q_02;

public class Post {
    
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    //MÉTODO CONSTRUTOR
    public Post(String texto, String link){
        this.texto = texto;
        this.link = link;
    }

    //MÉTODOS GETs and SETs

    /* --- texto --- */
    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    /* --- link --- */
    public String getLink(){
        return link;
    }

    public void setLink(String link){
        this.link = link;
    }

    /* --- numeroCurtidas --- */
    public int getNumeroCurtidas(){
        return numeroCurtidas;
    }

    public void setNumeroCurtidas(int numeroCurtidas){
        this.numeroCurtidas = numeroCurtidas;
    }

    /* --- numeroCompartilhamentos --- */
    public int getNumeroCompartilhamentos(){
        return numeroCompartilhamentos;
    }

    public void setNumeroCompartilhamentos(int numeroCompartilhamentos){
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }

    //MÉTODOS PERSONALIZADOS
    public void curtir(){
        this.numeroCurtidas += 1;
    }

    public void compartilhar(){
        this.numeroCompartilhamentos += 1;
    }

}
