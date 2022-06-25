package com.example.WeddingPlanner.registration;

import com.example.WeddingPlanner.appuser.AppUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/registration")
public class RegistrationController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<AppUser> getAppUserById(@PathVariable("id") Integer id){
        AppUser appUser = registrationService.findAppUserById(id);
        return new ResponseEntity<>(appUser, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<AppUser> updateUser(@RequestBody AppUser appUser){
        AppUser updateUser = registrationService.updateUser(appUser);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AppUser>> getAllUsers(){
        List<AppUser> users = registrationService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

