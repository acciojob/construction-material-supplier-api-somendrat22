package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/construction")
public class ConstructionMaterialSupplierController {
	private final ConstructionMaterialSupplierService service;

	@Autowired
	public ConstructionMaterialSupplierController(ConstructionMaterialSupplierService service) {
		this.service = service;
	}

	@PostMapping("/addmaterial")
	public ConstructionMaterial addConstructionMaterial(@RequestBody ConstructionMaterial material) {
		return service.addConstructionMaterial(material);
	}

	@PostMapping("/addsupplier")
	public Supplier addSupplier(@RequestBody Supplier supplier) {
		return service.addSupplier(supplier);
	}

	@GetMapping("/materials")
	public List<ConstructionMaterial> getAllMaterials() {
		return service.getAllMaterials();
	}

	@GetMapping("/suppliers")
	public List<Supplier> getAllSuppliers() {
		return service.getAllSuppliers();
	}
}