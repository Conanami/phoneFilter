package org.fuxin.caller;

public class C {
	//移动标准文件位置
	public static String ydkhfile = "c:\\standnew\\ydkh_ear.wav";
	//public static String ydkhfile2 = "c:\\standnew\\ydkh2_ear.wav";
	public static String ydtjfile = "c:\\standnew\\ydtj_ear.wav";
	public static String ydgjfile = "c:\\standnew\\ydgj_ear.wav";
	public static String ydgjfile2 = "c:\\standnew\\ydgj2_ear.wav";
	public static String ydgjfile3 = "c:\\standnew\\ydgj3_ear.wav";
	
	
	
	//联通标准文件位置
	public static String ltkhfile = "c:\\standnew\\ltkh_ear.wav";
	public static String ltkhfile2 = "c:\\standnew\\ltkh2_ear.wav";
	public static String lttjfile = "c:\\standnew\\lttj_ear.wav";
	public static String lttjfile2 = "c:\\standnew\\lttj2_ear.wav";
	public static String ltgjfile = "c:\\standnew\\ltgj_ear.wav";
	public static String ltkhfile3 = "c:\\standnew\\ltkh3_ear.wav";
	public static String ltgjfile2 = "c:\\standnew\\ltgj2_ear.wav";
	
	//电信标准文件位置
	public static String dxkhfile = "c:\\standnew\\dxkh_ear.wav";
	public static String dxkhfile2 = "c:\\standnew\\dxkh2_ear.wav";
	public static String dxtjfile = "c:\\standnew\\dxtj_ear.wav";
	public static String dxgjfile = "c:\\standnew\\dxgj_ear.wav";
	public static String dxgjfile2= "c:\\standnew\\dxgj2_ear.wav";
	
	//电信新增加
	public static String dxkh_mar = "c:\\stand3\\dxkh_mar.wav";
	public static String dxkh2_mar = "c:\\stand3\\dxkh2_mar.wav";
	public static String dxkh3_mar = "c:\\stand3\\dxkh3_mar.wav";
	public static String dxkh4_mar = "c:\\stand3\\dxkh4_mar.wav";
	public static String dxkh5_mar = "c:\\stand3\\dxkh5_mar.wav";
	
	public static String dxtj_mar = "c:\\stand3\\dxtj_mar.wav";
	public static String dxtj2_mar = "c:\\stand3\\dxtj2_mar.wav";
	
	public static String dxgj_mar = "c:\\stand3\\dxgj_mar.wav";
	public static String dxgj2_mar = "c:\\stand3\\dxgj2_mar.wav";
	public static String dxgj3_mar = "c:\\stand3\\dxgj3_mar.wav";
	public static String dxgj4_mar = "c:\\stand3\\dxgj4_mar.wav";
	public static String dxgj5_mar = "c:\\stand3\\dxgj5_mar.wav";
	public static String dxgj6_mar = "c:\\stand3\\dxgj6_mar.wav";
	//判断少于多少是噪音
	public static int smallnoise=60;
	//WAV文件最大值ֵ
	public static int maxwave = 32768;
	
	//移动的号段
	public static String[] ydprefix={"134","135","136","137",
			"138","139","150","151","152",
			"157","158","159","182","183",
			"184","187","178","188","147"};
	//联通的号段
	public static String[] ltprefix={"130","131","132","145",
			"155","156","176","185","186"};

	//电信的号段
	public static String[] dxprefix={"133","153","177","180","181","189"};
	
	//0301调试新增加的样本
	
	public static String ydkh_mar="c:\\stand3\\ydkh_mar.wav";
	public static String ydkh2_mar="c:\\stand3\\ydkh2_mar.wav";
	public static String ydkh3_mar="c:\\stand3\\ydkh3_mar.wav";
	
	public static String ydtj_mar="c:\\stand3\\ydtj_mar.wav";
	public static String ydtj2_mar="c:\\stand3\\ydtj2_mar.wav";
	public static String ydgq_mar="c:\\stand3\\ydgq_mar.wav";
	
