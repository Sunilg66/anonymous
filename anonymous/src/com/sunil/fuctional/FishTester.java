package com.sunil.fuctional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.sunil.fuctional.constants.FishType;
import com.sunil.fuctional.dto.FishDTO;

public class FishTester {

	public static void main(String[] args) {
		
		FishDTO dto = new FishDTO("Atlantis","Blue",FishType.SIAMESE,2,6500.00d,"M");
		FishDTO dto1 = new FishDTO("Sanchez","Red",FishType.COMMONCARP,1,2500.00d,"M");
		FishDTO dto2 = new FishDTO("Baite","Gold",FishType.GOLDFISH,3,8500.00d,"M");
		FishDTO dto3 = new FishDTO("Algae","Black",FishType.NEONTETRA,4,3700.00d,"M");
		FishDTO dto4 = new FishDTO("Larry","Green",FishType.CATFISH,1,4800.00d,"M");
		
		List<FishDTO> list = new ArrayList<FishDTO>();
		list.add(dto3);
		list.add(dto1);
		list.add(dto4);
		list.add(dto);
		list.add(dto2);
		
		Comparator<FishDTO> fishName = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		
		Collections.sort(list,fishName);
		
		Iterator<FishDTO> itr = list.iterator();
		for (Iterator iterator = list.iterator(); 
			iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("FishName : " +fishDTO.getName());
			
		}
		
		Comparator<FishDTO> fishcolor = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
			
		};
		
		Collections.sort(list,fishcolor);
		
		Iterator<FishDTO> it = list.iterator();
		while (it.hasNext()) {
			FishDTO fishDTO = (FishDTO) it.next();
			System.out.println("FishColor : " + fishDTO.getColor());
			
		}
		
		Comparator<FishDTO> fishLifeSpan = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if(o1.getLifespan() == o2.getLifespan())
					return 0;
				else if (o1.getLifespan() > o2.getLifespan())
					return 1;
				else 
				return -1;
			}

		};
		
		Collections.sort(list,fishLifeSpan);
		
		Iterator<FishDTO> iterate = list.iterator();
		for (Iterator iterator = list.iterator(); 
			iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("LifeSpan : " + fishDTO.getLifespan());
			
		}
		
		Comparator<FishDTO> lifeSpanDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if(o2.getLifespan() == o1.getLifespan())
					return 0;
				else if(o2.getLifespan() > o1.getLifespan())
					return -1;
				else 
				
				return 1;
			}
			
		};
		
		Collections.sort(list,lifeSpanDesc.reversed());
		
		Iterator itt = list.iterator();
		for (Iterator iterator = list.iterator();
				iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("Life Span Desc : " + fishDTO.getLifespan());
			
		}
		
		Comparator<FishDTO> fishnameDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				
				return o2.getName().compareTo(o1.getName());
			}
			
		};
		
		Collections.sort(list,fishnameDesc);
		
		Iterator namedesc = list.iterator();
		for (Iterator iterator = list.iterator(); 
		    iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("fish name desc : " + fishDTO.getName());
			
			
		}
			
		Comparator<FishDTO> fishcostDesc = new Comparator<FishDTO>() {

			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				if(o2.getCost() == o1.getCost())
					return 0;
				else if(o2.getCost() > o1.getCost())
					return -1;
				else 
					return 1;
			}
			
		};
		
	Collections.sort(list,fishcostDesc.reversed());
		
		Iterator fishcost = list.iterator();
		for (Iterator iterator = list.iterator();
			iterator.hasNext();) {
			FishDTO fishDTO = (FishDTO) iterator.next();
			System.out.println("FishCost Desc : " + fishDTO.getCost());
			
		}
			
		

	}

}
