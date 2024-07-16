public class Employee {
    private int eid = 1;
    private int sal = 20000;
    private int inc = 200;

    void calcsal() {
        System.out.println(sal + inc);
    }

    int getEid() {
        return eid;
    }

    int getSal() {
        return sal;
    }

    int getInc() {
        return inc;
    }
}
