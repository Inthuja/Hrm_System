package com.sgic.hrm.commons.entity.mapper;


import com.sgic.hrm.commons.dto.DistrictData;
import com.sgic.hrm.commons.entity.District;

public class DistrictMapper {
	
	public static DistrictData districtMapper(District district) {
		DistrictData districtData = new DistrictData();

		if (district != null) {
			districtData.setId(district.getId());
			districtData.setDistrictName(district.getDistrictName());
			
			
		}
			
			return districtData;
		}
		
//		public static List<DistrictData> DataMapperList(List<District> districtList){
//			List<DistrictData> districtDataList = new ArrayList<DistrictData>();
//			
//			if (districtList !=null) {
//				for (District district : districtList) {
//					districtDataList.add(districtMapper(district));
//				}
//			}
//			return districtDataList;
//	}

		

}
