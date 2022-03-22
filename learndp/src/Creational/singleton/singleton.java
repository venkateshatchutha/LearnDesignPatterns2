package Creational.singleton;

import java.io.Serializable;

public class singleton implements Serializable{
    // early loading
    public static singleton earlyobject= new singleton();
    // lazy binding
    private static singleton object= null;
    private singleton(){

    }

    public static singleton getInstance(){
        // not thread safe
        if( object==null){
            object=new singleton();
        }
        // thread safe
        if( object ==null){
            synchronized (singleton.class){
                if(object==null){ // double check locking
                    object=new singleton();
                }
            }
        } //
        return object;
    }



}

// eg controler, db

// what is volatile key word?
//  Volatile keyword is used to modify the value of a variable by different threads
// how to break the double check singleton?
// class loaders, serialization, externalization, reflection.
// what is marker interface?
// which has no methods. it is defined in jvm. serializable is marker interface. runnable is also marker interface
// serialization:
    //  suid
// what is functional interface?
// java8 related questions like streams, consumer...etc
//