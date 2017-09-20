package com.mowitnow.java.core;

import java.awt.Point;
import java.util.HashMap;

public class Tondeuse {	
	public static final HashMap<String, String> TableauValeurs ;
    static
    {
    	TableauValeurs = new HashMap<String, String>();
    	TableauValeurs.put("NG", "E");TableauValeurs.put("SG", "O");TableauValeurs.put("OG", "N");TableauValeurs.put("EG", "S");
    	TableauValeurs.put("ND", "O");TableauValeurs.put("SD", "E");TableauValeurs.put("OD", "S");TableauValeurs.put("ED", "N");
    	TableauValeurs.put("NA", "1Y");TableauValeurs.put("SA", "Y1");TableauValeurs.put("OA", "X1");TableauValeurs.put("EA", "1X");
    }
	public Point point_tondeuse;
	public String orientation_tondeuse;
	
	public Tondeuse(Point point_tondeuse, String orientation_tondeuse) {
		super();
		this.point_tondeuse = point_tondeuse;
		this.orientation_tondeuse = orientation_tondeuse;
	}
	public Point getPoint_tondeuse() {
		return point_tondeuse;
	}
	public void setPoint_tondeuse(Point point_tondeuse) {
		this.point_tondeuse = point_tondeuse;
	}
	public String getOrientation_tondeuse() {
		return orientation_tondeuse;
	}
	public void setOrientation_tondeuse(String orientation_tondeuse) {
		this.orientation_tondeuse = orientation_tondeuse;
	}
	
  public String getOrientation(String Deplacement){
	  
   Deplacement= Deplacement.replaceAll("A", "");
   String orientation_courante = this.getOrientation_tondeuse();
   
   if (Deplacement.length()==0){
	   orientation_courante="";   
	   return orientation_courante;
   }
	
   else if (Deplacement.length()==1){
	   orientation_courante=Tondeuse.TableauValeurs.get( this.getOrientation_tondeuse().toUpperCase()+Deplacement);   
	   return orientation_courante;
   }

   else {
	  
	   orientation_courante=Tondeuse.TableauValeurs.get(this.getOrientation_tondeuse().toUpperCase()+String.valueOf(Deplacement.charAt(0)));
	   this.setOrientation_tondeuse(orientation_courante);
	   Deplacement = Deplacement.substring(1, (Deplacement.length()));
	   return this.getOrientation( Deplacement); 
	  
   }  
   

  }
	

}
