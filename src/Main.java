import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Gebruiker on 19-4-2017.
 */
public class Main {

    public static void main(String[] args) throws JSONException {
        JSONObject obj = JsonUtil.getJSONObjectFromFile("/books.json");
        JSONArray array = obj.getJSONArray("books");

        JSONObject jsonObject = (JSONObject) obj;

        for (int i = 0; i < array.length();i++){
            JSONObject object = (JSONObject) array.get(i);
            String title = (String) object.get("title");
            System.out.println(title);
        }

    }
}
