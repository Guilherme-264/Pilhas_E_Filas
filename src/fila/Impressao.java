package fila;

public class Impressao {
    private Object[][] fila;
    private int tamanhoLista;
    private int impressoes;
    private Object maiorNumeroDePaginas[];


     public Impressao(int capacidade){
         fila = new Object[capacidade][2];
         tamanhoLista = 0;
         impressoes = 0;
         maiorNumeroDePaginas = new Object[]{0, 0};
     }

    public void enfileirar(String nomeDocumento, int numeroPaginas){
        if (!verificarSeCheio()) {
            fila[tamanhoLista][0] = nomeDocumento;
            fila[tamanhoLista][1] = numeroPaginas;
            tamanhoLista++;
        }else {
            System.out.println("A fila de impressão está cheia");
        }
    }


    public void imprimir() {

         if (!verificarSeVazio()) {
             Object documentoImpresso = fila[0][0];
             int numeroPaginas = (Integer) fila[0][1];
             for (int i = 0; i < fila.length-1; i++) {
                 fila[i][0] = fila[i + 1][0];
                 fila[i][1] = fila[i + 1][1];
             }
             System.out.println("O documento "+ documentoImpresso+ " de "+ numeroPaginas+ " páginas foi impresso");
             impressoes++;
             tamanhoLista--;


             if(impressoes !=0 && impressoes%2 ==0){
                 System.out.println("Proóximo documento: "+ fila[0][0]+ ", número de páginas: "+ fila[0][1]);
             };

             if (numeroPaginas > (Integer)maiorNumeroDePaginas[1]){
                 maiorNumeroDePaginas[0] = documentoImpresso;
                 maiorNumeroDePaginas[1] = numeroPaginas;
             }

         } else {
             System.out.println("A fila de impressão está vazia");

             if ((Integer)maiorNumeroDePaginas[1] > 0){
                 System.out.println("O documento impresso com mais paginas foi "+ maiorNumeroDePaginas[0] + " com " + maiorNumeroDePaginas[1]+ " paginas");
             }
         }
    }

    private boolean verificarSeCheio(){
         return tamanhoLista == fila.length;
    }

    private boolean verificarSeVazio(){
        return tamanhoLista <= 0;
    }

}
