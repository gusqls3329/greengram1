package com.green.growgreen.todo;

import com.green.growgreen.ResVo;
import com.green.growgreen.plant.model.PlantInsDto;
import com.green.growgreen.plant.model.PlantSelDto;
import com.green.growgreen.plant.model.PlantSelVo;
import com.green.growgreen.todo.model.TodoInsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Slf4j
@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoMapper mapper;

    public ResVo postTodo(TodoInsDto dto) {
        int affectedRow = mapper.insTodo(dto);
        return new ResVo(dto.getIplant());
    }
}
