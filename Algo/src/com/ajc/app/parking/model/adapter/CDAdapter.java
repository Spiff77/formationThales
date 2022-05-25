package com.ajc.app.parking.model.adapter;

public class CDAdapter implements K7Reader{

	CD cd;
	
	public CDAdapter(CD cd) {
		this.cd = cd;
	}

	@Override
	public void read() {
		cd.readTrack();
	}

}
