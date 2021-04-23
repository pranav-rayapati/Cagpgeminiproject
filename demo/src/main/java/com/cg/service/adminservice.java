package com.cg.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.cg.entities.AdminUser;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
import com.cg.entities.BusOperatorRequest;
import com.cg.entities.BusRoute;

public class adminservice implements IAdminService {

	@Override
	public List<BusOperator> getAllBusOperators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusOperator> getAllBusOperatorsByRoute(String routeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BusOperatorRequest> getAllBusOperatorsRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBusTime(Bus bus, LocalTime newSourceTime, LocalTime newDestinationTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBusRoute(Bus bus, BusRoute newBusRoute) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBusFare(Bus bus, int newFare) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBus(Bus bus) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBusByOperator(String busOperatorUserName) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRevenueByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRevenueByBusRoute(String routeName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRevenueByBusOperator(String operatorUsername) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AdminUser singIn(AdminUser user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminUser singOut(AdminUser user) {
		// TODO Auto-generated method stub
		return null;
	}

}
