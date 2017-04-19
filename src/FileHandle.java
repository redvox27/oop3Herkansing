import java.io.InputStream;
import java.util.ArrayList;
import org.json.*;
/**
 * Created by Gebruiker on 19-4-2017.
 */

public class FileHandle {

    public static InputStream inputStreamFromFile(String path){

        try{
            InputStream inputStream = FileHandle.class.getResourceAsStream(path);
            return inputStream;
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

}
