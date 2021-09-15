package egovframework.let.temp.service.impl;

import java.util.List;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("tempMapper")
public interface TempMapper {
	TempVO selectTemp(TempVO vo) throws Exception;

	List<EgovMap> selectList(TempVO vo) throws Exception;

	void insert(TempVO vo) throws Exception;
	
	void update(TempVO vo) throws Exception;

	void delete(TempVO vo) throws Exception;
}
