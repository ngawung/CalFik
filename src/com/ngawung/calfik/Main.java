package com.ngawung.calfik;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.*;

/**
 * @author Ferdian <ferdi.igsal@gmail.com>
 */
public class Main extends MIDlet {
    private Display display;
    private Form form;
    
    public Main() {
        form = new Form("Hello World");
    }

    public void startApp() {
        display = Display.getDisplay(this);
        display.setCurrent(form);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
