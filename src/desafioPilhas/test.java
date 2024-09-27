package desafioPilhas;

public class test {
    public static void main(String[] args) {
       // atividade1
        Acoes acao = new Acoes(5);
        acao.empilhar("Ação1");
        acao.empilhar("Ação2");
        acao.empilhar("Ação3");
        acao.mostrarFeitas();
        System.out.println("ctr+z, ctr+z");

        acao.desfazer();
        acao.desfazer();
        acao.mostrarFeitas();
        acao.mostrarDesfeitas();

        System.out.println("ctr+y");
        acao.refazer();

        acao.mostrarFeitas();
        acao.mostrarDesfeitas();

        //não consegui fazer a atividade torre de hanói
    }
}
