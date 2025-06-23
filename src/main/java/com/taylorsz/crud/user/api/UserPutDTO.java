package com.taylorsz.crud.user.api;

public record UserPutDTO (
    Long id,
    String nome,
    String email,
    String senha,
    String role
) {

}
