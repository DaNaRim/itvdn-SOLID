package ISP.ex1;

public class A {

    private final I1 i1;

    public A(I1 i1) {
        this.i1 = i1;
    }

    public void callGetName() {
        System.out.println(i1.getName());
    }
}
