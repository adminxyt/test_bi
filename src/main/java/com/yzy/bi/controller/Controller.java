package com.yzy.bi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yzy.bi.entiy.Dis;
import com.yzy.bi.entiy.Ds;
import com.yzy.bi.entiy.Map;
import com.yzy.bi.entiy.MapView;
import com.yzy.bi.entiy.Sk;
import com.yzy.bi.repo.DisRepo;
import com.yzy.bi.repo.DsRepo;
import com.yzy.bi.repo.MapRepo;

@RestController
@RequestMapping("bi/")
public class Controller {

	@Autowired
	private DsRepo dsRepo;
	@Autowired
	private DisRepo disRepo;
	@Autowired
	private MapRepo mapRepo;

	@RequestMapping("getDs")
	public List<Ds> getDs(@RequestParam String type) {
		return dsRepo.findByType(type);
	}

	@RequestMapping("getDis")
	public List<Dis> getDis(@RequestParam String type) {
		return disRepo.findByType(type);
	}

	@RequestMapping("getGrade")
	public List<Dis> getGrade(@RequestParam String mx) {
		return disRepo.findByMx(mx);
	}

	@RequestMapping("getAllCity")
	public List<Map> getAllCity() {
		return mapRepo.findAll();
	}

	@RequestMapping("getCityBySsStr")
	public MapView getCityBySsStr(@RequestParam String ssStr) {
		List<Map> list = mapRepo.findByLikeSs(ssStr);
		if (list == null || list.size() == 0) {
			return null;
		}
		Map map = list.get(0);
		String sy = map.getShiyi();
		String kz = map.getKezhongzhi();
		String city = map.getSs();
		String[] sys = sy.split("\\.");
		String[] kzs = kz.split("\\.");
		List<Sk> li = new ArrayList<>();
		if (sys.length < kzs.length) {
			for (int i = 0; i < kzs.length; i++) {
				if (i < sys.length) {
					li.add(new Sk(sys[i], kzs[i]));
				} else {
					li.add(new Sk("", kzs[i]));
				}

			}

		} else {

			for (int i = 0; i < sys.length; i++) {
				if (i < kzs.length) {
					li.add(new Sk(sys[i], kzs[i]));
				} else {
					li.add(new Sk(sys[i], ""));
				}
			}

		}
		MapView mv = new MapView(city, li);
		return mv;
	}

	@RequestMapping("getCityBySs")
	public MapView getCityBySs(@RequestParam String ss) {
		List<Map> list = mapRepo.findBySs(ss);
		Map map = list.get(0);
		String sy = map.getShiyi();
		String kz = map.getKezhongzhi();
		String city = map.getSs();
		String[] sys = sy.split("\\.");
		String[] kzs = kz.split("\\.");
		List<Sk> li = new ArrayList<>();
		if (sys.length < kzs.length) {
			for (int i = 0; i < kzs.length; i++) {
				if (i < sys.length) {
					li.add(new Sk(sys[i], kzs[i]));
				} else {
					li.add(new Sk("", kzs[i]));
				}

			}

		} else {

			for (int i = 0; i < sys.length; i++) {
				if (i < kzs.length) {
					li.add(new Sk(sys[i], kzs[i]));
				} else {
					li.add(new Sk(sys[i], ""));
				}
			}

		}
		MapView mv = new MapView(city, li);

		return mv;
	}
}
