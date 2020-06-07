/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;


import org.json.simple.JSONObject;
import static org.junit.Assert.*;

import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Rafa_Ordonez
 */
public class HomeTest {
    metodos m;
    Random r ;
    public HomeTest() {

    }
    
    
    @Before
    public void setUp() {
        m = new metodos();
        r = new Random();
    }
    
    
    @Test
    public void CambiarDatosBiografiaTest() throws ParseException {
        // 1. Consigue datos
        // 2. Modifica
        // 3. Compara
        int i = r.nextInt(100);
        String bioCheck = "JUNIT_TEST_" + i;
        JSONObject obj2 = new JSONObject();
        obj2.put("update", "1");
        obj2.put("username", "JUNIT");
        obj2.put("name", "JUNIT");
        obj2.put("surnames", "JAVA");
        obj2.put("bio", bioCheck);
        m.modificar_datos_usuario(obj2);
        
        JSONObject obj = new JSONObject();
        obj.put("update", "0");
        obj.put("username", "JUNIT");
        String f = m.devolver_datos_usuario(obj);
        JSONParser parser = new JSONParser();
        JSONArray jArray = (JSONArray) parser.parse(f);
      
        assertEquals("CAMBIAR DATOS", bioCheck, jArray.get(2).toString());
       //assertEquals("12", "1");
    }
    
    @Test
    public void CambiarDatosNombreTest() throws ParseException {
        int j = r.nextInt(100);
        
        String nameRnd = "JUNIT_" + j;
        JSONObject obj2 = new JSONObject();
        obj2.put("update", "1");
        obj2.put("username", "JUNIT");
        obj2.put("name", nameRnd);
        obj2.put("surnames", "JAVA");
        obj2.put("bio", "BIOGRAFIA");
        m.modificar_datos_usuario(obj2);
        JSONObject obj = new JSONObject();
        obj.put("update", "0");
        obj.put("username", "JUNIT");
        String f = m.devolver_datos_usuario(obj);
        JSONParser parser = new JSONParser();
        JSONArray jArray = (JSONArray) parser.parse(f);
        assertEquals("CAMBIAR DATOS", nameRnd, jArray.get(0).toString());
    }
    
        
    @Test
    public void CambiarDatosApellidosTest() throws ParseException {
        int j = r.nextInt(100);
        String surnameRnd = "JAVA_" + j;
        JSONObject obj2 = new JSONObject();
        obj2.put("update", "1");
        obj2.put("username", "JUNIT");
        obj2.put("name", "JUNIT");
        obj2.put("surnames", surnameRnd);
        obj2.put("bio", "BIOGRAFIA");
        m.modificar_datos_usuario(obj2);
        JSONObject obj = new JSONObject();
        obj.put("update", "0");
        obj.put("username", "JUNIT");
        String f = m.devolver_datos_usuario(obj);
        JSONParser parser = new JSONParser();
        JSONArray jArray = (JSONArray) parser.parse(f);
        assertEquals("CAMBIAR DATOS", surnameRnd, jArray.get(1).toString());
    }
    
    @Test
    public void DarLikeAumentaLikes() throws ParseException {
        JSONObject obj = new JSONObject();
        obj.put("publicacion", "1337");
        int likesAntes = Integer.parseInt(m.verLikes(obj));
      //  System.out.println("[[[[[[[[[" + likesAntes + "]]]]]]]]");
        JSONObject jsonObj = new JSONObject();
        //Añadimos el id y la puntruacion al JSON
        jsonObj.put("username","JUNIT");
        jsonObj.put("password","hola");
        jsonObj.put("publicacion", "1337");
        m.darLike(jsonObj);
        int likesDespues = Integer.parseInt(m.verLikes(obj));
       // System.out.println("[[[[[[[[[" + likesDespues + "]]]]]]]]");
        assertEquals("DAR LIKE AUMENTA EN FOTO", likesAntes+1, likesDespues);
    }
    /**
     * Test of main method, of class Home.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Home.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
