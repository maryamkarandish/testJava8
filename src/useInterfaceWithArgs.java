/**
 * Created by m.karandish on 1/1/2019.
 */
public class useInterfaceWithArgs {
    public static void main (String[] args){
        TestArgumetInterface testInt = (value1,value2) ->
        {
            System.out.print("lambda with argument");
            int result = value1+value2;
            System.out.print("the result is : " + result);
        };

        testInt.calculate(2,3);
    }

}
