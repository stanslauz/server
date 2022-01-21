package io.getarrays.server.service;

import io.getarrays.server.model.Server;
import io.getarrays.server.model.Users;

import java.util.Collection;

public interface UserService {

    Users create (Users users);
    Collection<Users> list(int limit);
    Boolean delete(Long id);
}
