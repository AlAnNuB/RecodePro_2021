package recode.clienterest.service;

import java.util.List;

import recode.clienterest.data.Produto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


/**
 *
 * @author denis
 */
public interface ProdutoService {
	@GET("produtos")
	Call<List<Produto>> obterTodos();

    @GET("produtos/{codigo}")
	Call<Produto> obter(@Path("codigo") Long codigo);
	
	@POST("produtos")
	Call<Produto> inserir(@Body Produto produto);
	
	@DELETE("produtos/{codigo}")
	Call<Void> deletar(@Path("codigo") Long codigo);
	
	@PUT("produtos")
	Call<Void> alterar(@Body Produto produto);
}

