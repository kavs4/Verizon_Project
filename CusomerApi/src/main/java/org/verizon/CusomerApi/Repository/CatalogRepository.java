package org.verizon.CusomerApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CusomerApi.Model.Catalog;


@Repository
public interface CatalogRepository extends JpaRepository<Catalog,Integer> {

}
