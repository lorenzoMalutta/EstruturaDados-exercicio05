public class prova02main {
    static public void main(String args[]){
        prova02lista l = new prova02lista();
        prova02 p = new prova02();
        prova02 p2 = new prova02();
        p.prova02(11324, "roberto", "Brascubas", 500, "Romance", "emprestado");
        p2.prova02(12314, "Machado de ASSIS", "O rei da vela", 400, "Romance", "emprestado");

        l.cadastra(new No(p));
        l.cadastra(new No(p2));

        l.busca("Brascubas");
        l.busca("O rei da vela");

        l.imprimeVet();

        l.remove("Brascubas");

        l.imprimeVet();
    }
}
