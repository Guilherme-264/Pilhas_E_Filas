package pilha;

public class Main {
    public static void main(String[] args) {

       //atividade1
        Pilha p = new Pilha(4);
        for (int i = 1; i < 9; i++) {
            p.empilhar(i);
        }
        p.empilhar(0);
        p.encerrarPrograma();


        //atividade2
//        Palindromo pal =new Palindromo();
//
    //    boolean caso1 =pal.verificarSePalindromo("AABCCBAA");
    //    boolean caso2 =pal.verificarSePalindromo("ADDFDDA");
    //    boolean caso3 =pal.verificarSePalindromo("ABFFBB");
    //    if (caso1) {
    //        System.out.println("O caso AABCCBAA é palindromo");
    //    }else {
    //        System.out.println("O caso AABCCBAA não é palindromo");
    //    }
    //    if (caso2) {
    //        System.out.println("O caso ADDFDDA é palindromo");
    //    }else {
    //        System.out.println("O caso ADDFDDA não é palindromo");
    //    }
    //    if (caso3) {
    //        System.out.println("O caso ABFFBB é palindromo");
    //    }else {
    //        System.out.println("O caso ABFFBB não é palindromo");
    //    }
    //

        //atividade3
    //    ParentesesBalanceados balanceamento = new ParentesesBalanceados();
    //    boolean expressao1 =balanceamento.VerificarSeBalanceado("(5 + (6 * 3))");
    //    boolean expressao2 =balanceamento.VerificarSeBalanceado("((5 + 3) * (2 + 4))");
    //    boolean expressao3 =balanceamento.VerificarSeBalanceado("(5 + 3) * (2 + 4))");
    //
    //    if (expressao1) {
    //        System.out.println("A expressão (5 + (6 * 3)) é balanceada");
    //    }else {
    //        System.out.println("A expressão (5 + (6 * 3)) não é balanceada");
    //    }
    //            if (expressao2) {
    //        System.out.println("A expressão ((5 + 3) * (2 + 4)) é balanceada");
    //    }else {
    //        System.out.println("A expressão ((5 + 3) * (2 + 4)) não é balanceada");
    //    }
    //            if (expressao3) {
    //        System.out.println("A expressão (5 + 3) * (2 + 4)) é balanceada");
    //    }else {
    //        System.out.println("A expressão (5 + 3) * (2 + 4)) não é balanceada");
    //    }
    //
    }
}