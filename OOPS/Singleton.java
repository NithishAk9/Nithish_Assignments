package com.cg.Assignment2;

public class Singleton {
	public static void main(String[] args) {
		  ex object=ex.return_obj();
    }
}

class ex{
    static ex obj= new ex();
    private ex(){

    }
    public static ex return_obj(){
        return obj;
    }

	}


