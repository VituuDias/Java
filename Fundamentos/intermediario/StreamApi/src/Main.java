import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vitor Gabriel");
        list.add("Vitor Fernandes");
        list.add("Vitor Paulo");
        list.add("Gabriel");
        list.add("Mariana");
        list.add("Dias");
        list.add("LUgar");

        list.stream().filter(nome -> nome.startsWith("Fernanda")).toList();
    }
}