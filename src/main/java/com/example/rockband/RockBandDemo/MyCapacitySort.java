package com.example.rockband.RockBandDemo;

import java.util.Comparator;

import model.RockBand;

public class MyCapacitySort implements Comparator<RockBand>{

	@Override
	public int compare(RockBand o1, RockBand o2) {
		return o2.getCapacity()- o1.getCapacity();
	}
	
	

}
