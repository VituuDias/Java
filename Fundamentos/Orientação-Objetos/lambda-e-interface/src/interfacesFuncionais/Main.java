package interfacesFuncionais;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Mari", 21), new User("Vitor", 31),
                new User("Matheus", 11), new User("Max", 14));

        // users.forEach(user -> System.out.println(user));
        // users.forEach(System.out::println);

        // interface Funcional base do lambda
        printStringValues(Record::toString, users);
        printStringValues(User::name, users);
        printStringValues(user -> String.valueOf(user.age()), users);
    }

    private static void printStringValues(Function<User, String> Callback, List<User> users) {
        users.forEach(u -> System.out.println(Callback.apply(u)));
    }
}
