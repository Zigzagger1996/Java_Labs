package View;

import com.sun.xml.internal.ws.server.ServerRtException;

/**
 * Created by Zigzagger on 24.04.2017.
 */
public class View{

    public void printMessage(String inputString){
        System.out.println(inputString);
    }

    public void printMessagePlusValue(String inputString, int value){
        System.out.println(inputString + value);
    }
}
