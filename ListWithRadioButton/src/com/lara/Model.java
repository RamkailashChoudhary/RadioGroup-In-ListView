package com.lara;

public class Model {
	
	 String question; // hold the question
	    int current = NONE; // hold the answer picked by the user, initial is NONE(see below)
	    public static final int NONE = 1000; // No answer selected
	    public static final int ANSWER_ONE_SELECTED = 0; // first answer selected
	    public static final int ANSWER_TWO_SELECTED = 1; // second answer selected
	    public static final int ANSWER_THREE_SELECTED = 2; // third answer selected
	    public static final int ANSWER_FOUR_SELECTED = 3; // forth answer selected

	    public Model(String question) {
	        this.question = question;  
	    }

}
