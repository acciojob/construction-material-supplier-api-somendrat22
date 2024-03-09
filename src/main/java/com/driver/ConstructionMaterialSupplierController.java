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
	    	// your code goes here
	    }

	    @PostMapping("/addmaterial")
	    public ConstructionMaterial addConstructionMaterial(@RequestBody ConstructionMaterial material) {
	    	// your code goes here
	        return service.addConstructionMaterial(material);
	    }

	    @PostMapping("/addsupplier")
	    public Supplier addSupplier(@RequestBody Supplier supplier) {
	    	// your code goes here
	        return service.addSupplier(supplier);
	    }

	    @GetMapping("/materials")
	    public List<ConstructionMaterial> getAllMaterials() {
	    	// your code goes here
	        return service.getAllMaterials();
	    }

	    @GetMapping("/suppliers")
	    public List<Supplier> getAllSuppliers() {
	    	// your code goes here
	        return service.getAllSuppliers();
	    }
}
