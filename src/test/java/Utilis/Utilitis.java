package Utilis;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.Baseclassforss;

public class Utilitis extends Baseclassforss{

	public void getScreenshot() throws IOException {
		Date currentDate = new Date();
		String ssfilename =currentDate.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot scrShot =((TakesScreenshot)driver);	
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile,new File(".//Screenshot"+ssfilename+".png"));
	}
}
