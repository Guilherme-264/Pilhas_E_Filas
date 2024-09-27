package fila;


public class Atendimento {
    private int tempoTotal, clientesAtendidos;

    public Atendimento(){
        tempoTotal = 0;
        clientesAtendidos = 0;
    }

    public void FilaDeClientes(Object [][] fila) {
        String cliente;
        int tempoAtendimento;
        
        for (int i = 0; i < fila.length  ; i++) {
            cliente = fila[0][0].toString();
            tempoAtendimento = (Integer)(fila[0][1]);
            atendimento(cliente, tempoAtendimento);

            desinfileirar(fila);

        }
        System.out.println(clientesAtendidos +" clientes foram atendidos, em " + tempoTotal +" minutos");
    }
    private void atendimento(String cliente, int tempoGasto){
        tempoTotal += tempoGasto;
        clientesAtendidos ++;
        System.out.println("O cliente "+ cliente +" foi atendido em "+ tempoGasto +" minutos");
    }

    private static void desinfileirar(Object[][]fila){
        for (int i = 0; i < fila.length-1; i++) {
            fila[i][0] = fila[i +1][0];
            fila[i][1] = fila[i +1][1];
        }
    }

}
