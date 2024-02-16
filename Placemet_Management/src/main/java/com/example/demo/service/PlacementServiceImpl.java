package com.example.demo.service;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Placement;
import com.example.demo.repository.PlacementRepository;

@Service
public class PlacementServiceImpl implements PlacementService{

	@Autowired
	PlacementRepository placementRepository;

	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return placementRepository.save(placement);
	}

	@Override
	public List<Placement> fetchPlacementList() {
		// TODO Auto-generated method stub
		return placementRepository.findAll();
	}

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return placementRepository.findById(id).get();
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		placementRepository.deleteById(id);
	}

	@Override
	public Placement updatePlacement(Long id, Placement placement) {
		// TODO Auto-generated method stub
		Placement placemtDB = placementRepository.findById(id).get();

	       if(Objects.nonNull(placement.getName()) &&
	       !"".equalsIgnoreCase(placement.getName())) {
	           placemtDB.setName(placement.getName());
	       }

	       if (Objects.nonNull(placement.getDate())) {
	            placemtDB.setDate(placement.getDate());
	        }
	        if (Objects.nonNull(placement.getQualification()) && !"".equalsIgnoreCase(placement.getQualification())) {
	            placemtDB.setQualification(placement.getQualification());
	        }

	        if (placement.getYear() > 0) {
	            placemtDB.setYear(placement.getYear());
	        }
	     return placementRepository.save(placemtDB);
	}
	
}








