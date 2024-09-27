package desafioFila;

public class Prioridade {
    private Object[][] fila;
    private int posicaoAtual;

    public Prioridade(int capacidade){
        fila = new Object[capacidade][2];
        posicaoAtual = 0;
    }

    public void enfileirar(String elemento, int prioridade ){
        if (!verificarCheio()){
            fila[posicaoAtual][0] = elemento;
            fila[posicaoAtual][1] = prioridade;
            posicaoAtual++;
        }else {
            System.out.println("Fila cheia");
        }

    }

    public void desinfileirar(){
        if(!verificarVazio()) {
            int posicaoFila = selecionarProximoFila();
            posicaoAtual--;

            System.out.println("O/a "+ fila[posicaoFila][0] + " com a prioridade " + fila[posicaoFila][1]+ " foi atendida.");
            for (int i = posicaoFila; i <= posicaoAtual; i++) {
                fila[i][0] = fila[i + 1][0];
                fila[i][1] = fila[i + 1][1];
            }
        }else {
            System.out.println("Fila vazia");
        }
    }

    public void mostrarFila(){
        System.out.println("{");
        for (int i = 0; i < posicaoAtual; i++) {

        }
    }

    private int selecionarProximoFila(){
        int prioridade =0;
        for (int i = 0; i < posicaoAtual-1; i++) {
            if (prioridade < (Integer)fila[i][1])
                prioridade = (Integer) fila[i][1];
        }
        for (int i = 0; i < posicaoAtual-1; i++) {
            if (prioridade == (Integer)fila[i][1]){
                return i;
            }
        }
        return 0;
    }

    private boolean verificarVazio(){
        return posicaoAtual == 0;
    }

    private boolean verificarCheio(){
        return posicaoAtual == fila.length;
    }
}
