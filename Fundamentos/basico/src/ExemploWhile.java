public class ExemploWhile {
    public static void main(String[] args) {
        int i = 11;
        while (i < 10){
            System.out.println("Numero: " + i);
            //não vai rodar por verificar que o i vale mais que 10 antes do bloco
            i++;
        }

        do{
            //vai rodar ao menos uma vez antes de verificar que o i é maior que 10.
            System.out.println("Numero2: " + i);

        }while (i < 10);
    
    }



}
