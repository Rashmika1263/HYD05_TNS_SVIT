package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Placement;

public interface PlacementService {
	public Placement savePlacement(Placement placement);
	public List<Placement> fetchPlacementList();
	public Placement fetchPlacementById(Long id);
	public void deletePlacementById(Long id);
	public Placement updatePlacement(Long id, Placement placement);
	
}