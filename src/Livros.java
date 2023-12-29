public class Livros implements Publicacao {
    private String titulo;
    private String autor;
    private int pagatual;
    private int totpag;
    private boolean aberto ;
    private Pessoa leitor;

    // Metodo especial


    public String Detalhes() {
        return
                "Titulo do livro = " + titulo +
                "\n autor = " + autor +
                "\n Pagina atual = " + pagatual +
                "\n Total de paginas = " + totpag +
                "\n aberto = " + aberto +
                "\n leitor = " + leitor.getNome() +
                "\n Idade = " + leitor.getIdade() +
                "\n Genero = " + leitor.getSexo();

    }


    // Metodo Constutor


    public Livros(String titulo, String autor,  int totpag, Pessoa leitor) {

        this.titulo = titulo;
        this.autor = autor;
        this.pagatual = 0;
        this.totpag = totpag;
        this.aberto = false;
        this.leitor = leitor;
    }

    // Getters e Setters


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
        this.autor = autor;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int p) {

        if ( p> this.totpag){
            p = 0;
        } else {
            this.pagatual = p;

        }


    }

    @Override
    public void nextpag(int a) {
        if (a>totpag){
            a = 0;
        }else {
            this.pagatual = a ;
        }


    }

    @Override
    public void backpag(int b ) {
        this.pagatual = Math.max(0, this.pagatual - b);

    }
}



