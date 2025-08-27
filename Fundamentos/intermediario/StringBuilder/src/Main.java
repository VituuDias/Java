public class Main {
    public static void main(String[] args) {
        var builder = new StringBuilder("1234567890");
        builder.setLength(5);
        System.out.println(builder);
        System.out.println(builder.delete(0,3));
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.reverse());
        System.out.println(builder.insert(0,"9"));
        System.out.println(builder.isEmpty());
        System.out.println(builder.lastIndexOf("7"));
        System.out.println(builder.insert(builder.length(),"a"));


        String stringConcat = "";
        for(int i=0; i<200_000; i++){
            stringConcat += i;
        }
        System.out.printf("String: %s\n");

        StringBuilder builderConcat = new StringBuilder();
        for(int i=0; i<200_000; i++){
            builderConcat.append(i);
        }
        System.out.printf("Stringbuilder: (singlethread)  %s\n");

        StringBuffer bufferConcat = new StringBuffer();
        for(int i=0; i<200_000; i++){
            bufferConcat.append(i);
        }
        System.out.printf("StringBuffer (multithread) %s\n");


    }
}