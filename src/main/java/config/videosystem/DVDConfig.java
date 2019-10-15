package config.videosystem;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.videosystem.Avengers;
import kr.co.itcen.springcontainer.videosystem.BlankDisc;

@Configuration
public class DVDConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	@Bean("avengersInfinityWar")
	public BlankDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("Avengers Infinity War");
		blankDisc.setStudio("MARVLE");
		blankDisc.setActors(Arrays.asList("Robert Downey Jr", "Scarlet Johansson", "Chris Evans"));
		
		return blankDisc;
	}
	
}
