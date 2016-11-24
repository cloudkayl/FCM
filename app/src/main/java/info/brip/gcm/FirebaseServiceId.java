package info.brip.gcm;

//import android.media.session.MediaSession;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ayush on 24/11/16.
 */

public class FirebaseServiceId extends FirebaseInstanceIdService {
    private static final String REG_TOKEN = "REG TOKEN";
    @Override
    public void onTokenRefresh() {
        String recent_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN, recent_token);
    }
}
