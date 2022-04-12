package com.ps.petappfe;

import com.ps.petappfe.Util.LoginRequest;
import com.ps.petappfe.Util.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("pet-app/api/users/login")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);


}