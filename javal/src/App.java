import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;

import com.ServiceIml; 
public class App implements ServiceIml {
    private String value;
    public App(){
        value="Java";
    }
    public void publicMethod(String s) {
        System.out.println("I love"+s);
    }
    private void privateMethod() {
        System.out.println("I love"+value);
        
    }
    @Override
    public void send(String meeage) {
       System.out.println("Send"+meeage);
        
    }
    public static boolean checkStrs(String[] strs) {
        boolean flag=false;
        if (strs!=null) {
            for (String s : strs) {
                if(s.length()!=0&&s!=null){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
    public static String replaceSpace(String[] strs) {
        if(!checkStrs(strs)){
            return "";
        }
        int len=strs.length;
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        int m=strs[0].length();
        int n = strs[len-1].length();
        int num=Math.min(m, n);
        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i)==strs[len-1].charAt(i)) {
                sb.append(strs[0].charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        // String s1="java";
        // String s2=s1.intern();
        // String s3=new String("java");
        // String s4=s3.intern();
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1==s4);
        // System.out.println(s2==s3);
        // System.out.println(s2==s4);
        // System.out.println(s3==s4);
        // Class<?> targrtClass=Class.forName("JAVAL.src.App");
        // App targetObject=(App)targrtClass.newInstance();
        // Method[] methods=targrtClass.getDeclaredMethods();
        // for (Method m : methods) {
        //     System.out.println(m.getName());
        // }
        // Method publicMethod=targrtClass.getDeclaredMethod("publicMethod", String.class);
        // publicMethod.invoke(targetObject, "Java");
        // Field field=targrtClass.getDeclaredField("value");
        // field.setAccessible(true);
        // field.set(targetObject, "Java");

    }
}
