package com.incidents.common;




public interface MapperService
{

	public <D> D entityToDto(Object s, Class<D> destination);
	public <S> S dtoToEntity(Object d, Class<S> source);

}
