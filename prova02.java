public class prova02 {
    long isbn;
    String autor;
    String nomeLivro;
    int pag;
    String categoria;
    String emprestado;

    public void prova02( long isbn, String autor, String nomeLivro, int pag, String categoria, String emprestado){

        this.isbn = isbn;
        this.autor = autor;
        this.nomeLivro = nomeLivro;
        this.pag = pag;
        this.categoria = categoria;
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "prova02{" +
                "isbn=" + isbn +
                ", autor='" + autor + '\'' +
                ", nomeLivro='" + nomeLivro + '\'' +
                ", pag=" + pag +
                ", categoria='" + categoria + '\'' +
                ", emprestado='" + emprestado + '\'' +
                '}';
    }
}
