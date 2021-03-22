package codes.wolo.droid;

import android.net.Uri;

public class ForwardIntentGeoActivity extends com.google.androidbrowserhelper.trusted.LauncherActivity {

    @Override
    protected Uri getLaunchingUrl() {
        Uri uri = this.getIntent().getData();
        String query = uri.getQuery();
        return (Uri.parse("https://wolo.codes/"+'?'+query));
    }
}
