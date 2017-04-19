import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class JsonUtil {

    public static String getJSONStringFromFile(String path){
        Scanner scanner;
        InputStream inputStream = FileHandle.inputStreamFromFile(path);
        scanner = new Scanner(inputStream);
        String json = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return json;
    }

    public static JSONObject getJSONObjectFromFile(String path) throws JSONException {
        return new JSONObject(getJSONStringFromFile(path));
    }

    public static boolean objectExiste(JSONObject jsonObject, String key){
        Object o;

        try{
            o = jsonObject.get(key);
        }
        catch(Exception e){
            return false;
        }
        return o != null;
    }

}
