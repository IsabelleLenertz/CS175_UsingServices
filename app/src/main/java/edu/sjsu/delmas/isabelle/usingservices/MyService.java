package edu.sjsu.delmas.isabelle.usingservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    public void onCreate(){
        Toast.makeText(this, "Local Sercive created", Toast.LENGTH_SHORT).show();
    }

    public void onDestroy(){
        Toast.makeText(this, "Local Sercive destroyed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
