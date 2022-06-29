package com.cg.Assignment2;
abstract class persistence{
    abstract void persist();
}

class filePersistence extends persistence{
    void persist() {
        System.out.println("file persists");
    }
}

class databasePersistence extends persistence{
    void persist(){
        System.out.println("database persists");
    }
}

public class Control {
	 public static void main(String[] args) {
	        persistence obj= new persistence() {
	            @Override
	            void persist() {
	                System.out.println("calling it");
	            }
	        };
	        obj.persist();
	    }

}
