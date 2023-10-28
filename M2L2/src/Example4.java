public class Example4 {
    int member;
    public void setMember(int member) {
        this.member = member;
    }
    public Example4 increment() {
        member++;
        return this;
    }
    void print() {
        System.out.println("member: " + member);
    }

    public static void main(String[] args) {
        Example4 object = new Example4();
        object.setMember(15);
        object.increment().increment().print();
    }
}
