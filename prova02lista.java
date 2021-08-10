public class prova02lista {
    static No prova02lista[] = new No[2000];
    static int fim = -1;

    public void cadastra(No p){
        //insere no vetor
        if (fim == -1 || fim < (prova02lista.length-1)){
            //vetor vazio
            fim++;
            prova02lista[fim] = p;
        }
    }

    public int busca(String nome){
        for (int i = 0; i <= fim ; i++) {
            if (prova02lista[i].toString().contains(nome)){
                return i;
            }
        }
        return -1;
    }

    public No remove(String n){
        int r = busca(n);
        No aux = prova02lista[r];
        for (int i = r; i < fim ; i++) {
            prova02lista[i] = prova02lista[i+1];
        }
        prova02lista[fim] = null;
        fim--;
        return aux;
    }

    public void imprimeVet(){
        System.out.println("-----IMPRIME LISTA-------");
        for (int i = 0; i <= fim; i++) {
            System.out.println(" Pos: "+i+ " Elemento: "+ prova02lista[i].toString());
        }
    }
}
