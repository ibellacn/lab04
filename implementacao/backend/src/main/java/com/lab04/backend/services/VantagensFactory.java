package com.lab04.backend.services;
//______________________________________


import com.lab04.backend.models.vantagens;
import com.lab04.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



//_____________________________________

public class vantagensFactory{ 
    
    vantagensRepository van 
    
    public void Gerarvantagens(vantagens newvantagens){
        
        return van.createvantagem(newvantagens);
    }
    public void Updatevantagens(vantagen newvantagens,float quant){
         return van.UPDATE(newvantagens, quant);
    }
}