public class HelloWorldIml implements HelloWorld{
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }

    @Override
    public void sayYes(String s) {
        System.out.println(s+"Yes");
    }
}
