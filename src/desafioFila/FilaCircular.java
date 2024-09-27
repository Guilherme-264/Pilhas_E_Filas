package desafioFila;

public class FilaCircular {
    private String fila[];
    private int inicio, fim;

    FilaCircular(int capacidade){
        fila = new String[capacidade];
        inicio = fim =  0;
    }

    public void enfileirar(String elemento){
        int posicao = escolherPosicaoEnfileirar();
        if (posicao >= 0) {
            fila[posicao] = elemento;
        }else {
            System.out.println("Fila cheia");
        }
    }

    public void desinfileirar(){
        int posicao =escolherPosicaoDesinfileirar();
        if (posicao>=0) {
            fila[posicao] = null;
        }else {
            System.out.println("Lista vazia");
        }
    }

     public void mostrar(){
         for (int i = 0; i < fila.length; i++) {
             if (fila[i] != null) {
                 System.out.println(fila[i]);
             }
         }
     }

     public void espiar(){
        int posicao = escolherPosicaoDesinfileirar();
         System.out.println(fila[posicao]);
     }

    private int escolherPosicaoEnfileirar(){
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == null){
                return i;
            }
        }
        return -1;
    }
    private int escolherPosicaoDesinfileirar(){
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] != null){
                return i;
            }
        }
        return -1;
    }
}
