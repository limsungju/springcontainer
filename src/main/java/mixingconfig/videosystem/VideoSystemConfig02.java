package mixingconfig.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import config.videosystem.DVDPlayerConfig2;

@Configuration
@Import({DVDPlayerConfig2.class})
@ImportResource({"classpath:config/videosystem/DVDConfig.xml"})
public class VideoSystemConfig02 {
	
}
