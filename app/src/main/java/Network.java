import android.util.Log;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by mohil on 5/7/2017.
 */

public class Network {
    static OkHttpClient httpClient;
    public void init(){
        httpClient = new OkHttpClient();
    }
    public void getData(){
        Request request = new Request.Builder().url("http://localhost:3000").build();
        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                Log.d("MSG", response.body().toString());
            }
        });
    }
}
