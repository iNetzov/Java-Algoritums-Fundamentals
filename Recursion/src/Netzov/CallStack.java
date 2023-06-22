package Netzov;

public class CallStack {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        System.out.println("openA");
        b();
        System.out.println("closeA");
    }

    private static void b() {
        System.out.println("openB");
        c();
        System.out.println("closeB");
    }

    private static void c() {
        System.out.println("openC");
        d();
        System.out.println("closeC");
    }

    private static void d() {
        System.out.println("openD");
        System.out.println("closeD");
    }


}
