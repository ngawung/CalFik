package com.ngawung.calfik;

import com.inspedio.enums.ScreenOrientation;
import com.inspedio.system.InsMain;
import com.ngawung.calfik.state.HelloWorld;

/**
 * @author Ferdian <ferdi.igsal@gmail.com>
 */
public class Main extends InsMain {
    protected void init() {
        init(new HelloWorld(), ScreenOrientation.PORTRAIT);
        
    }
}
