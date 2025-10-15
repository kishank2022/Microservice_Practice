package com.insurance.policy.externalAPICall.service;

import java.util.Map;

public interface InsuranceService {

	public  Map<String, Object> getVehicleDetails(String rc_number, String refid);
}
