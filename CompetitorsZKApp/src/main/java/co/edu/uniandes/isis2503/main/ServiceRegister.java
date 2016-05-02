/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.isis2503.main;

import static co.edu.uniandes.isis2503.main.Main.SERVIDOR_ZK;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author Felipe
 */
public class ServiceRegister
{
    public static final String HOST = "10.20.30.50";
    public static final int PORT = 8080;
  //  public static String id = ""
    
    
    public static Response registerService(String serviceName, String relativePath)
    {
        try 
        {
            
            
            {
       "name": "test3",
       "id": "ca2fff8e-d756-480c-b59e-8297ff88624c22",
       "address": "10.20.30.50",
       "port": 1234,
       "registrationTimeUTC": 1325129459728,
       "serviceType": "STATIC"
    }
            
            JSONObject datos = new JSONObject();
            datos.put("name",serviceName;
            datos.put("urlPagina","localHost:8081");
            JSONObject datos2 = new JSONObject();
            datos2.put("nombrePagina","Competitors");
            datos2.put("nuevoEstado","Activo");
            JSONObject datos3 = new JSONObject();
            datos3.put("nombrePagina","Competitors");
            datos3.put("nombreServicio","Competidores");
            datos3.put("rutaServicio","competitors");
 
 
 
 
            Client client = Client.create();
            WebResource target = client.resource(SERVIDOR_ZK + "pagina");
            target.post(JSONObject.class,datos);
            target = client.resource(SERVIDOR_ZK+ "estadoPagina");
            target.post(JSONObject.class,datos2);
            target = client.resource(SERVIDOR_ZK+ "servicioPagina");
            target.post(JSONObject.class,datos3);
 
 
 
            client.destroy();
 
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
}
