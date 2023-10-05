package com.example.renthaus.Controllers;

import com.example.renthaus.entity.Neighborhood;
import com.example.renthaus.entity.Town;
import com.example.renthaus.services.NeighborhoodService;
import com.example.renthaus.services.TownService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/offers")
public class OffersAdd {
    private final TownService townService;

    private final NeighborhoodService neighborhoodService;

    public OffersAdd(TownService townService, NeighborhoodService neighborhoodService) {
        this.townService = townService;
        this.neighborhoodService = neighborhoodService;
    }

    @RequestMapping("/add")
    public String addOffer(Model model){

        List<Town> towns = townService.getAll().stream().toList();
        model.addAttribute("towns", towns);

        return "offer-add.html";
    }

//    @RequestMapping("/towns")
//    public String viewTowns(Model model){
//        List<Town> towns = townService.getAll().stream().toList();
//            model.addAttribute("towns", towns);
//            return "towns";
//        };


//    @PostMapping("/processForm")
//    public String processForm(@RequestParam("cityId") Long cityId) {
//        // Do something with the selected city ID, such as save it to the database
//        return "redirect:/cities";
//    }

    @GetMapping("/neighborhoods")
    @ResponseBody
    public List<Neighborhood> neighborhoods(@RequestParam("townId") long townId) {
        return neighborhoodService.findAllByCity(townService.findById(townId).get());
    }
    @GetMapping("/all")
    public String offers(){
        return "offers";
    }
}
