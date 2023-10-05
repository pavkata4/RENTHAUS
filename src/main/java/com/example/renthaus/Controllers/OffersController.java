package com.example.renthaus.Controllers;


import com.example.renthaus.entity.Address;
import com.example.renthaus.entity.Property;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/offers")
public class OffersController {

    @GetMapping("/all")
    public String offers(){
        return "offers-add";
    }
//    @PostMapping("/submit")
//    public String submitForm(@RequestParam("name") String name,
//                             @RequestParam("townId")
//                             @RequestParam("file") MultipartFile file) {
//        try {
//
//            Property property = new Property();
//            property.setSquareFootage();
//            user.setEmail(email);
//            user.setProfileImage(file.getBytes()); // Store the image as a byte array
//
//            userRepository.save(user);
//
//            // Redirect to a success page
//            return "redirect:/success";
//        } catch (IOException e) {
//            // Handle exceptions (e.g., file upload errors)
//            return "redirect:/error";
//        }
    }