	public static String ydgj_mar="c:\\stand3\\ydgj_mar.wav";
	public static String ydgj2_mar="c:\\stand3\\ydgj2_mar.wav";
	public static String ydgj3_mar="c:\\stand3\\ydgj3_mar.wav";
	public static String ydgj4_mar="c:\\stand3\\ydgj4_mar.wav";
	public static String ydgj5_mar="c:\\stand3\\ydgj5_mar.wav";
	public static String ydgj6_mar="c:\\stand3\\ydgj6_mar.wav";
	public static String ydgj7_mar="c:\\stand3\\ydgj7_mar.wav";
	public static String ydgj8_mar="c:\\stand3\\ydgj8_mar.wav";
	public static String ydgj9_mar="c:\\stand3\\ydgj9_mar.wav";
	public static String ydgj10_mar="c:\\stand3\\ydgj10_mar.wav";
	public static String ydgj11_mar="c:\\stand3\\ydgj11_mar.wav";
	public static String ydgj12_mar="c:\\stand3\\ydgj12_mar.wav";
	public static String ydgj13_mar="c:\\stand3\\ydgj13_mar.wav";
	public static String ydgj14_mar="c:\\stand3\\ydgj14_mar.wav";
	public static String ydgj15_mar="c:\\stand3\\ydgj15_mar.wav";
	
	
	//联通空号
	public static String ltkh_mar="c:\\stand3\\ltkh_mar.wav";
	public static String ltkh2_mar="c:\\stand3\\ltkh2_mar.wav";
	public static String ltkh3_mar="c:\\stand3\\ltkh3_mar.wav";
	public static String ltkh4_mar="c:\\stand3\\ltkh4_mar.wav";
	public static String ltkh5_mar="c:\\stand3\\ltkh5_mar.wav";
	public static String ltkh6_mar="c:\\stand3\\ltkh6_mar.wav";
	public static String ltkh7_mar="c:\\stand3\\ltkh7_mar.wav";
	public static String ltkh8_mar="c:\\stand3\\ltkh8_mar.wav";
	public static String ltkh9_mar="c:\\stand3\\ltkh9_mar.wav";
	public static String ltkh10_mar="c:\\stand3\\ltkh10_mar.wav";
	public static String ltkh11_mar="c:\\stand3\\ltkh11_mar.wav";
	public static String ltkh12_mar="c:\\stand3\\ltkh12_mar.wav";
	public static String ltkh13_mar="c:\\stand3\\ltkh13_mar.wav";
	public static String ltkh14_mar="c:\\stand3\\ltkh14_mar.wav";
	public static String ltkh15_mar="c:\\stand3\\ltkh15_mar.wav";
	public static String ltkh16_mar="c:\\stand3\\ltkh16_mar.wav";
	public static String ltkh17_mar="c:\\stand3\\ltkh17_mar.wav";
	public static String ltkh18_mar="c:\\stand3\\ltkh18_mar.wav";
	public static String ltkh19_mar="c:\\stand3\\ltkh19_mar.wav";
	public static String ltkh20_mar="c:\\stand3\\ltkh20_mar.wav";
	public static String ltkh21_mar="c:\\stand3\\ltkh21_mar.wav";
	public static String ltkh22_mar="c:\\stand3\\ltkh22_mar.wav";
	public static String ltkh23_mar="c:\\stand3\\ltkh23_mar.wav";
	public static String ltkh24_mar="c:\\stand3\\ltkh24_mar.wav";
	public static String ltkh25_mar="c:\\stand3\\ltkh25_mar.wav";
	public static String ltkh26_mar="c:\\stand3\\ltkh26_mar.wav";
	
	//联通停机
	public static String lttj_mar="c:\\stand3\\lttj_mar.wav";
	public static String lttj2_mar="c:\\stand3\\lttj2_mar.wav";
	public static String lttj3_mar="c:\\stand3\\lttj3_mar.wav";
	public static String lttj4_mar="c:\\stand3\\lttj4_mar.wav";
	public static String lttj5_mar="c:\\stand3\\lttj5_mar.wav";
	public static String lttj6_mar="c:\\stand3\\lttj6_mar.wav";
	public static String lttj7_mar="c:\\stand3\\lttj7_mar.wav";
	public static String lttj8_mar="c:\\stand3\\lttj8_mar.wav";
	public static String lttj9_mar="c:\\stand3\\lttj9_mar.wav";
	public static String lttj10_mar="c:\\stand3\\lttj10_mar.wav";
	public static String lttj11_mar="c:\\stand3\\lttj11_mar.wav";
	public static String lttj12_mar="c:\\stand3\\lttj12_mar.wav";
	public static String lttj13_mar="c:\\stand3\\lttj13_mar.wav";
	public static String lttj14_mar="c:\\stand3\\lttj14_mar.wav";
	public static String lttj15_mar="c:\\stand3\\lttj15_mar.wav";
	public static String lttj16_mar="c:\\stand3\\lttj16_mar.wav";
	
	public static String lthrxz_mar="c:\\stand3\\lthrxz_mar.wav";
	public static String lthrxz2_mar="c:\\stand3\\lthrxz2_mar.wav";
	public static String lthrxz3_mar="c:\\stand3\\lthrxz3_mar.wav";
	//联通关机
	public static String ltgj_mar="c:\\stand3\\ltgj_mar.wav";
	public static String ltgj2_mar="c:\\stand3\\ltgj2_mar.wav";
	public static String ltgj3_mar="c:\\stand3\\ltgj3_mar.wav";
	public static String ltgj4_mar="c:\\stand3\\ltgj4_mar.wav";
	public static String ltgj5_mar="c:\\stand3\\ltgj5_mar.wav";
	public static String ltgj6_mar="c:\\stand3\\ltgj6_mar.wav";
	public static String ltgj7_mar="c:\\stand3\\ltgj7_mar.wav";
	public static String ltgj8_mar="c:\\stand3\\ltgj8_mar.wav";
	public static String ltgj9_mar="c:\\stand3\\ltgj9_mar.wav";
	public static String ltgj10_mar="c:\\stand3\\ltgj10_mar.wav";
	public static String ltgj11_mar="c:\\stand3\\ltgj11_mar.wav";
	public static String ltgj12_mar="c:\\stand3\\ltgj12_mar.wav";
	public static String ltgj13_mar="c:\\stand3\\ltgj13_mar.wav";
	public static String ltgj14_mar="c:\\stand3\\ltgj14_mar.wav";
	public static String ltgj15_mar="c:\\stand3\\ltgj15_mar.wav";
	public static String ltgj16_mar="c:\\stand3\\ltgj16_mar.wav";
	public static String ltgj17_mar="c:\\stand3\\ltgj17_mar.wav";
	public static String ltgj18_mar="c:\\stand3\\ltgj18_mar.wav";
	//联通呼叫转移
	public static String lthjzy_mar="c:\\stand3\\lthjzy_mar.wav";
	
	
	//兆能现场增加
	public static String dxkh2_zn="c:\\soundzn\\dxkh2_zn.wav";
	public static String dxkh5_zn="c:\\soundzn\\dxkh5_zn.wav";
	
	public enum Operator
	{
		Unknown,Yd,Lt,Dx
	}
	
	public enum Type
	{
		Zc,Kh,Tj,Gj,Unknown,Undo
	}
	
}
