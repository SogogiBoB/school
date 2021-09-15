package egovframework.let.temp.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.utl.fcc.service.EgovStringUtil;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class TempController {

	@Resource(name= "tempService")
	private TempService tempService;
	
	@RequestMapping(value = "/temp/select.do")
	public String select(@ModelAttribute("vo") TempVO vo, HttpServletRequest request, ModelMap model) 
	throws Exception {
		TempVO result = tempService.selectTemp(vo);
		
		System.out.println(result.getTempId());
		
		model.addAttribute("result", result);
		
		return "temp/TempSelect";
	}
	
	@RequestMapping(value = "/temp/selectMyList.do")
	public String selectList(@ModelAttribute("vo") TempVO vo, HttpServletRequest request, ModelMap model) throws Exception {
		List<EgovMap> list = tempService.selectList(vo);
		
		model.addAttribute("list", list);
		
		return "temp/TempSelectList";
	}
	
	@RequestMapping(value="/temp/regist.do")
	public String registForm(@ModelAttribute("vo") TempVO vo, HttpServletRequest request, ModelMap model) throws Exception {
		TempVO result = new TempVO();
		
		if(!EgovStringUtil.isEmpty(vo.getTempId())) {
			result = tempService.selectTemp(vo);
		}
		
		model.addAttribute("result", result);
		
		return "temp/TempRegist";
	}
	
	@RequestMapping(value="/temp/insert.do")
	public String insert(@ModelAttribute("vo") TempVO vo, HttpServletRequest request, ModelMap model) throws Exception {
		tempService.insert(vo);
		
		return "redirect:/temp/selectMyList.do";
	}
	
	@RequestMapping(value="/temp/delete.do")
	public String delete(@ModelAttribute("vo") TempVO vo, HttpServletRequest request, ModelMap model) throws Exception {
		tempService.delete(vo);
		
		return "redirect:/temp/selectMyList.do";
	}
	
	@RequestMapping(value="/temp/update.do")
	public String update(@ModelAttribute("vo") TempVO vo, HttpServletRequest request, ModelMap model) throws Exception {
		tempService.update(vo);
		
		return "redirect:/temp/selectMyList.do";
	}
	
	
}
