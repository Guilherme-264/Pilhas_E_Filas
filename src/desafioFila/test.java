package desafioFila;

public class test {
    public static void main(String[] args) {

        //atividade1
        FilaCircular circulo = new FilaCircular(5);
        for (int i = 1; i < 6; i++) {
            circulo.enfileirar("posição "+ i);
        }
        circulo.mostrar();

        System.out.println("depois de desinfileirar");
        System.out.println();
        circulo.desinfileirar();
        circulo.desinfileirar();
        circulo.enfileirar("elemento 6");

        circulo.mostrar();

        circulo.espiar();


        //atividade2
//        Prioridade prioridade = new Prioridade(6);
//
//        prioridade.enfileirar("Matheus", 1);
//        prioridade.enfileirar("Valkiria", 2);
//        prioridade.enfileirar("Juvenal", 3);
//        prioridade.enfileirar("Herlindo", 3);
//        prioridade.enfileirar("Wanderssom", 1);
//
//        prioridade.desinfileirar();
//        prioridade.desinfileirar();
//        prioridade.desinfileirar();
//        prioridade.desinfileirar();
//        prioridade.desinfileirar();

    }
}
