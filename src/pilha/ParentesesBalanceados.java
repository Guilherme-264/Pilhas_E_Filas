package pilha;

public class ParentesesBalanceados {

    public boolean VerificarSeBalanceado(String x){
        int aberto = 0;
        int fechado = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '('){
                aberto++;
            }
            if (x.charAt(i) == ')'){
                fechado++;
            }
        }
        return aberto == fechado;
    }
}
