package cn.itcast.bos.service.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import cn.itcast.bos.domain.base.FixedArea;

public interface FixedAreaService {

	public void save(FixedArea model);

	public Page<FixedArea> fingPageData(Specification<FixedArea> specification,
			Pageable pageable);
	
	void associationCourierToFixedArea(FixedArea model, Integer courierId,
			Integer takeTimeId);

}
