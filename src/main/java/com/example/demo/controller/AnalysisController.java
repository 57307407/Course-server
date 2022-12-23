package com.example.demo.controller;

import com.example.demo.wrapper.Wrapper;
import io.github.yfblock.yfSql.Utils.DataRunnerUtil;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController()
@CrossOrigin
@RequestMapping("/analysis/api")
public class AnalysisController {
    @GetMapping("/room-actions/getRoomActionsWithTotalNumByConditionsTime")
    public Object getRoomActionsWithTotalNumByConditionsTime(){
        Map<String,Object> retMap = new HashMap<>();

        ArrayList list = new ArrayList() ;
        retMap.put("totalNum",0);
        retMap.put("roomActionList", list);
        return retMap;
    }

}