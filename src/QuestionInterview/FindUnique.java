package QuestionInterview;

/**
 * Created by m.karandish on 1/28/2019.
 */
public class FindUnique {
    public static void main(String[] args) {
        String[] strInput = new String[]{"Abb","Angelica","Abb","Angelina"};

        System.out.println(findUnique(strInput));
    }
    public static  String findUnique(String[] names){
        String result= "";
        boolean unique ;
        for(int i=0;i<names.length;i++){
            unique=true;
            for(int j=0;j<names.length;j++){
                if(names[i].equalsIgnoreCase(names[j])&& i!=j){
                    unique=false;
                }
            }
            if(unique)return names[i];
        }
        return null;
    }
}
