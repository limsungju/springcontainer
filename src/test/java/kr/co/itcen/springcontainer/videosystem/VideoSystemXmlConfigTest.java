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
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdPlayer1;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdPlayer2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer dvdPlayer3;
	
	@Test
	public void testDigitalVideoDisc1Null() {
		assertNotNull(digitalVideoDisc1);
	}
	
	@Test
	public void testDigitalVideoDisc2Null() {
		assertNotNull(digitalVideoDisc2);
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
	
}
