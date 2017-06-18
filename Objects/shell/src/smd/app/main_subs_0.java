package smd.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,58);
if (RapidSub.canDelegate("application_error")) return smd.app.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 58;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,25);
if (RapidSub.canDelegate("appstart")) return smd.app.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);
Debug.locals.put("Form1", _form1);
Debug.locals.put("args", _args);
 BA.debugLineNum = 25;BA.debugLine="Sub AppStart (Form1 As Form, args() As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(33554432);
main._mainform = _form1;
 BA.debugLineNum = 27;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\")";
Debug.ShouldStop(67108864);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 28;BA.debugLine="MainForm.Resizable=False";
Debug.ShouldStop(134217728);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="MainForm.Show";
Debug.ShouldStop(268435456);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 30;BA.debugLine="dir=\"C:/SmartDesk\"";
Debug.ShouldStop(536870912);
main._dir = BA.ObjectToString("C:/SmartDesk");
 BA.debugLineNum = 31;BA.debugLine="subdir=dir&\"/shell\"";
Debug.ShouldStop(1073741824);
main._subdir = RemoteObject.concat(main._dir,RemoteObject.createImmutable("/shell"));
 BA.debugLineNum = 32;BA.debugLine="agu.Initialize";
Debug.ShouldStop(-2147483648);
main._agu.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="cmli.Initialize";
Debug.ShouldStop(1);
main._cmli.runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="agu.Add(\"devices -l\")";
Debug.ShouldStop(2);
main._agu.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("devices -l"))));
 BA.debugLineNum = 35;BA.debugLine="Label3.TextSize=15";
Debug.ShouldStop(4);
main._label3.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 36;BA.debugLine="Label3.Text=\"Welcome to SmartDesk Alpha V1\"";
Debug.ShouldStop(8);
main._label3.runMethod(true,"setText",BA.ObjectToString("Welcome to SmartDesk Alpha V1"));
 BA.debugLineNum = 39;BA.debugLine="ListView2.Items.Clear";
Debug.ShouldStop(64);
main._listview2.runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 40;BA.debugLine="If File.Exists(subdir,\"adb.exe\") Then";
Debug.ShouldStop(128);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main._subdir),(Object)(RemoteObject.createImmutable("adb.exe"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 41;BA.debugLine="Log(time&\" -> file exists\")";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(main._time,RemoteObject.createImmutable(" -> file exists"))));
 BA.debugLineNum = 42;BA.debugLine="ListView2.Items.Add(time&\": \"&subdir&\" ready..\")";
Debug.ShouldStop(512);
main._listview2.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(main._time,RemoteObject.createImmutable(": "),main._subdir,RemoteObject.createImmutable(" ready..")))));
 }else {
 BA.debugLineNum = 44;BA.debugLine="File.MakeDir(dir,\"shell\")";
Debug.ShouldStop(2048);
main.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(main._dir),(Object)(RemoteObject.createImmutable("shell")));
 BA.debugLineNum = 45;BA.debugLine="File.Copy(File.DirAssets,\"adb.exe\",subdir,\"adb.";
Debug.ShouldStop(4096);
main.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("adb.exe")),(Object)(main._subdir),(Object)(RemoteObject.createImmutable("adb.exe")));
 BA.debugLineNum = 46;BA.debugLine="ListView2.Items.Add(time&\": file copied to \"&di";
Debug.ShouldStop(8192);
main._listview2.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(main._time,RemoteObject.createImmutable(": file copied to "),main._dir))));
 };
 BA.debugLineNum = 49;BA.debugLine="arg=\"get-serialno \"";
Debug.ShouldStop(65536);
main._arg = BA.ObjectToString("get-serialno ");
 BA.debugLineNum = 50;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
Debug.ShouldStop(131072);
main._shell.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shell")),(Object)(BA.ObjectToString("adb")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {main._arg})))));
 BA.debugLineNum = 51;BA.debugLine="shell.WorkingDirectory=subdir";
Debug.ShouldStop(262144);
main._shell.runMethod(true,"setWorkingDirectory",main._subdir);
 BA.debugLineNum = 52;BA.debugLine="shell.Run(-1)";
Debug.ShouldStop(524288);
main._shell.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 53;BA.debugLine="dev_path";
Debug.ShouldStop(1048576);
_dev_path();
 BA.debugLineNum = 54;BA.debugLine="ListView2.ScrollTo(ListView1.SelectedIndex)";
