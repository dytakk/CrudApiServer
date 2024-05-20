package com.dytak.crudapi.Service;

import com.dytak.crudapi.Repository.MemoryPlayerRepository;
import com.dytak.crudapi.Repository.PlayerRepository;

import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class MemberService {

    private final PlayerRepository repository;

    public MemberService(MemoryPlayerRepository dbPlayerRepository){
        this.repository = dbPlayerRepository;
    }

    public void join (Map<String,String> playerInfo){
        repository.savePlayer(playerInfo);
    }

    public Map<String, String> findByUserId(Long id){
        return repository.getPlayerById(1L);



    }



}
