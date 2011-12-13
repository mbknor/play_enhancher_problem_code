package controllers;

import play.*;
import play.mvc.*;
import play.data.binding.*;
import java.util.*;
import org.apache.commons.io.*;

import models.*;
import play.libs.*;
import play.utils.*;

public abstract class AbstractController<T> extends Controller {
    protected abstract T parseSomething();
}
