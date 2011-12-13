package controllers;

import play.mvc.Controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class E extends Controller {
  public static void index() {
    Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
    int counter = 0;
    for (int i = 0; i < 10; i++) {
      map.put("string", counter++);
    }
    renderText(map.size());
  }

//  public static void index() {
//    Map<String, Integer> map = new ConcurrentHashMap<String, Integer>();
//    int counter = 0;
//    for (int i = 0; i < 10; i++) {
//      map.put("string", counter);
//      counter++;
//    }
//    renderText(map.size());
//  }
}