package csci498.lunchlist;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class HelpPage extends Activity{
	
	private WebView browser;
	
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.help);
		
		browser = (WebView)findViewById(R.id.webkit);
		browser.loadUrl("file://android_asset/help.html");
	}

}
