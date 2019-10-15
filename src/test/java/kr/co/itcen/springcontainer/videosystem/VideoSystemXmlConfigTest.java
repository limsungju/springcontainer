package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Explicit(명시적) Configuration - Java Config 
 * @Bean 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/videosystem/videoSystemConfig.xml"})
public class VideoSystemXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
//	안좋은 방식, 인터페이스로 받아오는게 좋음
//	@Autowired
//	Avengers avengers;
	
	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc digitalVideoDisc1;
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	DigitalVideoDisc digitalVideoDisc2;
	
	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc digitalVideoDisc3;
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	DigitalVideoDisc digitalVideoDisc4;
	
	@Autowired
	@Qualifier("captainAmerica")
	DigitalVideoDisc digitalVideoDisc5;
	
	@Autowired
	@Qualifier("avengersDirector'sEdition")
	DigitalVideoDisc digitalVideoDisc6;
	
	@Autowired
	@Qualifier("avengersExpansionPack")
	DigitalVideoDisc digitalVideoDisc7;
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	DigitalVideoDisc digitalVideoDisc8;
	
	@Autowired
	@Qualifier("avengersTriplePack")
	DVDPack dvdPack;
	
	@Autowired
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdPlayer1;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdPlayer2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer dvdPlayer3;
	
	@Autowired
	@Qualifier("dvdPlayer4")
	DVDPlayer dvdPlayer4;
	
	@Autowired
	@Qualifier("dvdPlayer5")
	DVDPlayer dvdPlayer5;
	
	@Test
	public void testDigitalVideoDisc1Null() {
		assertNotNull(digitalVideoDisc1);
		System.out.println(digitalVideoDisc1);
	}
	
	@Test
	public void testDigitalVideoDisc2Null() {
		assertNotNull(digitalVideoDisc2);
		System.out.println(digitalVideoDisc2);
		assertEquals("BlankDisc [title=Avengers Infinity War, studio=MARVLE, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDigitalVideoDisc3Null() {
		assertNotNull(digitalVideoDisc3);
		System.out.println(digitalVideoDisc3);
		assertEquals("BlankDisc [title=Avengers Endgame, studio=MARVLE, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDigitalVideoDisc4Null() {
		assertNotNull(digitalVideoDisc4);
		System.out.println(digitalVideoDisc4);
		assertEquals("BlankDisc [title=Avengers Age of Ultron, studio=MARVLE, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDigitalVideoDisc5Null() {
		assertNotNull(digitalVideoDisc5);
		System.out.println(digitalVideoDisc5);
		assertEquals("BlankDisc [title=Captain America, studio=MARVLE, actors=null]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDigitalVideoDisc6Null() {
		assertNotNull(digitalVideoDisc6);
		System.out.println(digitalVideoDisc6);
		assertEquals("BlankDisc [title=Avengers Director's Edition, studio=MARVLE, actors=[Robert Downey Jr, Scarlet Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDigitalVideoDisc7Null() {
		assertNotNull(digitalVideoDisc7);
		System.out.println(digitalVideoDisc7);
		assertEquals("BlankDisc [title=Avengers Expansion Pack, studio=MARVLE, actors=[Robert Downey Jr, Scarlet Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDigitalVideoDisc8Null() {
		assertNotNull(digitalVideoDisc8);
		System.out.println(digitalVideoDisc8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MARVLE, actors=[Robert Downey Jr, Scarlet Johansson, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPackNull() {
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
	}
	
	
	
	
	@Test
	public void testDVDPlayer1Null() {
		assertNotNull(dvdPlayer1);
	}
	
	@Test
	public void testDVDPlay1() {
		dvdPlayer1.play();
		assertEquals("Playing Movie MARVLE's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPlayer2Null() {
		assertNotNull(dvdPlayer2);
	}
	
	@Test
	public void testDVDPlay2() {
		dvdPlayer2.play();
		assertEquals("Playing Movie MARVLE's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPlayer3Null() {
		assertNotNull(dvdPlayer3);
	}
	
	@Test
	public void testDVDPlay3() {
		dvdPlayer3.play();
		assertEquals("Playing Movie MARVLE's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPlayer4Null() {
		assertNotNull(dvdPlayer4);
	}
	
	@Test
	public void testDVDPlay4() {
		dvdPlayer4.play();
		assertEquals("Playing Movie MARVLE's Avengers Director's Edition", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPlayer5Null() {
		assertNotNull(dvdPlayer5);
	}
	
	@Test
	public void testDVDPlay5() {
		dvdPlayer5.play();
		assertEquals("Playing Movie MARVLE's Captain America", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
