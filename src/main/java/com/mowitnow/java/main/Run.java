package com.mowitnow.java.main;

import java.awt.Point;

import com.mowitnow.java.core.Tondeuse;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Point point_tondeuse = new Point (1,2);
		String orientation_tondeuse= "N";
		Tondeuse T1 = new Tondeuse(point_tondeuse, orientation_tondeuse);
		//T1.getOrientation("GAGAGAGAA");
		System.out.println(  T1.getOrientation("GAGAGAGAA") );
		Point point_tondeuse2 = new Point (3,3);
		String orientation_tondeuse2= "E";
		Tondeuse T2 = new Tondeuse(point_tondeuse2, orientation_tondeuse2);
		System.out.println(  T2.getOrientation("AADAADADDA") );
		

	}

}
