import mvmf.topology.WMF_MD_TopologyPlugin;
import myplugin.MyPlugin;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.runtime.ApplicationExitedException;

public class Debug {
	public static void main(String[] args) {
		try {
			MyPlugin plugin = new MyPlugin();
			WMF_MD_TopologyPlugin topoPlugin = new WMF_MD_TopologyPlugin();
			Application app = Application.getInstance();
			app.start(true, false, false, args, null);
			plugin.init();
			topoPlugin.init();
		} catch (ApplicationExitedException e) {
			e.printStackTrace();
		}
	}

}
