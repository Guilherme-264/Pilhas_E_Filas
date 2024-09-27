package pilha;

public class Pilha {
    private int[] impar;
    private int[] par;
    private int tamanhoImpar;
    private int tamanhoPar;

    public Pilha(int capacidade){
        this.impar = new int[capacidade];
        tamanhoImpar = 0;

        this.par = new int[capacidade];
        tamanhoPar = 0;
    }

    public boolean verificarVazioImpar(){
        return tamanhoImpar == 0;
    }
    public boolean verificarVazioPar(){
        return tamanhoPar == 0;
    }

    public boolean verificarCheioImpar(){
        return tamanhoImpar == impar.length;
    }
    public boolean verificarCheioPar(){
        return tamanhoPar == par.length;
    }

    public void empilhar(int x){
            if (x == 0){
                desempilhar();
                return;
            }else if (x % 2 == 0){
                if (!verificarCheioPar()) {
                    par[tamanhoPar] = x;
                    tamanhoPar++;
                    return;
                }
            }else {
                if (!verificarCheioImpar()) {
                    impar[tamanhoImpar] = x;
                    tamanhoImpar++;
                    return;
                }
            }
            System.out.println("Vetor cheio");


    }
    public void desempilhar(){
        if (!verificarVazioImpar() && !verificarVazioPar()) {
            tamanhoPar--;
            tamanhoImpar--;
            int valorImpar = impar[tamanhoImpar];
            int valorPar = par[tamanhoPar];
            System.out.println("O valor impar removido foi "+ valorImpar);
            System.out.println("O valor par removido foi "+ valorPar);
        }else {
            System.out.println("Uma das listas está vazia");
        }
    }

    public void encerrarPrograma(){
        System.out.print("Valores Impares: {");
        for (int i = 0; i < tamanhoImpar-1; i++) {
            System.out.print(impar[i]+ ", ");
        }
        System.out.println(impar[tamanhoImpar-1] + "}");

        System.out.print("Valores Pares: {");
        for (int i = 0; i < tamanhoPar-1; i++) {
            System.out.print(par[i]+ ", ");
        }
        System.out.println(par[tamanhoPar-1] + "}");
    }
}
