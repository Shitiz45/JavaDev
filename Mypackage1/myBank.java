public interface myBank {
    int id = 1;

    void write();

    void method();
}

class sbi implements myBank {
    public void write() {
        System.out.println("This is write of Mybank");
    }

    public void method() {
        System.out.println("This is a method");
    }
}