Debug.ShouldStop(2097152);
main._listview2.runVoidMethod ("ScrollTo",(Object)(main._listview1.runMethod(true,"getSelectedIndex")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_action() throws Exception{
try {
		Debug.PushSubsStack("Button1_Action (main) ","main",0,main.ba,main.mostCurrent,104);
if (RapidSub.canDelegate("button1_action")) return smd.app.main.remoteMe.runUserSub(false, "main","button1_action");
 BA.debugLineNum = 104;BA.debugLine="Sub Button1_Action";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="arg=\"\"";
Debug.ShouldStop(512);
main._arg = BA.ObjectToString("");
 BA.debugLineNum = 107;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
Debug.ShouldStop(1024);
main._shell.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shell")),(Object)(BA.ObjectToString("adb")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {main._arg})))));
 BA.debugLineNum = 108;BA.debugLine="shell.WorkingDirectory=subdir";
Debug.ShouldStop(2048);
main._shell.runMethod(true,"setWorkingDirectory",main._subdir);
 BA.debugLineNum = 109;BA.debugLine="shell.Run(-1)";
Debug.ShouldStop(4096);
main._shell.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_action() throws Exception{
try {
		Debug.PushSubsStack("Button2_Action (main) ","main",0,main.ba,main.mostCurrent,122);
if (RapidSub.canDelegate("button2_action")) return smd.app.main.remoteMe.runUserSub(false, "main","button2_action");
 BA.debugLineNum = 122;BA.debugLine="Sub Button2_Action";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="arg=\"logcat -d\"&dir";
Debug.ShouldStop(67108864);
main._arg = RemoteObject.concat(RemoteObject.createImmutable("logcat -d"),main._dir);
 BA.debugLineNum = 124;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
Debug.ShouldStop(134217728);
main._shell.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shell")),(Object)(BA.ObjectToString("adb")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {main._arg})))));
 BA.debugLineNum = 125;BA.debugLine="shell.WorkingDirectory=subdir";
Debug.ShouldStop(268435456);
main._shell.runMethod(true,"setWorkingDirectory",main._subdir);
 BA.debugLineNum = 126;BA.debugLine="shell.Run(-1)";
Debug.ShouldStop(536870912);
main._shell.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dev_path() throws Exception{
try {
		Debug.PushSubsStack("dev_path (main) ","main",0,main.ba,main.mostCurrent,85);
if (RapidSub.canDelegate("dev_path")) return smd.app.main.remoteMe.runUserSub(false, "main","dev_path");
 BA.debugLineNum = 85;BA.debugLine="Sub dev_path";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="arg=\"sync node /sdcard\"";
Debug.ShouldStop(2097152);
main._arg = BA.ObjectToString("sync node /sdcard");
 BA.debugLineNum = 87;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
Debug.ShouldStop(4194304);
main._shell.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shell")),(Object)(BA.ObjectToString("adb")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {main._arg})))));
 BA.debugLineNum = 88;BA.debugLine="shell.WorkingDirectory=subdir";
Debug.ShouldStop(8388608);
main._shell.runMethod(true,"setWorkingDirectory",main._subdir);
 BA.debugLineNum = 89;BA.debugLine="shell.Run(-1)";
Debug.ShouldStop(16777216);
main._shell.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ListView1_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,118);
if (RapidSub.canDelegate("listview1_selectedindexchanged")) return smd.app.main.remoteMe.runUserSub(false, "main","listview1_selectedindexchanged", _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 118;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview2_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ListView2_SelectedIndexChanged (main) ","main",0,main.ba,main.mostCurrent,112);
if (RapidSub.canDelegate("listview2_selectedindexchanged")) return smd.app.main.remoteMe.runUserSub(false, "main","listview2_selectedindexchanged", _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 112;BA.debugLine="Sub ListView2_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If Index =0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_action() throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,96);
if (RapidSub.canDelegate("menubar1_action")) return smd.app.main.remoteMe.runUserSub(false, "main","menubar1_action");
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 BA.debugLineNum = 96;BA.debugLine="Sub MenuBar1_Action";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim mi As MenuItem = Sender";
Debug.ShouldStop(1);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi.setObject(main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("mi", _mi);
 BA.debugLineNum = 98;BA.debugLine="If mi.Text=\"_Exit\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_mi.runMethod(true,"getText"),BA.ObjectToString("_Exit"))) { 
 BA.debugLineNum = 99;BA.debugLine="MainForm.Close";
Debug.ShouldStop(4);
main._mainform.runVoidMethod ("Close");
 BA.debugLineNum = 100;BA.debugLine="Log(\"close..\")";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("close..")));
 };
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_selectedchange(RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_SelectedChange (main) ","main",0,main.ba,main.mostCurrent,92);
if (RapidSub.canDelegate("menubar1_selectedchange")) return smd.app.main.remoteMe.runUserSub(false, "main","menubar1_selectedchange", _selected);
Debug.locals.put("Selected", _selected);
 BA.debugLineNum = 92;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("smd.app.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private MenuBar1 As MenuBar";
main._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private Button1 As Button";
main._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private Label1 As Label";
main._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private Label2 As Label";
main._label2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private Label3 As Label";
main._label3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private shell As Shell";
main._shell = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");
 //BA.debugLineNum = 15;BA.debugLine="Private agu,cmli As List";
main._agu = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main._cmli = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Private Label4 As Label";
main._label4 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Dim dir,subdir,arg,arg1,arg2,arg3 As String";
main._dir = RemoteObject.createImmutable("");
main._subdir = RemoteObject.createImmutable("");
main._arg = RemoteObject.createImmutable("");
main._arg1 = RemoteObject.createImmutable("");
main._arg2 = RemoteObject.createImmutable("");
main._arg3 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim time As String = DateTime.GetHour(DateTime.No";
main._time = RemoteObject.concat(main.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(":"),main.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(":"),main.__c.getField(false,"DateTime").runMethod(true,"GetSecond",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 //BA.debugLineNum = 19;BA.debugLine="Private ListView1 As ListView";
main._listview1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ListView2 As ListView";
main._listview2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim rmspace As jDiskSpace";
main._rmspace = RemoteObject.createNew ("com.jgiga.disk.giga.JDisk");
 //BA.debugLineNum = 22;BA.debugLine="Private Button2 As Button";
main._button2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _shell_processcompleted(RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("shell_ProcessCompleted (main) ","main",0,main.ba,main.mostCurrent,62);
if (RapidSub.canDelegate("shell_processcompleted")) return smd.app.main.remoteMe.runUserSub(false, "main","shell_processcompleted", _success, _exitcode, _stdout, _stderr);
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 62;BA.debugLine="Sub shell_ProcessCompleted (Success As Boolean, Ex";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 64;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Success")));
 BA.debugLineNum = 65;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(_stdout));
 BA.debugLineNum = 66;BA.debugLine="ListView2.Items.Add(time&\": \"&StdOut)";
Debug.ShouldStop(2);
main._listview2.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(main._time,RemoteObject.createImmutable(": "),_stdout))));
 BA.debugLineNum = 67;BA.debugLine="cmli.Add(StdOut)";
Debug.ShouldStop(4);
main._cmli.runVoidMethod ("Add",(Object)((_stdout)));
 BA.debugLineNum = 68;BA.debugLine="If cmli.Size=1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main._cmli.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 69;BA.debugLine="ListView1.Items.Add(\"Connected Device: \"&cmli.G";
Debug.ShouldStop(16);
main._listview1.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Connected Device: "),main._cmli.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))));
 BA.debugLineNum = 70;BA.debugLine="File.WriteString(dir,\"serail.txt\",cmli.Get(0))";
Debug.ShouldStop(32);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("serail.txt")),(Object)(BA.ObjectToString(main._cmli.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 72;BA.debugLine="If cmli.Size=2 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",main._cmli.runMethod(true,"getSize"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 73;BA.debugLine="File.WriteString(dir,\"device_path.txt\",cmli.Ge";
Debug.ShouldStop(256);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main._dir),(Object)(BA.ObjectToString("device_path.txt")),(Object)(BA.ObjectToString(main._cmli.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 };
 };
 }else {
 BA.debugLineNum = 77;BA.debugLine="Log(\"Error: \" & StdErr)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_stderr)));
 BA.debugLineNum = 78;BA.debugLine="ListView2.Items.Add(time&\": \"&StdErr)";
Debug.ShouldStop(8192);
main._listview2.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.concat(main._time,RemoteObject.createImmutable(": "),_stderr))));
 };
 BA.debugLineNum = 80;BA.debugLine="If cmli.Size>3 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",main._cmli.runMethod(true,"getSize"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 81;BA.debugLine="cmli.Clear";
Debug.ShouldStop(65536);
main._cmli.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}