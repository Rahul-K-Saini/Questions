package Others;

public class FinalizeExm {
    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            FinalizeExm obj = new FinalizeExm();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
