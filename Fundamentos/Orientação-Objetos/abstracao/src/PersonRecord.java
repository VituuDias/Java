//Declaração de atributos é passado por parametros.
//trabalhar com objetos imutaveis
public record PersonRecord(String name, int age) {
    
    //private static String name;
    
    // public String name(){
    //     return " ";
    // }

    public String getInfo(){
        return "Name: " + name + ", age: "  +age;
    }

}
