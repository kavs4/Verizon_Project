package org.verizon.CusomerApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CusomerApi.Model.Catalog;

import org.verizon.CusomerApi.Repository.CatalogRepository;

@Service
public class CatalogService {
	@Autowired
	private final CatalogRepository catrepo;

	
	public CatalogService(CatalogRepository catrepo) {
		this.catrepo=catrepo;

	}
    
	public Catalog createCatalog(Catalog catalog) {
		return catrepo.save(catalog);
	}

	public List<Catalog> getAllCatalogs() {
		return catrepo.findAll();

	}

	public Catalog getCatalogById(Integer net_id) {
		return catrepo.findById(net_id).orElse(null);

	}

	public Catalog updateCatalog(Integer net_id, Catalog catalog) {
		Catalog existingCatalog = catrepo.findById(net_id).orElse(null);
		if (existingCatalog != null) {
			existingCatalog.setNet_name(catalog.getNet_name());
			return catrepo.save(existingCatalog);
		}

		return null;

	}
	public  void deleteCatalog(Integer net_id) {
		catrepo.deleteById(net_id);
		
	}
}
