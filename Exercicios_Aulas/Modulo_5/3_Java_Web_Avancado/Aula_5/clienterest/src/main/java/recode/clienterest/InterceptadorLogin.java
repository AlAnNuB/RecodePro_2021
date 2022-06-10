package recode.clienterest;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


public class InterceptadorLogin implements Interceptor {

    private String token;

    public InterceptadorLogin(String token) {
        this.token = token;
    }

    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();

        Request.Builder builder = original.newBuilder()
                .header("Authorization", token);

        Request request = builder.build();
        return chain.proceed(request);
    }

}

