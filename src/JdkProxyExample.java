import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {
    private Object target = null;

    //返回一个代理对象
   public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //当代理对象调用方法时，将调用invoke方法。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入了代理方法");
        //使用的是原来的方法,可以对参数进行修改
        Object o = method.invoke(target, args[0]+"我是哈皮");
        System.out.println("代理完后");
        return o;
    }

}
