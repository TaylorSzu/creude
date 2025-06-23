
package com.taylorsz.crud.user.api;

import com.taylorsz.crud.user.core.UserRole;

public record UserDTO (
    String nome,
    String email,
    String senha,
    String role
) {

}
