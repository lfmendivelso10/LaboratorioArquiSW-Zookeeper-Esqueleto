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
    public static final String HOST_ADDRESS = "10.20.30.50";
    public static final int PORT = 8080;
    public static final String ID = "200921691";
    
    
    public static Response registerService(String serviceName, String relativePath)
    {
        try 
        {
            
                
            JSONObject datos = new JSONObject();
            datos.put("name",serviceName);
            datos.put("id",ID);
            datos.put("address",HOST_ADDRESS);
            datos.put("port",PORT);
            datos.put("registrationTimeUTC",System.currentTimeMillis());
            datos.put("serviceType","STATIC");
           
 
 
 
 
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
