package org.verizon.CusomerApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CusomerApi.Model.Catalog;
import org.verizon.CusomerApi.Service.CatalogService;

@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

	private final CatalogService catservice;

	@Autowired
	public CatalogController(CatalogService catservice) {
		this.catservice = catservice;
	}

	@PostMapping("/insert")
	public Catalog createCatalog(@RequestBody Catalog catalog) {
		return catservice.createCatalog(catalog);

	}

	@GetMapping("allcatalog")
	public List<Catalog> getAllCatalog() {
		return catservice.getAllCatalogs();

	}

	@GetMapping("FindBy")
	public Catalog findCatalog(@RequestBody Catalog catalog) {
		return catservice.getCatalogById(100);

	}

	@PostMapping("/update")
	public Catalog updateCatalog(@RequestBody Catalog catalog) {
		return catservice.updateCatalog(101, catalog);

	}

	@DeleteMapping
	public void deleteCatalog(@RequestBody Catalog catalog) {

	}

}
