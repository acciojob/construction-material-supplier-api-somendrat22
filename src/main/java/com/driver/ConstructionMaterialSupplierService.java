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
        materialDatabase = new HashMap<>();
        supplierDatabase = new HashMap<>();
        nextMaterialId = 1;
        nextSupplierId = 1;
    }

    public ConstructionMaterial addConstructionMaterial(ConstructionMaterial material) {
        material.setId(nextMaterialId++);
        materialDatabase.put(material.getId(), material);
        return material;
    }

    public Supplier addSupplier(Supplier supplier) {
        supplier.setId(nextSupplierId++);
        supplierDatabase.put(supplier.getId(), supplier);
        return supplier;
    }

    public List<ConstructionMaterial> getAllMaterials() {
        return new ArrayList<>(materialDatabase.values());
    }

    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(supplierDatabase.values());
    }
}