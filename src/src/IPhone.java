public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String paginaAtual;

    @Override
    public void tocar() {
        if (musicaAtual != null && !musicaAtual.isEmpty()) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada telefônica.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        if (paginaAtual != null && !paginaAtual.isEmpty()) {
            System.out.println("Atualizando a página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIPhone.selecionarMusica("Stairway to Heaven - Led Zeppelin");
        meuIPhone.tocar();
        meuIPhone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}