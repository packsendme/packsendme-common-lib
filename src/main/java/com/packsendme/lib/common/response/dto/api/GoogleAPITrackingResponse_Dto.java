package com.packsendme.lib.common.response.dto.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GoogleAPITrackingResponse_Dto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Map<String, RoadwayTrackingResponse_Dto> trackingRoadway = new HashMap<String, RoadwayTrackingResponse_Dto>();
	public boolean status;
	public double distance_total;
	public String distanceF;
	public int duration;
	public String durationF;

}
