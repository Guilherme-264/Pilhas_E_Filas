package desafioPilhas;

public class Acoes {
    private String feitas[];
    private String desfeitas[];
    private int toatalAcoesFeitas;
    private int toatalAcoesDesfeitas;

    public Acoes(int capacidade){
        feitas = new String[capacidade];
        desfeitas = new String[capacidade];
        toatalAcoesFeitas = 0;
        toatalAcoesDesfeitas = 0;

    }

    public void empilhar(String acao){
        feitas[toatalAcoesFeitas] = acao;
        toatalAcoesFeitas++;
    }

    public void desfazer(){
        toatalAcoesFeitas--;
        desfeitas[toatalAcoesDesfeitas]= feitas[toatalAcoesFeitas];
        toatalAcoesDesfeitas++;
    }

    public void refazer(){
        toatalAcoesDesfeitas--;
        feitas[toatalAcoesFeitas] = desfeitas[toatalAcoesDesfeitas];
        toatalAcoesFeitas++;
    }

    public void mostrarFeitas(){
        System.out.print("Ações feitas: {");
        for (int i = 0; i < toatalAcoesFeitas-1; i++) {
            System.out.print(feitas[i]+ ", ");
        }
        System.out.println(feitas[toatalAcoesFeitas-1]+ "}");
    }

    public void mostrarDesfeitas(){
        System.out.print("Ações desfeitas: {");
        for (int i = 0; i < toatalAcoesDesfeitas-1; i++) {
            System.out.print(desfeitas[i]+ ", ");
        }
        System.out.println(desfeitas[toatalAcoesDesfeitas-1]+ "}");
    }
}
