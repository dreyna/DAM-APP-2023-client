package com.cavanosa.crudretrofitapp.interfaces;

import com.cavanosa.crudretrofitapp.dto.ProductDto;
import com.cavanosa.crudretrofitapp.model.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CRUDInterface {

    @GET("productos")
    Call<List<Producto>> getAll();

    @GET("productos/{id}")
    Call<Producto> getOne(@Path("id") int id);

    @POST("productos")
    Call<Producto> create(@Body ProductDto dto);

    @PUT("productos/{id}")
    Call<Producto> edit(@Path("id") int id, @Body ProductDto dto);

    @DELETE("productos/{id}")
    Call<Producto> delete(@Path("id") int id);
}
