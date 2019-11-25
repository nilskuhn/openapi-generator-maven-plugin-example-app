package com.example.demo.api.v1;

import com.example.demo.dto.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

/**
 * @author nkuhn
 */
@RestController
public class PetsController implements PetsApi{

  public ResponseEntity<Void> createPets(){
    return new ResponseEntity<>(HttpStatus.OK);
  }

  public ResponseEntity<List<Pet>> listPets(
  @Valid
  @RequestParam(value = "limit", required = false) Integer limit) {
    return ResponseEntity.ok(Collections.emptyList());
  }

  public ResponseEntity<Pet> showPetById(
  @PathVariable("petId") String petId) {
    return ResponseEntity.ok(new Pet());
  }
}
