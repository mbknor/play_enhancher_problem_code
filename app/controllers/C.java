package controllers;

import play.*;
import play.mvc.*;
import static play.mvc.Http.*;
import static play.mvc.Http.WebSocketEvent.*;
import play.data.binding.*;
import java.util.*;
import org.apache.commons.io.*;

import models.*;
import play.libs.*;
import play.utils.*;

public class C extends WebSocketController {

        public static void index() {
            while(inbound.isOpen()) {
                            WebSocketEvent e = play.mvc.WebSocketController.await(inbound.nextEvent());
            for(String command1: TextFrame.and(TextFrame.Equals("c1")).match(e) ) {outbound.send("c1");disconnect();}
            for(String command2: TextFrame.and(TextFrame.Equals("c2")).match(e) ) {outbound.send("c2");disconnect();}
            for(String command3: TextFrame.and(TextFrame.Equals("c3")).match(e) ) {outbound.send("c3");disconnect();}
            for(String command4: TextFrame.and(TextFrame.Equals("c4")).match(e) ) {outbound.send("c4");disconnect();}
            for(String command5: TextFrame.and(TextFrame.Equals("c5")).match(e) ) {outbound.send("c5");disconnect();}
            for(String command6: TextFrame.and(TextFrame.Equals("c6")).match(e) ) {outbound.send("c6");disconnect();}
            for(String command7: TextFrame.and(TextFrame.Equals("c7")).match(e) ) {outbound.send("c7");disconnect();}
            }
        }
        
}
