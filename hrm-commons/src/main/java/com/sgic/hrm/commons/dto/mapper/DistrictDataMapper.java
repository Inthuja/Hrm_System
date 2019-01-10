package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.DistrictData;
import com.sgic.hrm.commons.entity.District;
import java.util.ArrayList;
import java.util.List;
//import net.bytebuddy.asm.Advice.Return;

public class DistrictDataMapper {
	public DistrictDataMapper() {

	}

	public static District districtDataMapper(DistrictData districtData) {
		District district = new District();
//		if (districtData != null) {
			district.setId(districtData.getId());
			district.setDistrictName(districtData.getDistrictName());

//		}
		return district;
	}

//	public static List<District> districtDataMapperList(List<DistrictData> DistrictDataList){
//		List<District> districtList DistrictDataList = new ArrayList<District>();
//		
//		if (DistrictDataList != null) {
//			for (DistrictData districtData : districtDataList) {
//				districtList.add(districtDataMapper(districtData));
//			}
//		}
//		return districtList;
//		}
}
