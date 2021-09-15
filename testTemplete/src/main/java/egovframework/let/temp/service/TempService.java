package egovframework.let.temp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface TempService {
	public TempVO selectTemp(TempVO vo) throws Exception;

	public List<EgovMap> selectList(TempVO vo) throws Exception;

	public void insert(TempVO vo) throws Exception;

	public void update(TempVO vo) throws Exception;

	public void delete(TempVO vo) throws Exception;
}
