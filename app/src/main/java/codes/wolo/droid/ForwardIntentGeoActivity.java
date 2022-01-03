package codes.wolo.droid;

import android.net.Uri;
import android.net.UrlQuerySanitizer;

public class ForwardIntentGeoActivity extends com.google.androidbrowserhelper.trusted.LauncherActivity {

    @Override
    protected Uri getLaunchingUrl() {
        Uri uri = this.getIntent().getData();
        String query = new UrlQuerySanitizer(uri.toString()).getValue("q");
        return (Uri.parse("https://wolo.codes/"+'?'+"q="+query));
    }

}
