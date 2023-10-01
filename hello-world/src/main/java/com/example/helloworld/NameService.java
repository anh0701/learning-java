package com.example.helloworld;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class NameService {
    @Autowired
    private Map<Integer, NameModel> nameModels;
    private Integer id = 0;
    public Boolean addName(NameModel nameModel){
        if (nameModels.containsKey(nameModel.getId())){
            return false;
        }
        id = id + 1;
        nameModel.setId(id);
        nameModels.put(nameModel.getId(), nameModel);
        return true;
    }
    public List<NameModel> getAll(){
        return this.nameModels.values().stream().toList();
    }

}
