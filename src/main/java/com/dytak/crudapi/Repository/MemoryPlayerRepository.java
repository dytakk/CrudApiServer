package com.dytak.crudapi.Repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class MemoryPlayerRepository implements PlayerRepository{


    private final Map<String,String> member = new HashMap<>();
    @Override
    public void savePlayer(Map<String,String> playerInfo) {
        member.put("playername",playerInfo.get("playername"));
        member.put("position",playerInfo.get("position"));

    }

    @Override
    public Map<String,String> getPlayerById(Long Id) {
        return member;
    }
}
