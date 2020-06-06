
package Download_system;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
/**
 *
 * @author Rafael_Ordonez
 */
public class saveImage {


    public static void saveImage(String imageUrl) throws IOException {
        URL url = new URL("https://39383197.servicio-online.net/"+imageUrl);
        String fileName = url.getFile();
        String destName = "./images" + fileName.substring(fileName.lastIndexOf("/"));
        System.out.println(destName);

        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destName);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }


}