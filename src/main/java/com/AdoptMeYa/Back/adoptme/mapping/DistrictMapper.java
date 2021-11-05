package com.AdoptMeYa.Back.adoptme.mapping;

import com.AdoptMeYa.Back.adoptme.domain.model.entity.District;
import com.AdoptMeYa.Back.adoptme.resource.CreateDistrictResource;
import com.AdoptMeYa.Back.adoptme.resource.DistrictResource;
import com.AdoptMeYa.Back.adoptme.resource.UpdateDistrictResource;
import com.AdoptMeYa.Back.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class DistrictMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public DistrictResource toResource(District model){return mapper.map(model, DistrictResource.class);}

    public District toModel(CreateDistrictResource resource)
    {
        return mapper.map(resource, District.class);
    }

    public Page<DistrictResource> modelListToPage(List<District>modelList, Pageable pageable)
    {
         return new PageImpl<>(mapper.mapList(modelList,DistrictResource.class),pageable,modelList.size());
    }
    public District toModel(UpdateDistrictResource resource)
    {
        return mapper.map(resource,District.class);
    }
}
