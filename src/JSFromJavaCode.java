import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by m.karandish on 1/7/2019.
 */
public class JSFromJavaCode {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        String script = " var welcome = 'Hello';" +
                "welcome +=  ', Maryam';" +
                "welcome;";
        Object result = null;

        try {
            //Execute the script
            result = engine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.println("There was a JavaScript Error");
            e.printStackTrace();
        }

    }
}
