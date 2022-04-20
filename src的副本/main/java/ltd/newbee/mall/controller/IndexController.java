package ltd.newbee.mall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller

public class IndexController {
	@Resource
	private NewBeeMallIndexConfigService newBeeMallIndexConfigService;

	
//	@GetMapping("/newGoods")
//    @ResponseBody
//    public Result hello() {
//
//        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(3, 5));
//    }
//	@GetMapping("/recommendGoodses")
//	 @ResponseBody
//	    public Result recommend() {
//
//	        return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(4, 5));
//	    }
//	http://localhost:8080/Goodses
//	@GetMapping("/recommendGoodses")
	@GetMapping("/Goodses")
	 @ResponseBody
	    public Result recommend(int abs) {

	       
	       return ResultGenerator.genSuccessResult(newBeeMallIndexConfigService.getConfigGoodsesForIndex(abs, 5));
    
	}
	
	
}