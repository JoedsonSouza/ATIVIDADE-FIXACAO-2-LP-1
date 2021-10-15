package Q_03;

public class Aviao {
    private int altitude;
    private int velocidade;

    //MÉTODO CONSTRUTOR
    public Aviao(int altitude, int velocidade){
        this.altitude = altitude;
        this.velocidade = velocidade;
    }

    //MÉTODOS GETs and SETs

    /* --- altitude --- */
    public int getAltitude(){
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    /* --- velocidade --- */
    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    //MÉTODOS PERSONALIZADOS
    public void aumAltitude(int aumAlt){
        this.altitude += aumAlt;
    }

    public void dimAltitude(int dimAlt){
        this.altitude -= dimAlt;
    }

    public void aumVelocidade(int aumVel){
        this.velocidade += aumVel;
    }

    public void dimVelocidade(int dimVel){
        this.velocidade -= dimVel;
    }

    public void mostAltVel(){
        System.out.println("Altitude do Avião: " + getAltitude() + " Km");
        System.out.println("Velocidade do Avião: " + getVelocidade() + " Km/h \n");
    }

}
