package Q_03;

public class objaviao {
    public static void main(String[] args) {
        //Instanciar um objeto Avião com altitude inicial 10 Km e velocidade 900 Km/h
        Aviao aviao = new Aviao(10, 900);

        //Mostrar na tela a altitude e velocidade atual do avião
        aviao.mostAltVel();

        //Reduzir a altitude do avião em 1Km
        aviao.dimAltitude(1);

        //Reduzir a velocidade do avião em 100 Km/h
        aviao.dimVelocidade(100);

        //Mostrar na tela a altitude e velocidade atual do avião
        aviao.mostAltVel();

    }
}
