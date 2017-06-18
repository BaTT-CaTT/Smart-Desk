
package smd.app;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("smd.app.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "smd.app.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _menubar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _shell = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
public static RemoteObject _agu = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cmli = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _dir = RemoteObject.createImmutable("");
public static RemoteObject _subdir = RemoteObject.createImmutable("");
public static RemoteObject _arg = RemoteObject.createImmutable("");
public static RemoteObject _arg1 = RemoteObject.createImmutable("");
public static RemoteObject _arg2 = RemoteObject.createImmutable("");
public static RemoteObject _arg3 = RemoteObject.createImmutable("");
public static RemoteObject _time = RemoteObject.createImmutable("");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _listview2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _rmspace = RemoteObject.declareNull("com.jgiga.disk.giga.JDisk");
public static RemoteObject _button2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
  public Object[] GetGlobals() {
		return new Object[] {"agu",main._agu,"arg",main._arg,"arg1",main._arg1,"arg2",main._arg2,"arg3",main._arg3,"Button1",main._button1,"Button2",main._button2,"cmli",main._cmli,"dir",main._dir,"fx",main._fx,"Label1",main._label1,"Label2",main._label2,"Label3",main._label3,"Label4",main._label4,"ListView1",main._listview1,"ListView2",main._listview2,"MainForm",main._mainform,"MenuBar1",main._menubar1,"rmspace",main._rmspace,"shell",main._shell,"subdir",main._subdir,"time",main._time};
}
}