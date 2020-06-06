/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.imageio.ImageIO;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author Rafa_Ordonez
 */
public class ServerService {
   
    private static final String SERVER_PATH = "https://39383197.servicio-online.net/";
    private static final String USER_AGENT = "Mozilla/5.0";
        
    public static String sendPost(String php_URL,JSONObject jsonObj){
      
        //Creamos una lista para almacenar el JSON
        List  l = new LinkedList();
        l.addAll(Arrays.asList(jsonObj));
        //Generamos el String JSON
        String jsonString = JSONValue.toJSONString(l);
        System.out.println("JSON GENERADO:");
        System.out.println(jsonString);
        System.out.println("");

        try {
            //Codificar el json a URL
            jsonString = URLEncoder.encode(jsonString, "UTF-8");
            //Generar la URL
            String url = SERVER_PATH+php_URL;
            //Creamos un nuevo objeto URL con la url donde queremos enviar el JSON
            URL obj = new URL(url);
            //Creamos un objeto de conexión
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            //Añadimos la cabecera
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", USER_AGENT);
            con.setRequestProperty("Accept-Language", "es-ES");
            //Creamos los parametros para enviar
            String urlParameters = "json="+jsonString;
            // Enviamos los datos por POST
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();
            //Capturamos la respuesta del servidor
            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + urlParameters);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            //Mostramos la respuesta del servidor por consola
            System.out.println(response);
            //cerramos la conexión
            in.close();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
    }
   
    
}
