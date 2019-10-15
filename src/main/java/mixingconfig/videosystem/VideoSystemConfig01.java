package mixingconfig.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import config.videosystem.DVDConfig;
import config.videosystem.DVDPlayerConfig2;

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig2.class})
public class VideoSystemConfig01 {
	
}
