package controllers;

import play.*;
import play.mvc.*;
import play.data.binding.*;
import java.util.*;
import org.apache.commons.io.*;

import models.*;
import play.libs.*;
import play.utils.*;

public class B extends AbstractController {

    @Override
        protected Integer parseSomething() {
            return 12345;   // pretend we parsed this from somewhere
        }

        public static void index() {
            render();
        }
        
}
