package pilha;

public class Palindromo {


    public boolean verificarSePalindromo(String str){
        int j = str.length()-1;
            for (int i = 0; i < str.length()/2; i++) {
                if (!(str.charAt(i) == str.charAt(j))){
                    return false;
                }
                j--;
            }
            return true;
    }


}
