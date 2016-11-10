package com.hn.control;

/**
 * 渲染首屏
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeAction {

	@RequestMapping("index/index.action")
	public String initData(){
		//初始化首页信息
		return "index";
	}
	
	@RequestMapping("index/serachIndex.action")
	public String initData2(){
		//初始化首页信息
		return "serachIndex";
	}
}
