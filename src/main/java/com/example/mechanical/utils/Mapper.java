package com.example.mechanical.utils;

import java.util.ArrayList;
import java.util.List;

import com.example.mechanical.dtos.MaintenanceRequest;
import com.example.mechanical.dtos.MechanicalRequest;
import com.example.mechanical.dtos.MechanicalResponse;
import com.example.mechanical.dtos.ServiciosMantenimientoRequest;
import com.example.mechanical.models.Maintenance;
import com.example.mechanical.models.Mechanical;
import com.example.mechanical.models.MechanicalPK;
import com.example.mechanical.models.MaintenanceService;

public class Mapper {

	public static Maintenance mapperRequestToModelMaintenance(MaintenanceRequest maintenanceRequest) {

		Maintenance maintenance = new Maintenance();
		Mechanical mechanical = new Mechanical();
		MechanicalPK mechanicalPK = new MechanicalPK();
		maintenance.setCodigo(maintenanceRequest.getCodigo());
		maintenance.setEstado(maintenanceRequest.getEstado());
		maintenance.setFecha(maintenanceRequest.getFecha());
		mechanicalPK.setDocumento(maintenanceRequest.getMecDocumento());
		mechanicalPK.setTipoDocumento(Integer.toString(maintenanceRequest.getMecTipoDocumento()));
		mechanical.setMechanicalPK(mechanicalPK);
		maintenance.setMechanical(mechanical);

		return maintenance;
	}

	public static Mechanical mapperRequestToModelMechanical(MechanicalRequest mechanicalRequest) {

		Mechanical mechanical = new Mechanical();
		MechanicalPK mechanicalPK = new MechanicalPK();
		mechanical.setPrimerNombre(mechanicalRequest.getPrimerNombre());
		mechanical.setSegundoNombre(mechanicalRequest.getSegundoNombre());
		mechanical.setCelular(mechanicalRequest.getCelular());
		mechanical.setDireccion(mechanicalRequest.getDireccion());
		mechanical.setEmail(mechanicalRequest.getEmail());
		mechanical.setEstado(mechanicalRequest.getEstado());
		mechanical.setPrimerApellido(mechanicalRequest.getPrimerApellido());
		mechanical.setSegundoApellido(mechanicalRequest.getSegundoApellido());
		mechanicalPK.setTipoDocumento(mechanicalRequest.getTipoDocumento());
		mechanicalPK.setDocumento(mechanicalRequest.getDocumento());
		mechanical.setMechanicalPK(mechanicalPK);
		return mechanical;
	}

	public static List<MechanicalResponse> mapperModelMechanicalToResponse(
			List<MechanicalResponse> mechanicalResponse) {

		List<MechanicalResponse> mechanical = new ArrayList<>();
		for (int i = 0; i < mechanicalResponse.size(); i++) {
			mechanical.add(mechanicalResponse.get(i));
		}
		return mechanical.size() > 10 ? mechanical.subList(0, 10) : mechanical;
	}

	public static MaintenanceService mapperRequestToModelServiciosMantenimiento(
			ServiciosMantenimientoRequest serviciosMantenimientoRequest) {

		MaintenanceService serviciosMantenimiento = new MaintenanceService();
		Maintenance maintenance = new Maintenance();
		serviciosMantenimiento.setCodigo(serviciosMantenimientoRequest.getCodigo());
		serviciosMantenimiento.setTiempoEstimado(serviciosMantenimientoRequest.getTiempoEstimado());
		maintenance.setCodigo(serviciosMantenimientoRequest.getCodigoMantenimiento());
		serviciosMantenimiento.setMantenimiento(maintenance);

		return serviciosMantenimiento;
	}
}
