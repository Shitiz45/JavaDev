public abstract class Bank {
    String Name;
    int account;

    abstract void readData();

    abstract void writeData();
}

class admin extends Bank {

    void readData() {
        System.out.println("Read");
    }

    void writeData() {
        System.out.println("Write");
    }

}