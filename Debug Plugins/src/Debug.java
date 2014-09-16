import magicdraw.feature.editor.FeatureEditor;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.runtime.ApplicationExitedException;

public class Debug {
	public static void main(String[] args) {
		try {
			FeatureEditor plugin = new FeatureEditor();
			Application app = Application.getInstance();
			app.start(true, false, false, args, null);
			plugin.init();
		} catch (ApplicationExitedException e) {
			e.printStackTrace();
		}
	}
}
