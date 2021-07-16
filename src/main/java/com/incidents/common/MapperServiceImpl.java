package com.incidents.common;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MapperServiceImpl implements MapperService{

	@Autowired
	ModelMapper modelMapper;
	
	public <D> D dtoToEntity(Object s, Class<D> destination) {
		return modelMapper.map(s, destination);
	}
	
	public <S> S entityToDto(Object d, Class<S> source) {
		return modelMapper.map(d, source);
	};
	

		
}
