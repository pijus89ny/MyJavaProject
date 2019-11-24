package sushanta;

import java.util.ArrayList;
import java.util.List;

public class TdBankAccount {

	public static void main(String[] args) {
          
   
        List<String>stk=new ArrayList <String>();
        stk.add("pijus");
        stk.add("kona");
        stk.add("sone");
        stk.add("jon");
        
        System.out.println("before revove al:"+stk);
        stk.removeAll(stk);
        System.out.println("after remove all:"+stk);
	}

}
