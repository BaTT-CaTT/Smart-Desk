package smd.app;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("smd.app", "smd.app.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("smd.app", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "smd.app.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label3 = null;
public static anywheresoftware.b4j.objects.Shell _shell = null;
public static anywheresoftware.b4a.objects.collections.List _agu = null;
public static anywheresoftware.b4a.objects.collections.List _cmli = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label4 = null;
public static String _dir = "";
public static String _subdir = "";
public static String _arg = "";
public static String _arg1 = "";
public static String _arg2 = "";
public static String _arg3 = "";
public static String _time = "";
public static anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview2 = null;
public static com.jgiga.disk.giga.JDisk _rmspace = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button2 = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error"))
	return (Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args});
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\")";
_mainform.getRootPane().LoadLayout(ba,"1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Resizable=False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="dir=\"C:/SmartDesk\"";
_dir = "C:/SmartDesk";
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="subdir=dir&\"/shell\"";
_subdir = _dir+"/shell";
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="agu.Initialize";
_agu.Initialize();
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="cmli.Initialize";
_cmli.Initialize();
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="agu.Add(\"devices -l\")";
_agu.Add((Object)("devices -l"));
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="Label3.TextSize=15";
_label3.setTextSize(15);
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="Label3.Text=\"Welcome to SmartDesk Alpha V1\"";
_label3.setText("Welcome to SmartDesk Alpha V1");
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="ListView2.Items.Clear";
_listview2.getItems().Clear();
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="If File.Exists(subdir,\"adb.exe\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_subdir,"adb.exe")) { 
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="Log(time&\" -> file exists\")";
anywheresoftware.b4a.keywords.Common.Log(_time+" -> file exists");
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="ListView2.Items.Add(time&\": \"&subdir&\" ready..\")";
_listview2.getItems().Add((Object)(_time+": "+_subdir+" ready.."));
 }else {
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="File.MakeDir(dir,\"shell\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_dir,"shell");
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="File.Copy(File.DirAssets,\"adb.exe\",subdir,\"adb.";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"adb.exe",_subdir,"adb.exe");
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="ListView2.Items.Add(time&\": file copied to \"&di";
_listview2.getItems().Add((Object)(_time+": file copied to "+_dir));
 };
RDebugUtils.currentLine=65560;
 //BA.debugLineNum = 65560;BA.debugLine="arg=\"get-serialno \"";
_arg = "get-serialno ";
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
_shell.Initialize("shell","adb",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_arg}));
RDebugUtils.currentLine=65562;
 //BA.debugLineNum = 65562;BA.debugLine="shell.WorkingDirectory=subdir";
_shell.setWorkingDirectory(_subdir);
RDebugUtils.currentLine=65563;
 //BA.debugLineNum = 65563;BA.debugLine="shell.Run(-1)";
_shell.Run(ba,(long) (-1));
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="dev_path";
_dev_path();
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="ListView2.ScrollTo(ListView1.SelectedIndex)";
_listview2.ScrollTo(_listview1.getSelectedIndex());
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="End Sub";
return "";
}
public static String  _dev_path() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "dev_path"))
	return (String) Debug.delegate(ba, "dev_path", null);
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub dev_path";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="arg=\"sync node /sdcard\"";
_arg = "sync node /sdcard";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
_shell.Initialize("shell","adb",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_arg}));
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="shell.WorkingDirectory=subdir";
_shell.setWorkingDirectory(_subdir);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="shell.Run(-1)";
_shell.Run(ba,(long) (-1));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_action"))
	return (String) Debug.delegate(ba, "button1_action", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Button1_Action";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="arg=\"\"";
_arg = "";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
_shell.Initialize("shell","adb",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_arg}));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="shell.WorkingDirectory=subdir";
_shell.setWorkingDirectory(_subdir);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="shell.Run(-1)";
_shell.Run(ba,(long) (-1));
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return "";
}
public static String  _button2_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button2_action"))
	return (String) Debug.delegate(ba, "button2_action", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Button2_Action";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="arg=\"logcat -d\"&dir";
_arg = "logcat -d"+_dir;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="shell.Initialize(\"shell\",\"adb\",Array As String(ar";
_shell.Initialize("shell","adb",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_arg}));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="shell.WorkingDirectory=subdir";
_shell.setWorkingDirectory(_subdir);
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="shell.Run(-1)";
_shell.Run(ba,(long) (-1));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "listview1_selectedindexchanged"))
	return (String) Debug.delegate(ba, "listview1_selectedindexchanged", new Object[] {_index});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _listview2_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "listview2_selectedindexchanged"))
	return (String) Debug.delegate(ba, "listview2_selectedindexchanged", new Object[] {_index});
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub ListView2_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="If Index =0 Then";
if (_index==0) { 
 };
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action"))
	return (String) Debug.delegate(ba, "menubar1_action", null);
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="If mi.Text=\"_Exit\" Then";
if ((_mi.getText()).equals("_Exit")) { 
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="MainForm.Close";
_mainform.Close();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Log(\"close..\")";
anywheresoftware.b4a.keywords.Common.Log("close..");
 };
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_selectedchange(boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_selectedchange"))
	return (String) Debug.delegate(ba, "menubar1_selectedchange", new Object[] {_selected});
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub MenuBar1_SelectedChange (Selected As Boolean)";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public static String  _shell_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "shell_processcompleted"))
	return (String) Debug.delegate(ba, "shell_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr});
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub shell_ProcessCompleted (Success As Boolean, Ex";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Success\")";
anywheresoftware.b4a.keywords.Common.Log("Success");
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Log(StdOut)";
anywheresoftware.b4a.keywords.Common.Log(_stdout);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="ListView2.Items.Add(time&\": \"&StdOut)";
_listview2.getItems().Add((Object)(_time+": "+_stdout));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="cmli.Add(StdOut)";
_cmli.Add((Object)(_stdout));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="If cmli.Size=1 Then";
if (_cmli.getSize()==1) { 
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="ListView1.Items.Add(\"Connected Device: \"&cmli.G";
_listview1.getItems().Add((Object)("Connected Device: "+BA.ObjectToString(_cmli.Get((int) (0)))));
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="File.WriteString(dir,\"serail.txt\",cmli.Get(0))";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"serail.txt",BA.ObjectToString(_cmli.Get((int) (0))));
 }else {
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="If cmli.Size=2 Then";
if (_cmli.getSize()==2) { 
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="File.WriteString(dir,\"device_path.txt\",cmli.Ge";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dir,"device_path.txt",BA.ObjectToString(_cmli.Get((int) (1))));
 };
 };
 }else {
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Log(\"Error: \" & StdErr)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_stderr);
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="ListView2.Items.Add(time&\": \"&StdErr)";
_listview2.getItems().Add((Object)(_time+": "+_stderr));
 };
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="If cmli.Size>3 Then";
if (_cmli.getSize()>3) { 
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="cmli.Clear";
_cmli.Clear();
 };
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="End Sub";
return "";
}
}