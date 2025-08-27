import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var value = """
                {"name:"Vitor","age:"23"}
                """;
        Map<String, String> map = new HashMap<>();

        value = value.replace("{", "").replace("}", "").replace("\"","");
        var valueArr = value.split(",");
        for(var v: valueArr){
            var keyValue = v.split(":");
            map.put(keyValue[0], keyValue[1]);
        }

        System.out.println(map);

    }
}