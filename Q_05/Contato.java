package Q_05;

public class Contato {
    private String nome;
    private String numero;
    private int nLidas;
    private int enviadas;
    //private String mensagens;
    //private String [] mensagens2;
    private String mensagens2[] = new String[500];
    
    //MÉTODO CONSTRUTOR
    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    //MÉTODOS GETs and SETs

    public String [] getMensagens2() {
        return mensagens2;
    }

    public void setMensagens2(String [] mensagens2) {
        this.mensagens2 = mensagens2;
    }

    /*public String getMensagens() {
        return mensagens;
    }

    public void setMensagens(String mensagens) {
        this.mensagens = mensagens;
    }*/

    /* --- nome --- */
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    /* --- numero --- */
    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    /* --- nLidas --- */
    public int getNLidas(){
        return nLidas;
    }

    public void setNLidas(int nLidas){
        this.nLidas = nLidas;
    }

    /* --- enviadas --- */
    public int getEnviadas(){
        return enviadas;
    }

    public void setEnviadas(int enviadas){
        this.enviadas = enviadas;
    }

    //Métodos personalizados
    public void enviarMensagem(String mensagem){
        System.out.println("Mensagem enviada para " + getNome() + ". \n");
        this.enviadas += 1;
    }

    public void mensagensNLidas(){
        System.out.println(getNLidas() + " Mensagens não lidas. \n");
    }

    /*public void ReceberMensagens(String mensagem){
        this.nLidas += 1;
        this.setMensagens(mensagem);
    }


    public void mostMens(){
        System.out.println(getMensagens());
    }*/

    
    public void ReceberMensagens2(String mensagem){
        this.mensagens2[this.nLidas] = mensagem;
        this.nLidas += 1;
    }

    public void mostMens2(){
        for (int i = 0; i < getNLidas(); i++) {
            System.out.println(this.mensagens2[i]);
            this.mensagens2[i] = null;
        }
        this.setNLidas(0);
    }
    
}
