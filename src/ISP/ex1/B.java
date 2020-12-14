package ISP.ex1;

public class B {

    private final I2 i2;

    public B(I2 i2) {
        this.i2 = i2;
    }

    public void callGetDate() {
        i2.getDate();
    }
}
