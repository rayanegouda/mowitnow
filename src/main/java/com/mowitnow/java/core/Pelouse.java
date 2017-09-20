package com.mowitnow.java.core;

import java.awt.Point;
import java.util.ArrayList;

public class Pelouse {
	public Point limite;
	public ArrayList<Tondeuse> tondeuses;
	
	public Pelouse(Point limite, ArrayList<Tondeuse> tondeuses) {
		super();
		this.limite = limite;
		this.tondeuses = tondeuses;
	}
	public Point getLimite() {
		return limite;
	}
	public void setLimite(Point limite) {
		this.limite = limite;
	}
	public ArrayList<Tondeuse> getTondeuses() {
		return tondeuses;
	}
	public void setTondeuses(ArrayList<Tondeuse> tondeuses) {
		this.tondeuses = tondeuses;
	}



}
