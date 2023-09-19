package mx.linkom.caseta_linkaccess;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String TAG = "TOKEN";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        mx.linkom.caseta_linkaccess.Global.TOKEN = FirebaseInstanceId.getInstance().getToken();
    }

}