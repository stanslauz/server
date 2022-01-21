package io.getarrays.server.service.implementation;

import io.getarrays.server.model.Users;
import io.getarrays.server.repo.UsersRepo;
import io.getarrays.server.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.Collection;

import static java.lang.Boolean.TRUE;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private final UsersRepo usersRepo;
    @Override
    public Users create(Users users) {

        log.info("Saving new user: {}", users.getName());
        return usersRepo.save(users);
    }

    @Override
    public Collection<Users> list(int limit) {
        log.info("Fetching all users");
        return usersRepo.findAll(of(0, limit)).toList();
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Deleting user by ID: {}", id);
        usersRepo.deleteById(id);
        return TRUE;
    }
}
