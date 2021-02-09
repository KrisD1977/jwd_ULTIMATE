package pl.derela.wszib.spotkanie4.powtorka.enums;

public class EnumTypes {
    public static void main(String[] args) {
        System.out.println(Types.values());
        System.out.println(Types.ONE);
        System.out.println(Types.valueOf("TWO"));
        System.out.println(Types.THREE.name());
        System.out.println(Types.values().length);

        Types[] types = new Types[Types.values().length];

        for (Types type : Types.values()) {

            System.out.println(type.ordinal() + " - " + type);
            types[i] = type;
            i++;
            System.out.println(i);
        }
        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i]);

        }


    }
    static int i = 0;
}
