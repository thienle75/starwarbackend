package me.salisuwy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class macheteController {

    @Autowired
    macheteRespository macheteRespository;

    @GetMapping("/machete")
    public List<machete> index(){
        return macheteRespository.findAll();
    }

    @GetMapping("/machete/{id}")
    public machete show(@PathVariable String id){
        int macheteId = Integer.parseInt(id);
        return macheteRespository.findOne(macheteId);
    }

    @PostMapping("/machete")
    public machete create(@RequestBody Map<String, String, int> body){
        String ip = body.get("ip");
        String movieid = body.get("movieid");
        int order = body.get("order");
        return macheteRespository.save(new machete(ip, movieid, order));
    }

}