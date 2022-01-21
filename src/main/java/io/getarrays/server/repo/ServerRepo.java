package io.getarrays.server.repo;

import io.getarrays.server.model.Server;
import io.getarrays.server.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
    Server findByIpAddressAndPort(String ipAddress, String port);
//    Server findByIpAddressAndUsers(String ipAddress, Users users);
//    Server findByIpAddressAndPortAndUsers(String ipAddress, String port, Users users);

}
