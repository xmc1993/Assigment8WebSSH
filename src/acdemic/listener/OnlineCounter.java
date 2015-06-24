package acdemic.listener;

public class OnlineCounter {
	private static long online=0;
	private static long vistor=0;
	private static long user=0;
	public static long getOnline(){
		return online;
	}
	public static long getVistor(){
		return vistor;
	}
	public static long getUser(){
		return user;
	}
	public static void raiseVistor(){
		vistor++;
		update();
	}
	public static void reduceVistor(){
		vistor--;
		update();
	}
	public static void raiseUser(){
		user++;
		update();
	}
	public static void reduceUser(){
		user--;
		update();
	}
	public static void update(){
		online=vistor+user;
	}
}
