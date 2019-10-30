import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        JdkProxyExample jdk = new JdkProxyExample();
        HelloWorld proxy=(HelloWorld)jdk.bind(new HelloWorldIml());
        proxy.sayYes("我想说");

/*        HelloWorldIml iml = new HelloWorldIml();
        HelloWorld proxy = (HelloWorld)Proxy.newProxyInstance(iml.getClass().getClassLoader(), iml.getClass().getInterfaces(), new InvocationHandler() {

            //传入的proxy是代理对象
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理前");
                //这里传入的是原来的对象。
                Object object= method.invoke(iml,args);
                System.out.println("代理后");
                return object;
            }
        });
        proxy.sayHello();*/
    }
}
