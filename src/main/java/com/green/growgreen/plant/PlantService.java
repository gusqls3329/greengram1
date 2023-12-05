package com.green.growgreen.plant;

import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelDto;
import com.green.growgreen.plant.model.PlantSelVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class PlantService {
    private final PlantMapper mapper;
    public ResVo postPlant(PlantInsDto dto){
        int affectesRow =  mapper.insPlant(dto);
        return new ResVo(dto.getIplant());
    }
    public List<PlantSelVo> getPlantAll(PlantSelDto dto){
        return mapper.selPlantAll(dto);
    }
}
