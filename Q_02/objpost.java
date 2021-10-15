package Q_02;

public class objpost {
    public static void main(String[] args) {
        Post post = new Post("Pensamento duplo indica a capacidade de ter na mente, ao mesmo tempo, duas opiniões contraditórias e aceitar ambas.", "https://www.crunchyroll.com/pt-br?utm_source=paid_cr&utm_medium=google-search&utm_campaign=xbox_gamepass2021&utm_term=crunchyroll&referrer=paid_cr_google-search_xbox_gamepass2021&gclid=Cj0KCQjw5JSLBhCxARIsAHgO2SeEnLUK0spY8Iq1b-q2zC-zf9GLF_rHUADyfqzQyVq7UFMUMkTmPhYaAgRdEALw_wcB");

        post.curtir();
        post.curtir();
        post.curtir();
        System.out.println("Número de curtidas: " + post.getNumeroCurtidas());

        post.compartilhar();
        post.compartilhar();
        System.out.println("Número de compartilhamentos: " + post.getNumeroCompartilhamentos());
    }
}
