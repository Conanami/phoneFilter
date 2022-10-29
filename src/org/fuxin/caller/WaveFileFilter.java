package org.fuxin.caller;

import java.io.File;
import java.util.ArrayList;

import org.fuxin.caller.C.Operator;
import org.fuxin.caller.C.Type;
import org.fuxin.util.FuOutput;
import org.fuxin.util.WaveFileReader;

/***
 * 这是个如何使用接口
 * IClassifyWave
 * 的示例类
 * @author Administrator
 *
 */
public class WaveFileFilter {
	/***
	 * 处理目录下所有的文件
	 * @param path
	 * @param prefix
	 * @return 
	 */
	public static ArrayList<WaveFileResult> CompareAllinPath(String path, String prefix) {
		File file=new File(path);
		File[] tempList = file.listFiles();
				
		ArrayList<WaveFileResult> resultlist = new ArrayList<WaveFileResult>();
		
		ArrayList<StandFile> stanlist = new ArrayList<StandFile>();
		
		
		
		
		//电信
		/*
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh_mar),3000,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh2_mar),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh3_mar),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh4_mar),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh5_mar),2800,Operator.Dx,Type.Kh));
		
		
		stanlist.add(new StandFile(new WaveFileReader(C.dxkhfile),3000,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkhfile2),2800,Operator.Dx,Type.Kh));
		*/
		
		/*
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh_mar),3000,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh2_mar),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh3_mar),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh4_mar),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh5_mar),2800,Operator.Dx,Type.Kh));
		
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh2_zn),2800,Operator.Dx,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.dxkh5_zn),2800,Operator.Dx,Type.Kh));
		
		
		stanlist.add(new StandFile(new WaveFileReader(C.dxtj_mar), 2800,Operator.Dx,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.dxtj2_mar), 2800,Operator.Dx,Type.Tj));
		
		//次序有讲究，出现几率高的排前面
		stanlist.add(new StandFile(new WaveFileReader(C.dxgj6_mar), 2620,Operator.Dx,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.dxgj_mar), 2600,Operator.Dx,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.dxgj2_mar), 2600,Operator.Dx,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.dxgj3_mar), 2600,Operator.Dx,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.dxgj4_mar), 2600,Operator.Dx,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.dxgj5_mar), 2600,Operator.Dx,Type.Gj));
		//联通
				
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh_mar), 3800,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh2_mar),4050,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh3_mar),2290,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh4_mar),2700,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh5_mar),2700,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh6_mar),2700,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh7_mar),2700,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh8_mar),3190,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh9_mar),2700,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh10_mar),2910,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh11_mar),3000,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh12_mar),2610,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh13_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh14_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh15_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh16_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh17_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh18_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh19_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh20_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh21_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh22_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh23_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh24_mar),2600,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh25_mar),2500,Operator.Lt,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ltkh26_mar),2500,Operator.Lt,Type.Kh));
		
		stanlist.add(new StandFile(new WaveFileReader(C.lttj_mar),1990,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj2_mar),4010,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj3_mar),2800,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj4_mar),2800,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj5_mar),2220,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj6_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj7_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj8_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj9_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj10_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj11_mar),2810,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj12_mar),2900,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj13_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj14_mar),2500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj15_mar),3500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lttj16_mar),3000,Operator.Lt,Type.Tj));
		
		stanlist.add(new StandFile(new WaveFileReader(C.lthrxz_mar),3500,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lthrxz2_mar),3200,Operator.Lt,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.lthrxz3_mar),2500,Operator.Lt,Type.Tj));
		
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj_mar),2100,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj2_mar),2800,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj3_mar),2580,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj4_mar),3340,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj5_mar),2660,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj6_mar),2000,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj7_mar),2500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj8_mar),2500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj9_mar),2500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj10_mar),2500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj11_mar),3910,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj12_mar),3500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj13_mar),2800,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj14_mar),2800,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj15_mar),2800,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj16_mar),2800,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj17_mar),2500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ltgj18_mar),2500,Operator.Lt,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.lthjzy_mar),2680,Operator.Lt,Type.Gj));
		
		//移动0304新增加的
		
		stanlist.add(new StandFile(new WaveFileReader(C.ydkh_mar),3210,Operator.Yd,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ydkh2_mar),2800,Operator.Yd,Type.Kh));
		stanlist.add(new StandFile(new WaveFileReader(C.ydkh3_mar),2800,Operator.Yd,Type.Kh));
		
		stanlist.add(new StandFile(new WaveFileReader(C.ydtj_mar),2800,Operator.Yd,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydtj2_mar),2800,Operator.Yd,Type.Tj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgq_mar),2800,Operator.Yd,Type.Tj));
		
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj_mar),3670,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj2_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj3_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj4_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj5_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj6_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj7_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj8_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj9_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj10_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj11_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj12_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj13_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj14_mar),2800,Operator.Yd,Type.Gj));
		stanlist.add(new StandFile(new WaveFileReader(C.ydgj15_mar),2800,Operator.Yd,Type.Gj));
		*/
		
		
		for (int i = 0; i < tempList.length; i++) {
		   if (tempList[i].isFile() 
				   && tempList[i].getName().endsWith(".wav")
				   && tempList[i].getName().startsWith(prefix)) {
			   
			   
			   //对文件进行分类
			   //获得手机号码
			   String phonenumber = tempList[i].getName().substring(0,11);
			   ClassifyWave cw= new ClassifyWave(); 
			   WaveFileResult wfr = cw.Filter(phonenumber,tempList[i], stanlist); 
			   resultlist.add(wfr);
			   FuOutput.sop(wfr.getPhonenumber()+"--"+wfr.getType());
		   }
		   if (tempList[i].isDirectory()) {
			   
		   }
		}
		return resultlist;
	}
	
	
}
