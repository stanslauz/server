package io.getarrays.server.model;

import io.getarrays.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    private String port;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
    @Column(name="USER_ID")
    @Nullable
    private int userId;
    @ManyToOne
    @Transient
    @JoinColumn(name="USER_ID",referencedColumnName = "id",updatable = false,insertable = false)
    private Users users;

    public Server(Long id, String ipAddress, String port, String name, String memory, String type, String imageUrl, Status status) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.port = port;
        this.name = name;
        this.memory = memory;
        this.type = type;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public Server(Long id, String ipAddress, String name, String memory, String type, String imageUrl, Status status) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.name = name;
        this.memory = memory;
        this.type = type;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public Server(Long id, String ipAddress, String name, String memory, String type, String imageUrl, Status status, int userId, Users users) {
        this.id = id;
        this.ipAddress = ipAddress;
        this.name = name;
        this.memory = memory;
        this.type = type;
        this.imageUrl = imageUrl;
        this.status = status;
        this.userId = userId;
        this.users = users;
    }
}
