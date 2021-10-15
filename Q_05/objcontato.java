package Q_05;

public class objcontato {
    public static void main(String[] args) {
        Contato contato = new Contato("Joedson", "75 99700 - 9392");    

        contato.enviarMensagem("Yo, my brother");
        contato.mensagensNLidas();
        contato.ReceberMensagens2("Eae, cara.");
        contato.ReceberMensagens2("Tudo tranquilo?");
        contato.ReceberMensagens2("Poderia me tirar uma dúvida?");
        contato.ReceberMensagens2("É em relação a atividade de LP1");
        contato.ReceberMensagens2("Quando tiver tempo, me avise! Flw! \n");
        contato.mensagensNLidas();
        contato.mostMens2();
        contato.mensagensNLidas();
        
    }
}
