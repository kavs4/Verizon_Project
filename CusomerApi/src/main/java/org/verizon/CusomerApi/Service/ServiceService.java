package org.verizon.CusomerApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CusomerApi.Model.ServiceModel;
import org.verizon.CusomerApi.Repository.ServiceRepo;

@Service
public class ServiceService {

	private final ServiceRepo servicerepo;

	@Autowired
	public ServiceService(ServiceRepo servicerepo) {
		this.servicerepo = servicerepo;
	}

	public List<ServiceModel> getAllServices() {
		return servicerepo.findAll();

	}

	public ServiceModel createservicemodel(ServiceModel servicemodel) {
		return servicerepo.save(servicemodel);

	}

	public ServiceModel getServiceModelById(Integer service_id) {
		return servicerepo.findById(service_id).orElse(null);

	}

	public ServiceModel updateServiceModel(Integer service_id, ServiceModel servicemodel) {
		ServiceModel existingServiceModel = servicerepo.findById(service_id).orElse(null);
		if (existingServiceModel != null) {
			existingServiceModel.setService_name(servicemodel.getService_name());
			existingServiceModel.setTest_qos(servicemodel.getTest_qos());
			existingServiceModel.setActivity(servicemodel.getActivity());
			return servicerepo.save((existingServiceModel));

		}

		return null;

	}

	public void deleteServiceModel(Integer service_id) {
		servicerepo.deleteById(service_id);

	}

}
