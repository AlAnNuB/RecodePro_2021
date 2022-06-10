package recode.clienterest;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import recode.clienterest.service.ProdutoService;

/**
 *
 * @author denis
 */
public class GestorServico {
    
    private final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private final Retrofit retrofit;

    public GestorServico(String user, String password) {
        String token = Credentials.basic(user, password);
        System.out.println(token);
        InterceptadorLogin interceptador = new InterceptadorLogin(token);
        httpClient.addInterceptor(interceptador);
        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .client(httpClient.build())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    
    public ProdutoService createService(){
        return retrofit.create(ProdutoService.class);
    }
    
}

