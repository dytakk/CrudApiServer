package com.dytak.crudapi.Repository;


import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface PlayerRepository {

    public void savePlayer (Map<String,String> member);
    public Map<String,String> getPlayerById(Long Id);


}
