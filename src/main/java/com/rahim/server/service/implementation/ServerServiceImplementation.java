package com.rahim.server.service.implementation;

import com.rahim.server.enumeration.Status;
import com.rahim.server.model.Server;
import com.rahim.server.repository.ServerRepo;
import com.rahim.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;

import static com.rahim.server.enumeration.Status.SERVER_DOWN;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ServerServiceImplementation implements ServerService {

    private final ServerRepo serverRepo;

    @Override
    public Server create(Server server) {
        log.info("Saving new server: {}", server.getName());
        server.setImageUrl(setServerImageUrl());
        return serverRepo.save(server);
    }

    @Override
    public Server ping(String ipAddress) throws IOException {
        log.info("Pinging server IP: {}", ipAddress);
        // Getting server object by IP Address
        Server server = serverRepo.findByIpAddress(ipAddress);
        // pinging IP Address
        InetAddress address = InetAddress.getByName(ipAddress);
        server.setStatus(address.isReachable(10000) ? Status.SERVER_UP : SERVER_DOWN);
        // once pinged, status will be updated
        serverRepo.save(server);
        return server;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    private String setServerImageUrl() {
        return null;
    }
}