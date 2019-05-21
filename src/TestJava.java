/**
 * Created by m.karandish on 1/1/2019.
 */
public class TestJava {

    public static void main(String[] args)
    {
        TestInterface tester = () -> System.out.print("Java 8 Test Lambda\n");
        tester.test();
    }
}
