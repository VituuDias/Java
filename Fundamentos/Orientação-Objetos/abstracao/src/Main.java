
public class Main {
    public static void main(String[] args){

        //Classes

        var male = new Person("Vitor");
        male.incAge();
        var female = new Person("Mariana");
        female.incAge();

        System.out.println("male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
        
        
        //Record
        var recordPerson = new PersonRecord("Vitor", 10);
        System.out.println(recordPerson);

        //gera um metodo getter apartir do parametro usado
        System.out.println(recordPerson.name());
        
        System.out.println(recordPerson.getInfo());

        //var newRecordPerson = new PersonRecord(recordPerson.name(), 13);
        

    }
}
