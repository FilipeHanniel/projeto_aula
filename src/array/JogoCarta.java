package array;

public class JogoCarta {
    public static void main(String[] args) {
        String[] nipes = {"Ouros", "Copas", "Espadas", "Paus"};
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        // as linhas abaixo recuperam de forma aleatória o conteúdo dos arrays
        String[] nipe = nipes[(int) Math.random() * 4];
        String[] face = faces[(int) Math.random() * faces.length];
    }
    
}
