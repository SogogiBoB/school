package egovframework.let.temp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService {
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;

	@Resource(name = "tempMapper")
	private TempMapper tempMapper;
	
	@Resource(name = "egovTempIdGnrService")
	private EgovIdGnrService idgenService;

	
	@Override
	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempMapper.selectTemp(vo);
	}


	@Override
	public List<EgovMap> selectList(TempVO vo) throws Exception {
		return tempMapper.selectList(vo);
	}


	@Override
	public void insert(TempVO vo) throws Exception {
		vo.setTempId(idgenService.getNextStringId());
		tempMapper.insert(vo);
	}


	@Override
	public void update(TempVO vo) throws Exception {
		tempMapper.update(vo);
	}


	@Override
	public void delete(TempVO vo) throws Exception {
		tempMapper.delete(vo);
	}
	
	


}
