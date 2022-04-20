package ltd.newbee.mall.newbeemall.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import ltd.newbee.mall.newbeemall.dao.IndexConfigMapper;
import ltd.newbee.mall.newbeemall.entity.IndexConfig;
import ltd.newbee.mall.newbeemall.entity.NewBeeMallGoods;
import ltd.newbee.mall.newbeemall.service.NewBeeMallIndexConfigService;
import ltd.newbee.mall.vo.NewBeeMallGoodsDetailVO;
import ltd.newbee.mall.newbeemall.vo.NewBeeMallIndexCategoryVO;
import ltd.newbee.mall.newbeemall.vo.SecondLevelCategoryVO;
import ltd.newbee.mall.newbeemall.vo.ThirdLevelCategoryVO;

@Service
public class NewBeeMallIndexConfigServicelmpl implements NewBeeMallIndexConfigService {

	private IndexConfigMapper IndexConfigMapper;

// 	public List<NewBeeMallGoods> getConfigGoodsesForIndex(int configType,int number) {
	@Override
	public List<NewBeeMallGoodsDetailVO> getConfigGoodsesForIndex(int configType, int number) {

		List<IndexConfig> idxConfList = IndexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);
//		List<IndexConfig> IdxConfList = IndexConfigMapper.findIndexConfigsByTypeAndNum(configType, number);

		List<Long> ids = new ArrayList<Long>();
		// List<IndexConfig> => List<Long>
		for(IndexConfig iConf : idxConfList) {
			ids.add(iConf.getGoodsId());
		// 		return indexConfigMapper.selectByPrimaryKeys(ids);	
 		}
		
	List<NewBeeMallGoods>  entityList = IndexConfigMapper.selectByPrimaryKeys(ids);

	List<NewBeeMallGoodsDetailVO> voList = new ArrayList<NewBeeMallGoodsDetailVO>();


	for(NewBeeMallGoods entity : entityList){
		NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();

		vo.setGoodsId(entity.getGoodsId());

		vo.setGoodsName(entity.getGoodsName());

		vo.setGoodsIntro(entity.getGoodsIntro());

		vo.setGoodsCoverImg(entity.getGoodsCoverImg());

		vo.setSellingPrice(entity.getSellingPrice());

		String name = vo.getGoodsName();

		if (name.length() > 30) {
			vo.setGoodsName(name.substring(0, 30) + "...");
		}

		voList.add(vo);
	}

	return voList;

	}
//=================================================
	@Override
	public List<NewBeeMallIndexCategoryVO> getCategoriesForIndex() {
		// TODO 自動生成されたメソッド・スタブ
		Map<NewBeeMallIndexCategoryVO,SecondLevelCategoryVO> category1 = new TreeMap<>();
		Map<SecondLevelCategoryVO,ThirdLevelCategoryVO> second2 = new TreeMap<>();
		Map<ThirdLevelCategoryVO,Integer[]> third3 = new TreeMap<>();
		//商品 {  1{1,2,3},2{4,5,6},3{7,8,9,10} }
		//
		//最低级商品序号 分为三个组 用二个点（m,n）作为标记点
		//
		Integer[][] a={{15,16,59,60,61,62,63,64,65,66},{17,18,19,67,68,69}};
//		int m=3,n=4;//标记点
		
		for(int s=0;s<a.length;s++) {
			for(int s1=0;s1<a[s].length;s1++) {
				if()
				
			}
			
		
		for(IndexConfig iConf : idxConfList) {
			ids.add(iConf.getGoodsId());
		// 		return indexConfigMapper.selectByPrimaryKeys(ids);	
 		}
		
	List<NewBeeMallGoods>  entityList = IndexConfigMapper.selectByPrimaryKeys(ids);

	List<NewBeeMallGoodsDetailVO> voList = new ArrayList<NewBeeMallGoodsDetailVO>();


	for(NewBeeMallGoods entity : entityList){
		NewBeeMallGoodsDetailVO vo = new NewBeeMallGoodsDetailVO();

		vo.setGoodsId(entity.getGoodsId());

		vo.setGoodsName(entity.getGoodsName());

		vo.setGoodsIntro(entity.getGoodsIntro());

		vo.setGoodsCoverImg(entity.getGoodsCoverImg());

		vo.setSellingPrice(entity.getSellingPrice());

		String name = vo.getGoodsName();

		if (name.length() > 30) {
			vo.setGoodsName(name.substring(0, 30) + "...");
		}

		voList.add(vo);
	}

	return voList;

	}

		
		
		
		return null;
	}
	

}
