package org.fuxin.interf;

import java.io.File;
import java.util.ArrayList;

import org.fuxin.caller.StandFile;
import org.fuxin.caller.WaveFileResult;

public interface IClassifyWave {
	

	/***
	 * 对某个电话号码的录音文件进行删选，归类
	 * @param phonenumber
	 * @param file
	 * @param standlist
	 * @return
	 */
	public WaveFileResult Filter(String phonenumber, File file,
			ArrayList<StandFile> standlist);
}
