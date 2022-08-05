package com.rahim.server.service;

import com.rahim.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    /*
    Writing different functionalities that will be implemented
    Creating server, and it returns server
     */
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
