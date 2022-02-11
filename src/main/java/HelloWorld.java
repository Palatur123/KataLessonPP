public class HelloWorld {

    private String message;

    public boolean getMessage() {
        return true;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static void main(String[] args) {
        for (String ignored : args) {
            HelloWorld pojo = new HelloWorld();
            System.out.println(pojo);
        }
    }
    public HelloWorld() {

    }

    public String toString() {
        return this.message; }
}
