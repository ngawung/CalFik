package com.ngawung.calfik.state;

import com.inspedio.entity.InsState;
import com.inspedio.entity.InsText;

/**
 *
 * @author Ferdian <ferdi.igsal@gmail.com>
 */
public class HelloWorld extends InsState {

    public void create() {
        InsText text = new InsText("Hello World");
        add(text);
        
        System.err.println("Hello World");
    }
    
}
