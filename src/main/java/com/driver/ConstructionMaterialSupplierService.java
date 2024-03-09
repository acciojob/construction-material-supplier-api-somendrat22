package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ConstructionMaterialSupplierService {
	private Map<Integer, ConstructionMaterial> materialDatabase;
    private Map<Integer, Supplier> supplierDatabase;
    private int nextMaterialId;
    private int nextSupplierId;

    public ConstructionMaterialSupplierService() {
    	// your code goes here
    }

    public ConstructionMaterial addConstructionMaterial(ConstructionMaterial material) {
    	// your code goes here
        return material;
    }

    public Supplier addSupplier(Supplier supplier) {
    	// your code goes here
        return supplier;
    }

    public List<ConstructionMaterial> getAllMaterials() {
    	// your code goes here
        return new ArrayList<>(materialDatabase.values());
    }

    public List<Supplier> getAllSuppliers() {
    	// your code goes here
        return new ArrayList<>(supplierDatabase.values());
    }
}
