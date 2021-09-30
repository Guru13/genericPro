package egyptMulti;

public class Main {
    public static void main(String[] args) {
        EgyptMulty em = new EgyptMulty();
        System.out.println("odd----" + em.odd(11));
        System.out.println("odd----" + em.odd(10));
        System.out.println("odd----" + em.odd(0));

        System.out.println("half----" + em.half(11));
        System.out.println("half----" + em.half(10));

        System.out.println("multy----" + em.multiply1(11, 10));
//        System.out.println("multy----" + em.multiply1(5, 20));
    }
}
