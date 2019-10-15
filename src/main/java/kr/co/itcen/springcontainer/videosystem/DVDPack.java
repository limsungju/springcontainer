package kr.co.itcen.springcontainer.videosystem;

import java.util.List;

public class DVDPack {
	private String title;
	private String studio;
	private List<DigitalVideoDisc> digitalVideoDiscs;
	
	public DVDPack(String title, String studio, List<DigitalVideoDisc> digitalVideoDiscs) {
		this.title = title;
		this.studio = studio;
		this.digitalVideoDiscs = digitalVideoDiscs;
	}
	
	@Override
	public String toString() {
		return "DVDPack [title=" + title + ", studio=" + studio + ", digitalVideoDiscs=" + digitalVideoDiscs + "]";
	}
}
